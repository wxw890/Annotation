package basic08;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//basic04_config.xml 설정파일이 basic04 패키지에만 사용할려면 패키지 안에 위치해도 되지만 만약 다른 패키지에서도 사용할려면
//만든 resources폴도에 위치하는 것이 가장 좋다.(Spring 구조에보면 java와 resources로 나눠져있기때문에....)
public class App {
	public static void main(String[] args){
		//ApplicationContext  ctx= new FileSystemXmlApplicationContext("classpath:basic05_config2.xml"); //실제 인스턴스를 생성하도록 명령한는 명령어
		
		//String[] conf={"classpath:basic05_config.xml", "classpath:basic05_config2.xml"};//배열을 이용한 첫번째 방법
		//ApplicationContext  ctx= new FileSystemXmlApplicationContext(conf);
		
		
		ApplicationContext  ctx= new AnnotationConfigApplicationContext(ApplicationContext.class);//import태그 이용방법 , ApplicationContext은 bean을 가져오는것,
																									 //FileSystemXmlApplicationContext는 파일의 로드하기 위해서 사용하는 것
		MessageBean bean=ctx.getBean("getMessageImpl", MessageBean.class);
		bean.sayHello();
		
		bean = ctx.getBean("getMessageEn", MessageBean.class);
		bean.sayHello();
	}
}
