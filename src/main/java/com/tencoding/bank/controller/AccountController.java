package com.tencoding.bank.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tencoding.bank.handler.exception.CustomPageException;

@Controller
@RequestMapping("/account")
public class AccountController {
	@GetMapping("/list")
	public String list() {
		return "account/list";
//		throw new CustomPageException("페이지가 업읍이다", HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/save")
	public String save() {
		return "account/save";
	}
	
	@GetMapping("/deposit")
	public String deposit() {
		return "account/deposit";
	}
	
	@GetMapping("/transfer")
	public String transfer() {
		return "account/transfer";
	}
	
	@GetMapping("/detail")
	public String detail() {
		return "account/detail";
	}
}
