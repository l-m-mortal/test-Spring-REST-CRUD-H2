package com.example.testspringboot1.Controller;

import com.example.testspringboot1.Entity.Account;
import com.example.testspringboot1.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//creating Rest Controller
@RestController
public class AccountController {

    //autowired the AccountService class
    @Autowired
    private AccountService accountService;

    //creating a get mapping that retrieves all the students detail from the database
    @GetMapping("/accounts")
    private List<Account> getAllAccounts()
    {
        return accountService.getAllAccounts();
    }

    //creating a get mapping that retrieves the detail of a specific account
    @GetMapping("/accounts/{id}")
    private Account getAccount(@PathVariable("id") int id)
    {
        return accountService.getAccountById(id);
    }
    //creating a delete mapping that deletes a specific account
    @DeleteMapping("/accounts/{id}")
    private void deleteAccount(@PathVariable("id") int id)
    {
        accountService.delete(id);
    }
    //creating post mapping that post the account detail in the database
    @PostMapping("/accounts")
    private int saveStudent(@RequestBody Account account)
    {
        accountService.saveOrUpdate(account);
        return account.getId();
    }
}
