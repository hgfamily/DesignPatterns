package adapter.objectAdapter;
/*
 * 对象的适配器模式
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题。
 */
public class Wrapper implements Targetable {

	private Source source;
	
	public Wrapper(Source source) {
		// TODO Auto-generated constructor stub
		this.source=source;
	}
	
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		 System.out.println("this is the targetable method!");  
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}

}
