package basic06;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBeanImpl implements MessageBean, BeanNameAware,
	BeanFactoryAware, InitializingBean, DisposableBean{

	private String name;
	private int age;
	private String greeting;
	
	public MessageBeanImpl(){}
	public MessageBeanImpl(String name, int age, String greeting){
		this.name = name;
		this.age = age;
		this.greeting = greeting;
		System.out.println("1번째로 생성자가 호출");
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("2번째로 setter 메서드 호출");
	}
	
	
	
	@Override
	public void sayHello() {//우리가 호출하기때문에 순서에 넣을 수 없다.
		// TODO Auto-generated method stub
		String msg = greeting + "~~" + name+"님! 이제 당신은" + age + "살 입니다.";
		System.out.println(msg);//화면에 출력하는 코드
		//Outputter = outputter = new FileOutputter();
	
	}
	@Override
	public void destroy() throws Exception {//DisposableBean
		// TODO Auto-generated method stub
		System.out.println("오버라이딩 된 종료 메서드");
		
	}
	public void finish(){//종료 커스텀 매서드
		System.out.println("커스텀 종료 메서드");
	}
	@Override
	public void afterPropertiesSet() throws Exception {//InitializingBean : bean객체의 초기값을 설정할수있다.(
		// TODO Auto-generated method stub
		System.out.println("6번재 프로퍼티 지정");
	}
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {//BeanFactoryAware : 팩토리가 만들어지는 시점에 어떤 팩토리가 만들어졌는지 알려준다.
		// TODO Auto-generated method stub
		System.out.println("4번째 빈 팩토리 지정"+ arg0);
	}
	@Override
	public void setBeanName(String arg0) {//BeanNameAware : 빈의 이름을 읽어냈을때 그 아이디를 알려준다.
		// TODO Auto-generated method stub
		System.out.println("3번째 빈의 이름 지정:"+arg0);
	}
	
	public void init(){//내가 만든 함수(커스텀 매서드)
		//초기화 설정
		System.out.println("7번째 초기화 매서드 호출");
	}
	

}
