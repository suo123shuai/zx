/**
 * 
 */
package com.jsk.zx.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsk.zx.person.model.JskPersonMarket;
import com.jsk.zx.person.service.IPersonMarketService;
import com.mltt.core.controller.BaseEntityController;

/**
 * @Title: JskPersonMarketController.java
 * @Description: 积分商城 
 * @author: lizp
 * @date: 2018年8月1日 上午1:19:49
 */
@Controller
@RequestMapping(value="/secure/market")
public class JskPersonMarketController extends BaseEntityController<JskPersonMarket, IPersonMarketService> {

}
