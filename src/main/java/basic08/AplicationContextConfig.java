package basic08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //xml 대신에 자바코드로 설정할수 있도록 도와주는 바코드이다.
public class AplicationContextConfig {
	@Bean
	public Outputter output(){
		FileOutputter output = new FileOutputter();
		output.setFilePath("F:\\javastudy\\out2.txt");
		return output;
	}
	@Bean
	public MessageBean getMessageKr(){
		MessageBeanImpl bean = new MessageBeanImpl();
		bean.setAge(20);
		bean.setName("홍길동");
		bean.setOutputter(output());
		
		return bean;
	}
	@Bean
	public MessageBean getMessageEn(){
		MessageBeanEn bean = new MessageBeanEn();
		bean.setAge(20);
		bean.setName("홍길동");
		bean.setOutputter(output());
		
		return bean;
	}
}
