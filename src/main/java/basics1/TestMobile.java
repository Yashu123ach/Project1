package basics1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestMobile {
	public static void main(String[] args) {
//		ClassPathResource resource=new ClassPathResource("ioc1.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(resource);
//		Mobile m1=(Mobile) beanFactory.getBean("mymobile");
//		m1.musicPlayer();
//		Mobile m2=(Mobile) beanFactory.getBean("mymobile");
//		m2.musicPlayer();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");
		Mobile m1=(Mobile) context.getBean("mymobile");
		m1.musicPlayer();
		
	}

}
