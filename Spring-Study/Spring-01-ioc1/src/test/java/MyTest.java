import com.yk.service.UserService;
import com.yk.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
      //获取ApplicationContext ,拿到spring容器
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
        //容器在手，需要什么，就直接get什么！
        UserServiceImpl userServiceImpl = (UserServiceImpl)Context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}