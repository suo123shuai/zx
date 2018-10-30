/**
 * 
 */
package com.jsk.base.util;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.jsk.zx.sys.model.JskSysAnnex;
import com.mltt.core.util.DateUtil;
import com.mltt.core.util.PropertiesUtil;

/**
 * @Title: FileUploadUtil.java
 * @Description: 上传文件工具类
 * @author: lizp
 * @date: 2018-7-27 上午10:12:09
 */
public class FileUtil {

	public static final String FILE_PATH_PREFIX = PropertiesUtil.getProperty("file.path.prefix");

	public static final String FILE_PATH_SUFFIX_INDEX = PropertiesUtil.getProperty("file.path.suffix.index");

	private static Logger logger = LoggerFactory.getLogger(FileUtil.class);

	public static JskSysAnnex upload(String path, MultipartFile multipartFile) {
		JskSysAnnex jskSysAnnex = null;
		if (!multipartFile.isEmpty()) {
			mkdirs(path);
			jskSysAnnex = new JskSysAnnex();
			jskSysAnnex.setFileName(getReName());
			jskSysAnnex.setFileOriginalName(getPrefix(multipartFile.getOriginalFilename()));
			String fileName = jskSysAnnex.getFileName() + getSuffix(multipartFile.getOriginalFilename());
			jskSysAnnex.setFilePath(getSavePath(FILE_PATH_SUFFIX_INDEX) + fileName);
			jskSysAnnex.setFileSuffix(getSuffix(multipartFile.getOriginalFilename()));
			jskSysAnnex.setFileSize(Long.valueOf(multipartFile.getSize()).intValue());
			path += fileName;
			File file = new File(path);
			try {
				multipartFile.transferTo(file);
			} catch (IllegalStateException e) {
				logger.error("附件上传错误，错误信息：" + e);
			} catch (IOException e) {
				logger.error("附件上传错误，错误信息：" + e);
			}
		}
		return jskSysAnnex;
	}

	/**
	 * @Title: getPath
	 * @Description: 获取路径
	 * @author: lizp
	 * @date: 2018年7月27日
	 * @param suffix
	 * @return
	 */
	public static String getPath(String suffix) {
		/*return FILE_PATH_PREFIX + File.separator + suffix + File.separator + DateUtil.getDateStr(new Date(), "yyyyMM")
				+ File.separator;*/
		return getRealPath(suffix);
	}

	/**
	 * @Title: getSavePath
	 * @Description: 保存到数据库地址
	 * @author: lizp
	 * @date: 2018年8月2日 
	 * @param suffix
	 * @return
	 */
	public static String getSavePath(String suffix) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		String returnUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath() + "/" + "upload" + "/" + suffix + "img" + "/";
		return returnUrl + DateUtil.getDateStr(new Date(), "yyyyMM") + "/";
	}
	
	/**
	 * @Title: getRealPath
	 * @Description: 获取真实路径，从盘符开始，用户上传附件地址
	 * @author: lizp
	 * @date: 2018年8月2日 
	 * @param suffix
	 * @return
	 */
	public static String getRealPath(String suffix) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		return request.getSession().getServletContext().getRealPath("upload" + File.separator + suffix + "img") + File.separator + DateUtil.getDateStr(new Date(), "yyyyMM") + File.separator;
	}

	/**
	 * @Title: getReName
	 * @Description: 获得重命名之后的文件名，文件名格式：yyyyMMddHHmmss_随机数
	 * @author: lizp
	 * @date: 2018-7-27
	 * @return
	 */
	public static String getReName() {
		return DateUtil.getDateStr(new Date(), "yyyyMMddHHmmss") + "_" + (int) ((Math.random() * 9 + 1) * 100000);
	}

	/**
	 * @Title: delete
	 * @Description: 删除文件
	 * @author: lizp
	 * @date: 2018-7-27
	 * @param path
	 * @throws Exception
	 */
	public static void delete(String path) {
		File file = new File(path);
		if (file.exists()) {
			file.delete();
		} else {
			logger.warn("路径为：" + path + "的文件不存在");
		}
	}

	/**
	 * @Title: conversionFileNameGBKToIso
	 * @Description: 文件名GBK转换成ISO
	 * @author: lizp
	 * @date: 2018-7-27
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	public static String conversionFileNameGBKToIso(String fileName) throws Exception {
		try {
			if (logger.isInfoEnabled()) {
				logger.info("文件名转换之前：" + fileName);
			}
			fileName = new String(fileName.getBytes("GBK"), "iso8859-1");
			if (logger.isInfoEnabled()) {
				logger.info("文件名转换之后：" + fileName);
			}
		} catch (UnsupportedEncodingException e) {
			throw new Exception("文件名格式转换错误");
		}
		return fileName;
	}

	/**
	 * @Title: conversionFileNameIsoToGBK
	 * @Description: 文件名ISO转换成GBK
	 * @author: lizp
	 * @date: 2018-7-27
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	public static String conversionFileNameIsoToGBK(String fileName) throws Exception {
		try {
			if (logger.isInfoEnabled()) {
				logger.info("文件名转换之前：" + fileName);
			}
			fileName = new String(fileName.getBytes("iso8859-1"), "GBK");
			if (logger.isInfoEnabled()) {
				logger.info("文件名转换之后：" + fileName);
			}
		} catch (UnsupportedEncodingException e) {
			throw new Exception("文件名格式转换错误");
		}
		return fileName;
	}

	/**
	 * @Title: getSuffix
	 * @Description: 获取文件后缀
	 * @author: lizp
	 * @date: 2018-7-27
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	public static String getSuffix(String fileName) {
		return fileName.substring(fileName.lastIndexOf("."));
	}

	/**
	 * @Title: getPrefix
	 * @Description: 获取没有后缀名的文件名
	 * @author: lizp
	 * @date: 2018-7-27
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	public static String getPrefix(String fileName) {
		return fileName.substring(0, fileName.lastIndexOf("."));
	}

	/**
	 * @Title: mkdirs
	 * @Description: 创建目录
	 * @author: lizp
	 * @date: 2018-7-29
	 * @param dirPath
	 */
	private static void mkdirs(String dirPath) {
		File file = new File(dirPath);
		if (!file.exists()) {
			file.mkdirs();
		}
	}

}
