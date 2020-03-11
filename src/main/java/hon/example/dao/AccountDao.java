package hon.example.dao;

import hon.example.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
Account DAO interface
 */
@Repository
public interface AccountDao {

    //查询所有用户
    @Select("select * from account")
    public List<Account> findAll();

    //保存账户信息
    @Insert("insert into account (name, money) values (#{name}, #{money})")
    public void saveAccount(Account account);
}