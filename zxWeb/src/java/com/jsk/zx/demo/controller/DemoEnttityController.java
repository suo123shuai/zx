/**
 * 
 */
package com.jsk.zx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsk.zx.demo.model.DemoEntity;
import com.jsk.zx.demo.service.IDemoEntityService;
import com.mltt.core.controller.BaseEntityController;

/**
 * @Title: DemoEnttityController.java
 * @Description: TODO
 * @author: lizp
 * @date: 2018年7月11日 下午6:01:55
 */
@Controller
@RequestMapping("/secure/demoEntity")
public class DemoEnttityController extends BaseEntityController<DemoEntity, IDemoEntityService> {
}
