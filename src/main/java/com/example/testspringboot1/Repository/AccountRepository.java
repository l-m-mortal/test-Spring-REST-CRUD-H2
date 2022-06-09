package com.example.testspringboot1.Repository;
import com.example.testspringboot1.Entity.Account;
import org.springframework.data.repository.CrudRepository;


public interface AccountRepository extends CrudRepository<Account, Integer> {



}
