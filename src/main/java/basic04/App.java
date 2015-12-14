package basic04;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
//basic04_config.xml 설정파일이 basic04 패키지에만 사용할려면 패키지 안에 위치해도 되지만 만약 다른 패키지에서도 사용할려면
//만든 resources폴도에 위치하는 것이 가장 좋다.(Spring 구조에보면 java와 resources로 나눠져있기때문에....)
public class App {
	public static void main(String[] args){
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("basic04_config.xml"));//spring 클래스임
		//XmlBeanFactory요즘에는 이 클래스를 사용하지 않는다.
		ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:basic04_config.xml");//이게 요즘 사용하는 방식
		MessageBean bean = factory.getBean("msgKr", MessageBean.class);//getBean메서드는 xml에 선언한 인스턴스를 불러와줌다. 
		bean.sayHello("홍길동");
		
		bean = factory.getBean("msgEn", MessageBean.class);
		bean.sayHello("홍길동");
	}
}
