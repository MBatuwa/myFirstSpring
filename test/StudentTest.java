import com.niit.soft.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    public static void main(String[] args){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        Student stu=(Student) ac.getBean("student");
        System.out.println(stu);

        Student stu01=(Student) ac.getBean("student01");
        System.out.println(stu01);
    }

}
