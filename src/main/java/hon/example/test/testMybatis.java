package hon.example.test;

import hon.example.dao.AccountDao;
import hon.example.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMybatis {
    /*
        测试查询方法findAll()
     */
    @Test
    public void run() throws IOException {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        List<Account> list = dao.findAll();
        for (Account account :list){
            System.out.println(account);
        }

        session.close();
        inputStream.close();
    }

    /*
        测试插入方法saveAccount()
     */
    @Test
    public void run2() throws IOException {

        //创建Account对象
        Account newAccount = new Account();
        newAccount.setName("西西");
        newAccount.setMoney(5000d);
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        //增！
        dao.saveAccount(newAccount);

        //提交事务
        session.commit();

        session.close();
        inputStream.close();
    }
}
