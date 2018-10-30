package com.jsk.zx.sys.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsk.zx.index.model.JskIndexNews;
import com.jsk.zx.sys.index.service.IJskIndexNewsService;
import com.mltt.core.controller.BaseEntityController;

/**
 * @Title: JskIndexNewsController.java
 * @Description: 消息管理
 * @author: lizp
 * @date: 2018年7月30日 下午9:40:04
 */
@Controller("JskIndexNewsController")
@RequestMapping("/secure/news")
public class JskIndexNewsController extends BaseEntityController<JskIndexNews, IJskIndexNewsService> {
}
