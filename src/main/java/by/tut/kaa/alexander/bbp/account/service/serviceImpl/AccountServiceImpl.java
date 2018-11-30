package by.tut.kaa.alexander.bbp.account.service.serviceImpl;

import by.tut.kaa.alexander.bbp.account.repository.AccountRepository;
import by.tut.kaa.alexander.bbp.account.repository.model.Account;
import by.tut.kaa.alexander.bbp.account.service.AccountService;
import by.tut.kaa.alexander.bbp.account.service.modelDTO.AccountDTO;
import by.tut.kaa.alexander.bbp.account.service.util.AccountConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountConverter accountConverter;

    @Autowired
    AccountRepository accountRepository;

    public Long save(AccountDTO accountDTO) {
        Account account = accountConverter.convert(accountDTO);
        accountRepository.save(account);
        return account.getAccountId();
    }
}
