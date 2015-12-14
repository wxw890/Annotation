package basic06;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class App {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext factory = new FileSystemXmlApplicationContext("classpath:basic06_config.xml");//import태그 이용방법
		MessageBean bean = factory.getBean("msg", MessageBean.class);//getBean을 통해 msg는 id, MessageBean클래스 인터페이스를 상속한 
		bean.sayHello();
		//factory.close();
		
		//DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		//new XmlBeanDefinitionReader((BeanDefinitionRegistry)factory).loadBeanDefinitions(new FileSystemResource("basic06_config.xml"));//ApplicationContext사용안하면 이렇게 힘들다는 것이다.
		//factory.addBeanPostProcessor(new CustomBeanPostProcessor());// 순서 5,8실행하기 위해서 필요함 , 즉,BeanPostProcessort실행
		//MessageBean bean = factory.getBean("msg", MessageBean.class);
		//bean.sayHello();
		
	}

}
