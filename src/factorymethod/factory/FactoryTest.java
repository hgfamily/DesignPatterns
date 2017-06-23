package factorymethod.factory;
/*
 *普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 */
public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SendFactory factory = new SendFactory();  
	     Sender sender = factory.produce("mail");  
	     sender.Send();
	}

}
