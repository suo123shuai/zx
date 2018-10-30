package com.jsk.zx.login.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jsk.base.service.BaseService;
import com.jsk.zx.login.common.NoteUtil;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.login.service.ISMSVerificationService;

@Service
public class SMSVerificationServiceImpl extends BaseService implements ISMSVerificationService {

	@Override
	public ResultUtil smsYanZheng(String phone) throws Exception {
		ResultUtil resu = new ResultUtil();
		List<String> list = new ArrayList<String>();
		Integer random = (int) ((Math.random()*9+1)*100000);
		list.add(random.toString());
		String code = NoteUtil.noteCode(phone, random.toString()).getCode();
		if("OK".equals(code)){
			resu.setId(0);
			resu.setMsg("发送成功");
			resu.setData(list);
		}else{
			resu.setId(1);
			resu.setMsg("发送失败");
		}
		return resu;
	}

}
