package basic09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//메소드로 주입받아야한다.
public class MessageBeanKr implements MessageBean {
	private String greeting;
	private String name;
	@Autowired//변수 위에다 선언하면 아예 setOutputter()메스가 필요 없게된다.
	private Outputter outputter; 
	
	@Autowired
	
	//@Autowired(required=false) //자동으로 주입받겠다는 바코드, required=false는 반드시 주입을 안받아도 된다는 뜻
	//@Qualifier("outputter1") //만약 주입되는게 여러개면 지정해서 주입 받고 싶은 id를 적어서 주입받을 수있다.
	/*
	public void setOutputter(Outputter outputter) { //여기만 자동 주입에 해당되는 대상이다. 자동주입은 type을 먼저 찾고 그다음 이름으로 찾는다.
		this.outputter = outputter;
	}*/

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(greeting+"-!^~^!-"+name);
		System.out.println("참조 확인:"+ outputter.toString());
	}

}
