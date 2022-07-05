package com.Bank.Model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class BankModel {
	
	
	@MongoId
	private String id;
	private String fname;
	private String lname;
	private String mobile;
	private String email;
	private String account;

}
