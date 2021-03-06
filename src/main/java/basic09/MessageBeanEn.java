package basic09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//생성자로 주입받아야한다.
public class MessageBeanEn implements MessageBean {

	private String greeting;
	private String name;
	private Outputter outputter;
	
	@Autowired
	public MessageBeanEn(String greeting, String name,
		@Qualifier("outputter2") Outputter outputter){ //@Qualifier는 지정된 아이디 outputter2로 부터 주입을 받고 싶어서 사용됨 즉,outputter과 구분하기 위해서 사용됨  
		this.greeting = greeting;
		this.name = name;
		this.outputter = outputter;
	}


	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(greeting+"-!^~^!-"+name);
		System.out.println("참조확인:"+ outputter);
	}
}
