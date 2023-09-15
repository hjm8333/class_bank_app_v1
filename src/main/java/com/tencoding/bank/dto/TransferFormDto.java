package com.tencoding.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TransferFormDto {

	private String number;
	private String number2;
	private String password;
	private String amount;
	
}
