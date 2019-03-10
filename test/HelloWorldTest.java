import com.niit.soft.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.niit.soft.HelloWorld;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.FileSystemResource;

public class HelloWorldTest {
    public static void main(String[] args){
//        读取配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
//        BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("D:/ideaCode/myfirstSpringStudy/myFirstSpring/src/beans.xml"));

//        读取名为myCar的bean
//        Car car1=ac.getBean("myCar",Car.class);
//        System.out.print(car1);
//
//        Boss boss=(Boss)ac.getBean("boss");
//        System.out.println(boss);
//        Boss boss01=(Boss)ac.getBean("boss01");
//        System.out.println(boss01);
//      读取名为hello的bean
//        HelloWorld h=(HelloWorld) ac.getBean("hello");
//        HelloWorld h=(HelloWorld) beanFactory.getBean("hello");
//        h.sayHello();

//        读取通过静态工厂实例化的car
//        Car myCar=ac.getBean("myCar03",Car.class);
//        System.out.println(myCar);
//
//        Boss boss2=(Boss) ac.getBean("boss02");
//        System.out.println(boss2);


        User user=(User) ac.getBean("user");
        System.out.println(user.getName());
        System.out.println(user);
        User user01=(User) ac.getBean("user");
        System.out.println(user.getName());
        System.out.println(user01);


        User user02=(User) ac.getBean("user01");
        System.out.println(user02.getName());
        System.out.println(user02);
        User user03=(User) ac.getBean("user01");
        System.out.println(user03.getName());
        System.out.println(user03);
    }
}
