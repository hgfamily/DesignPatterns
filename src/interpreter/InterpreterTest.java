package interpreter;
/*
 * 解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等！
 */
public class InterpreterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 计算10+8-1的值
		int result=new Minus().interpret(
				new Context(new Plus().interpret(new Context(10, 7)),1)
				);
		System.out.println(result);
	}

}
