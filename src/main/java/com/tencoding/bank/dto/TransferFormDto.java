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

	private Long amount; 
	private String wAccountNumber;
	private String wAccountPassword; 
	private String dAccountNumber;
	
}
