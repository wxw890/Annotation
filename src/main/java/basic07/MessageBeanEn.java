package basic07;

import org.springframework.stereotype.Component;

@Component("msgEn") //annotation을 이용하는 법: 자동으로 인스턴스의 id를 만드는 것보다 내가 따로 지정해서 사용하고 싶은 id를 사용하고 싶은때 사용하는법이다.
public class MessageBeanEn implements MessageBean {

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello~~~"+name);
	}

}
