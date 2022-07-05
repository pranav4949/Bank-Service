package com.Bank.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Bank.Model.BankModel;

public interface BankRepository extends MongoRepository<BankModel, String> {

}
