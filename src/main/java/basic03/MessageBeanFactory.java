package basic03;
//객체와 객체 사이의 의존성을 거의 줄였다고 볼수 있다
public class MessageBeanFactory {
	private MessageBeanFactory(){}
	private static MessageBeanFactory factory = new MessageBeanFactory();
	public static MessageBeanFactory newInstance(){
		return factory;
	}
	
	public MessageBean createMessage(String nation){
		if(nation.equals("kr")){
			return new MessageBeanKr();
		}
		else{
			return new MessageBeanEn();
		}
	}
}
