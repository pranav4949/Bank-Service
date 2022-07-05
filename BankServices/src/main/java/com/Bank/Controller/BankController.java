package com.Bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Model.BankModel;
import com.Bank.Service.BankService;
@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	BankService bankService;
	@GetMapping("/get")
	public ResponseEntity<List<BankModel>> allBank(){
		List<BankModel>BankList=bankService.allBank();
		return new ResponseEntity<List<BankModel>>(BankList,HttpStatus.OK);
		
	}
	@PostMapping("/post")
	public ResponseEntity<BankModel>savebank(@RequestBody BankModel bankModel){
		BankModel bankModel1=bankService.savebank(bankModel);
		return new ResponseEntity<BankModel>(bankModel1,HttpStatus.OK);
		
		
	}
	
	@PutMapping("/put/{id}")
	public ResponseEntity<BankModel>updateBank(@PathVariable String id,@RequestBody BankModel bankModel){
		BankModel bankModel1=bankService.updateBank(id,bankModel);
		return new ResponseEntity<BankModel>(bankModel1,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>deleteById(@PathVariable String id){
		String massage = bankService.deleteById(id);
		return new ResponseEntity<String>(massage,HttpStatus.OK);
	}

}
