package com.tencoding.bank.repository.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {
	private Integer id;
	private String number;
	private String password;
	private Long balance;
	private Integer userId;
	private Timestamp createdAt;
	
	// 출금
	public void withdraw(Long amount) {
		this.balance -= amount;
	}
	
	// 입금
	public void deposit(Long amount) {
		this.balance += amount;
	}
	
	
	// todo
	// 패스워드 체크
	// 잔액 확인
	// 소유자 확인
	
}
