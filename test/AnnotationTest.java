import com.niit.soft.AnnotationIoCBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans01.xml");
        AnnotationIoCBean annotationIoCBean=(AnnotationIoCBean) ac.getBean("annotationIoCBean");
        annotationIoCBean.execute();
        ((AbstractApplicationContext) ac).close();



    }

}
