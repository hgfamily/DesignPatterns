package builder;

import java.util.ArrayList;
import java.util.List;

/*
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性
 */
public class BuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Sender> list=new ArrayList<Sender>();
		Builder build=new Builder();
		build.produceMailSender(3);
		build.produceSmsSender(4);
		list=(List<Sender>)build.showList();
		for(Sender l:list){
			l.Send();
		}
	}

}
