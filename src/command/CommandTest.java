package command;
/*
 * 命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分开，Struts其实就是一种将请求和呈现分离的技术
 */
public class CommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver receiver=new Receiver();
		Command command=new MyCommand(receiver);
		Invoker invoker=new Invoker(command);
		invoker.action();
	}

}
