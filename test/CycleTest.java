import com.niit.cycle.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CycleTest {
    public static void main(String[] args){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        Student stu=(Student) ac.getBean("stu");
        stu.executeStudent();
        ((ClassPathXmlApplicationContext) ac).close();
//        ((AbstractApplicationContext)ac).close();
        System.out.println(stu);
    }
}
