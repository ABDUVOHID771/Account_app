package com.example.service;

import com.example.domain.PrimaryAccount;
import com.example.domain.SavingsAccount;

import java.security.Principal;

/**
 * Created by z00382545 on 10/21/16.
 */
public interface AccountService {
    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
}
