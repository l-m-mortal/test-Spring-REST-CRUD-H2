package com.example.testspringboot1.Service;

import com.example.testspringboot1.Entity.Account;
import com.example.testspringboot1.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    //getting all account records
    public List<Account> getAllAccounts()
    {
        List<Account> accounts = new ArrayList<Account>();
        accountRepository.findAll().forEach(account -> accounts.add(account));
        return accounts;
    }

    //getting a specific record
    public Account getAccountById(int id)
    {
        return accountRepository.findById(id).get();
    }
    //Saving or updating
    public void saveOrUpdate(Account account)
    {
        accountRepository.save(account);
    }
    //deleting a specific record
    public void delete(int id)
    {
        accountRepository.deleteById(id);
    }
}
