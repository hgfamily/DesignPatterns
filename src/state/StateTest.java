package state;
/*
 * 状态模式核心思想就是：当对象的状态改变时，同时改变其行为，就拿QQ来说，有几种状态，在线、隐身、忙碌等，每个状态对应不同的操作，而且你的好友也能看到你的状态
 * 状态模式在日常开发中用的挺多的，尤其是做网站的时候，我们有时希望根据对象的某一属性，区别开他们的一些功能，比如说简单的权限控制等。
 */
public class StateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State state = new State();
		Context context = new Context(state);

		// 设置第一种状态
		state.setValue("state1");
		context.method();

		// 设置第二种状态
		state.setValue("state2");
		context.method();
	}

}
