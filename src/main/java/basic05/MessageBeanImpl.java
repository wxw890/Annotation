package basic05;

import java.io.IOException;

public class MessageBeanImpl implements MessageBean {

	private String name;
	private int age;
	private String greeting;
	
	public MessageBeanImpl(){}
	public MessageBeanImpl(String name, int age, String greeting){
		this.name = name;
		this.age = age;
		this.greeting = greeting;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	private Outputter outputter;//파일로 출력하는 기능
	public void setOutputter(Outputter outputter) {//어딘가 new FileOutputter()로 만들어진 인스턴스를 매개변수로 주입받는 코드
		this.outputter = outputter;					//DIP로 구현하는 부분
	}
	
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		String msg = greeting + "~~" + name+"님! 이제 당신은" + age + "살 입니다.";
		System.out.println(msg);//화면에 출력하는 코드
		//Outputter = outputter = new FileOutputter();
		try{
			outputter.output(msg);
		}catch(IOException err){}
	}
	

}
