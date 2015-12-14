package basic03;

public class App {
	public static void main(String[] args){
		//MessageBeanKr bean = new MessageBeanKr();
		MessageBeanFactory factory = MessageBeanFactory.newInstance();
		
		MessageBean bean = factory.createMessage("kr");//인터페이스를 사용하는 이유!! 인스턴스 생성시 의존성을 줄일려고 
		bean.sayHello("홍길동");
		
		bean = factory.createMessage("en");
		bean.sayHello("홍길동");
	}
}
