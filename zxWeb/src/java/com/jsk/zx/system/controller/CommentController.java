package com.jsk.zx.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.jsk.zx.system.model.JskPersonComment;
import com.jsk.zx.system.model.JskSysUser;
import com.jsk.zx.system.service.IJskPersonCommentService;
import com.jsk.zx.system.service.IJskSysUserService;
import com.mltt.core.controller.BaseEntityController;

@RequestMapping
public class CommentController extends BaseEntityController<JskPersonComment, IJskPersonCommentService>{

}
