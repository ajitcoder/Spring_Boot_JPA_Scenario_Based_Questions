package com.ajit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajit.entity.Account;

public interface IAccountRepository extends JpaRepository<Account, Integer> {

}