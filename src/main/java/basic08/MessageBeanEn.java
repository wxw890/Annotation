package basic08;




public class MessageBeanEn implements MessageBean {
	private String name;
	private int age;
	private Outputter outputter;
	

	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}

	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("my name is"+ name +",and my age is"+ age);
	}

}
