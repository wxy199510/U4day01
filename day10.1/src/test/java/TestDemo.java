import cn.kgc.demo.pojo.Emp;
import cn.kgc.demo.service.DemoService;
import cn.kgc.demo.service.impl.DemoServiceImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

//指定在单元测试启动的时候创建spring的工厂类对象
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
//RunWith的value属性指定以spring test的SpringJUnit4ClassRunner作为启动类
//如果不指定启动类，默认启用的junit中的默认启动类
@RunWith(value = SpringJUnit4ClassRunner.class)
public class TestDemo {

    private ApplicationContext app;

    @Autowired
    private DemoService demoService;

    @Before
    public void first(){
        app = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    //SqlSessionFactory创建、单例模式
    @Test
    public void test01(){
        SqlSessionFactory sql1 = app.getBean("sqlSessionFactory", SqlSessionFactory.class);
        SqlSessionFactory sql2 = app.getBean("sqlSessionFactory", SqlSessionFactory.class);
        System.out.println("sql1 = " + sql1);
        System.out.println("sql2 = " + sql2);
    }

    @Test
    public void test02() throws Exception{
        Emp emp = new Emp();
        emp.setEname("迪丽热巴");
        emp.setEpay(2f);
        emp.setEstartime(new Date());
        emp.setEsex("女");
        emp.setDid(1);
        String result = demoService.removeEmp(19, emp);
        System.out.println("result = " + result);
    }

}
