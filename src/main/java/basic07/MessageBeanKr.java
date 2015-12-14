package basic07;

import org.springframework.stereotype.Component;

@Component   //annotation을 이용하는 법: 바코드 --->설정에 더이상 bean을 설정안해도 된다. 자동으로 생성된 인스턴스 id는 첫글자 소문자(클래스명)으로 만들어진다.
public class MessageBeanKr implements MessageBean {

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요..."+name);
	}

}
