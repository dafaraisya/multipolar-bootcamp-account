package com.multipolar.bootcamp.account.service;

import com.multipolar.bootcamp.account.domain.Account;
import com.multipolar.bootcamp.account.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    public Optional<Account> getAccountById(String id) {
        return accountRepository.findById(id);
    }

    public Account createOrUpdateAccount(Account account) {
        return accountRepository.save(account);
    }

    public void deleteAccountById(String id) {
        accountRepository.deleteById(id);
    }
}
