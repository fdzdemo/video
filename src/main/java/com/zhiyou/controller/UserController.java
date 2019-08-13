package com.zhiyou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.zhiyou.mapper.UserMapper;
import com.zhiyou.model.User;
@RestController
public class UserController {

	@Autowired
	UserMapper u;
	@RequestMapping("save")
	public String save(User user) {
		u.save(user);
		return "hello";
	}
	
	@RequestMapping("selectAll")
	public List<User> save() {
		PageHelper.startPage(0,4);
		List<User> list = u.selectAll();
		return list;
	}
	
	@RequestMapping("delete")
	public String de(Integer id) {
		u.delete(id);
		return "删除";
	}
	
}
