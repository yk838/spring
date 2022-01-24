import com.yk.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象！
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在spring中的管理了，我们要使用，直接去里面取出来试就可以了！
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}