package com.hqyj.SBD.modules.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hqyj.SBD.modules.test.vo.ConfigBean;

@RestController
@RequestMapping("/api/test")
public class TestController {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);
	
	@Value("${server.port}")
	private int port;
	@Value("${com.hqyj.name}")
	private String name;
	@Value("${com.hqyj.age}")
	private int age;
	@Value("${com.hqyj.desc}")
	private String desc;
	@Value("${com.hqyj.random}")
 	private String random;
	
	@Autowired
	private ConfigBean ConfigBean;
	
	
	/**
	 * http://127.0.0.1/api/test/log
	 * @return
	 */
	@RequestMapping("/log")
	public String logTest() {
		LOGGER.trace("this is trace log");
		LOGGER.debug("this is debug log");
		LOGGER.info("this is info log");
		LOGGER.warn("this is warn log");
		LOGGER.error("this is error log.2222");
		return "this is log test.";
	}
	
	
	/**
	 * http://127.0.0.1/api/test/config
	 * @return
	 */
	@RequestMapping("/config")	
	public String configTest(){
		StringBuffer ss = new StringBuffer();
		ss.append(port).append("---")
			.append(name).append("----")
			.append(age).append("----")
			.append(desc).append("----")
			.append(random).append("----").append("<br>");
		ss.append(ConfigBean.getName()).append("---")
			.append(ConfigBean.getAge()).append("---")
			.append(ConfigBean.getDesc()).append("---")
			.append(ConfigBean.getRandom()).append("---");
		return ss.toString();
	}
	
	
	/**
	 * http://127.0.0.1/api/test/appDesc
	 * @return
	 */
	@RequestMapping("/appDesc")
	public String getAppDsc() {
		return "hello,this is Syl firstly use springboot";
	}
	
}
