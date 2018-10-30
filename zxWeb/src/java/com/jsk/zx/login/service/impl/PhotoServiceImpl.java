package com.jsk.zx.login.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.jsk.base.service.BaseService;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.login.mapper.JskSysAnnexMapper;
import com.jsk.zx.login.model.JskSysAnnex;
import com.jsk.zx.login.service.IPhotoService;

@Service
public class PhotoServiceImpl extends BaseService implements IPhotoService {

	@Autowired
	JskSysAnnexMapper jskSysAnnexMapper;

	@Override
	/**
	 * addPhotoGetPkID方，    添加图片并返回该图片的PkId
	 */
	public ResultUtil addPhotoGetPkID(MultipartFile file, String type,
			HttpServletRequest request) throws Exception {
		ResultUtil resu = new ResultUtil();
		// 判断图片类型和图片类型是否为空
		if (("head".equals(type) || "id".equals(type) || "shop".equals(type) || "license"
				.equals(type)) || !StringUtils.isEmpty(file)) {
			String fileUrl = uploadFile(file, type, request);
			JskSysAnnex jskSysAnnex = new JskSysAnnex();
			jskSysAnnex.setFileName(type);
			jskSysAnnex.setFilePath(fileUrl);
			try {
				List<Integer> list = new ArrayList<Integer>();
				jskSysAnnex.setCreateTime(new Date());
				int i = jskSysAnnexMapper.insertSelective(jskSysAnnex);
				if (i != 0) {
					resu.setId(1);
					list.add(jskSysAnnex.getPkId());
					resu.setData(list);
					resu.setMsg("图片添加成功,data数值表示图片的pkId");
				} else {
					resu.setId(0);
					resu.setMsg("图片添加失败");
				}
			} catch (Exception e) {
				resu.setId(2);
				resu.setMsg("图片添加异常");
				e.printStackTrace();
			}
			return resu;
		}
		resu.setId(3);
		resu.setMsg("图片类型或数据未空");
		return resu;
	}

	private String uploadFile(MultipartFile files, String type,
			HttpServletRequest request) {
		// 本地项目路径
		String filePath = request.getSession().getServletContext()
				.getRealPath("upload/" + type + "img");
		String returnUrl = request.getScheme() + "://"
				+ request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath() + "/upload/" + type + "img";
		// 新的文件名
		String fileName = new Date().getTime() + ""
				+ (int) ((Math.random() * 9 + 1) * 100000)+".png";
		// 文件夹名字根据日期：年和月 201806
		String fileAdd = new SimpleDateFormat("yyyyMM").format(new Date());
		byte[] bytes = null;
		try {
			bytes = files.getBytes();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 先判断文件是否存在 没有则创建
		File file1 = new File(filePath + "/" + fileAdd);
		System.out.println(file1);
		if (!file1.exists()) {
			file1.mkdirs();
		}
		// 写入服务器
		try {
			FileOutputStream out = new FileOutputStream(file1 + "/" + fileName);
			out.write(bytes);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return returnUrl + "/" + fileAdd + "/" + fileName;
	}
}
