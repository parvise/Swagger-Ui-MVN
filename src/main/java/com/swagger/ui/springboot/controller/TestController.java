package com.swagger.ui.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {

	@Autowired
	private MessageDtoService service;

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public String test() {
		return "Testing";
	}

	@GetMapping(value = "/lombok")
	public MessageDTO dto() {
		MessageDTO dto = service.getSubscriptionMessage("Test");
		log.info("Test:::" + dto);
		return dto;
	}
}
