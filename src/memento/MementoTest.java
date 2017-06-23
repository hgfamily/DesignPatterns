package memento;
/*
 * 备忘录模式主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象
 * 假设有原始类A，A中有各种属性，A可以决定需要备份的属性，备忘录类B是用来存储A的一些内部状态，类C就是一个用来存储备忘录的，且只能存储，不能修改等操作
 */
public class MementoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建原始类
		Original original=new Original("memento patterns..");
		// 创建备忘录
		Storage storage=new Storage(original.createMemento());
		// 修改原始类的状态
		System.out.println("初始化状态为："+original.getValue());
		original.setValue("modify memento....");
		System.out.println("修改后的状态为："+original.getValue());
		// 回复原始类的状态
		original.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态为："+original.getValue());
	}

}
