package net.javaguides.banking.sevice;

import net.javaguides.banking.dto.AccountDto;


public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

  AccountDto deposit(Long id,double amount);
  AccountDto withdraw(Long id, double amount);
}
