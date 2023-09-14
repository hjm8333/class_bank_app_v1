package com.tencoding.bank.repository.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
	
	private Integer id;
	private String username;
	private String password;
	private String fullname;
	private Timestamp CreatedAt;

}
