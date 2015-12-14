package basic02;

public class App {
	public static void main(String[] args){
		//MessageBeanKr bean = new MessageBeanKr();
		MessageBean bean = new MessageBeanKr();//인터페이스를 사용하는 이유!! 인스턴스 생성시 의존성을 줄일려고 
		bean.sayHello("홍길동");
	}
}
