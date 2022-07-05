package com.Bank.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.Model.BankModel;
import com.Bank.Repository.BankRepository;

@Service
public class BankService {
	@Autowired
	BankRepository bankRepository;

	public List<BankModel> allBank() {
		List<BankModel>bankList=bankRepository.findAll();
		return bankList;
	}

	public BankModel savebank(BankModel bankModel) {
		bankRepository.save(bankModel);
		return bankModel;
	}

	public BankModel updateBank(String id, BankModel bankModel) {
		Optional<BankModel> bankModel1=bankRepository.findById(id);
		BankModel bankModel2=bankModel1.get();
		bankModel2.setEmail(bankModel.getEmail());
		bankModel2.setFname(bankModel.getFname());
		bankModel2.setLname(bankModel.getLname());
		bankModel2.setAccount(bankModel.getAccount());
		bankModel2.setMobile(bankModel.getMobile());
		bankModel2.setId(bankModel.getId());
		
		return bankModel2;
	}

	public String deleteById(String id) {
		bankRepository.deleteById(id);
		return "bank detail deleted successfully";
	}


}
