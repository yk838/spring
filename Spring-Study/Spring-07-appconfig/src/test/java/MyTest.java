import com.yk.config.YkConfig;
import com.yk.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig 上下文来获取容器， 通过配置类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(YkConfig.class);
        User getUser = context.getBean("user", User.class);//User类使用了 @Component getBean中的方法名就是类名小写
        System.out.println(getUser.getName());
    }
}