package hon.example.test;

import hon.example.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {

    /*
        测试accountService实现类
     */
    @Test
    public void run1(){
        //加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = ac.getBean(AccountService.class);
        accountService.findAll();
    }

}
