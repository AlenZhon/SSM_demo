package hon.example.service.impl;

import hon.example.dao.AccountDao;
import hon.example.domain.Account;
import hon.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
AccountService 实现类
 */
@Service("accountService")
public class AccountServiceimpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层： 查询所有账户信息...");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户中...");
        accountDao.saveAccount(account);
    }


}
