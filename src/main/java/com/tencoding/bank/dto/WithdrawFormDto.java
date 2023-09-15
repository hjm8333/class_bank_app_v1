package com.tencoding.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WithdrawFormDto {

	private String number;
	private String password;
	private String amount;
	
}
