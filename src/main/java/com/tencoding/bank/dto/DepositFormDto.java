package com.tencoding.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DepositFormDto {
	
	private Long amount;
	private String dAccountNumber;  
	
}
