package by.tut.kaa.alexander.bbp.account.service.util;

import by.tut.kaa.alexander.bbp.account.repository.model.Account;
import by.tut.kaa.alexander.bbp.account.service.modelDTO.AccountDTO;
import org.springframework.stereotype.Component;

@Component
public class AccountConverter {

    public Account convert(AccountDTO accountDTO) {
        Account account = new Account();
        account.setAccount(accountDTO.getAccount());
        account.setAccountId(accountDTO.getAccountId());
        return account;
    }

    public AccountDTO convert(Account account) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setAccountId(account.getAccountId());
        accountDTO.setAccount(account.getAccount());
        accountDTO.setUserId(account.getUser().getUserId());
        return accountDTO;
    }
}
