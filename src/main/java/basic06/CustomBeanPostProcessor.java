package basic06;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override //@는 annotation이다. 오버라이드를 제대로 했는지 안했지 검사해줌
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("8.초기화 후 빈에 대한 처리:"+arg0.getClass());
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		//bean의 초기화가 되기 직전에 호출되는 매소드
		System.out.println("5.초기화 전 빈에 대한 처리:"+arg0.getClass());
		return arg0;
	}

}
