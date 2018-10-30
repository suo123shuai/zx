package com.jsk.zx.pay.service.Impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.zx.pay.common.ResuUtil;
import com.jsk.zx.pay.mapper.JskOrderDetailMapper;
import com.jsk.zx.pay.mapper.JskUserNewsMapper;
import com.jsk.zx.pay.mapper.NewsMapper;
import com.jsk.zx.pay.model.JskIndexNews;
import com.jsk.zx.pay.model.JskIndexUserNews;
import com.jsk.zx.pay.model.JskPersonOrderDetail;
import com.jsk.zx.pay.model.MaiJiaId;
import com.jsk.zx.pay.service.IPaySucceedNewsSaveService;

@Service
public class PaySucceedNewsSaveServiceImpl implements
		IPaySucceedNewsSaveService {

	@Autowired
	private NewsMapper newsMapper;
	@Autowired
	private JskOrderDetailMapper orderDetailMapper;
	@Autowired
	private JskUserNewsMapper userNewsMapper;
	
	@Override
	public ResuUtil savePaySuccedNews(String orderId, String type, Integer userId) {
		JskIndexNews news = new JskIndexNews();
		JskIndexUserNews userNews = new JskIndexUserNews();
		Map<String, Object> map = new HashMap<String, Object>();
		JskPersonOrderDetail prderd = orderDetailMapper.selectByKey(orderId);
		map.put("pkId", prderd.getRecordId());
		map.put("type", type);
		MaiJiaId maiJiaId = orderDetailMapper.selectMaiJiaId(map);
		Date date = new Date();
		news.setTitle("发货通知");
		news.setContent("有新订单");
		news.setCreateId(userId);
		news.setCreateTime(date);
		news.setType("2");
		int i = newsMapper.saveNewsByKey(news);
		userNews.setCreateTime(date);
		userNews.setUserId(maiJiaId.getCreateId());
		userNews.setNewsId(news.getPkId());
		userNewsMapper.insertSelective(userNews);
		return null; 
	}
}