package basic07;

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
		ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:basic07_config.xml");//이게 요즘 사용하는 방식
		MessageBean bean = factory.getBean("messageBeanKr", MessageBean.class);//바코드를 스캔해서 사용할수 있다. 그리고 id명은 크래스 처 글자 소문자(클래스명)으로 설정해준다. 
		bean.sayHello("홍길동");
		
		bean = factory.getBean("msgEn", MessageBean.class); //msgEn이라는 명은 바코드에 따로 원하는 명을 명시했기 때문에 가능하다.
		bean.sayHello("홍길동");
	}
}
