package com.hqyj.SBD.modules.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test/appDesc")
	@ResponseBody
	public String getAppDsc() {
		return "hello,this is Syl firstly use springboot";
	}
}
