package adapter.objectAdapter;
//对象的适配器模式
public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source source=new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}
}
