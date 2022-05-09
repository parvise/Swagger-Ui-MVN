package com.swagger.ui.springboot.controller;

import org.springframework.stereotype.Component;

import lombok.NonNull;

@Component
public class MessageDtoService {

	public MessageDTO getSubscriptionMessage(@NonNull String user) {

		MessageDTO message = new MessageDTO();
		message.setId(1);
		message.setMessage("Hello " + user + ", Thanks for the subscription!");
		message.setType("Phone");

		int x = UtilityClassExample.addSomething(5);
		System.out.println(x);

		x = UtilityClassExample.addS(5);
		System.out.println(x);
		return message;
	}
}
