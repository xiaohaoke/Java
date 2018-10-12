import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static_factory.Bean2;

public class instanceTest1 {
public static void main(String[] args) {

        String xmlpath = "beans1.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlpath);
        Bean1 bean1 = (Bean1) applicationContext.getBean("Bean1");
        //System.out.println(bean1);
    //
    //
         String xmlpath1 = "beans2.xml";
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext(xmlpath1);
        Bean2 bean2 = (Bean2) applicationContext1.getBean("bean");
        //System.out.println(bean1);

}


}
