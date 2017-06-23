package observer;
/*
 * 观察者模式：当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系。
 * 类似于邮件订阅和RSS订阅，当我们浏览一些博客或wiki时，经常会看到RSS图标，当你订阅了该文章，如果后续有更新，会及时通知你。
 */
public class ObserverTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Subject s=new MySubject();
		Observer o1=new Observer1();
		Observer o2=new Observer2();
		s.add(o1);
		s.add(o2);
		s.operation();
	}

}
