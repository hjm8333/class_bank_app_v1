package com.tencoding.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
	@GetMapping("/list")
	public String list() {
		return "account/list";
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
