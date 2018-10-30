/**
 * 
 */
package com.jsk.zx.sys.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsk.zx.sys.index.model.JskSysIndexProduct;
import com.jsk.zx.sys.index.service.IJskIndexProductService;
import com.mltt.core.controller.BaseEntityController;
/**
 * @title:JskIndexProductController.java
 * @Description:商品管理
 * @author: liuyan
 * @date:2018年7月31日
 */

@Controller("JskIndexProductController")
@RequestMapping("/secure/product")
public class JskIndexProductController extends BaseEntityController<JskSysIndexProduct, IJskIndexProductService>{

}