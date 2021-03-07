import com.yuan.dao.UserMapper;
import com.yuan.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper2 = (UserMapper) context.getBean("userMapper2");
        for (User user : userMapper2.selectUser()) {
            System.out.println(user);
        }
    }

}
