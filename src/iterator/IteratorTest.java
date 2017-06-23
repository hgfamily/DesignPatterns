package iterator;
/*
 * 迭代器模式就是顺序访问聚集中的对象，一般来说，集合中非常常见，这句话包含两层意思：一是需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问
 */
public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection col=new MyCollection();
		Iterator it=col.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
