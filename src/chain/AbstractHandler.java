package chain;

public abstract class AbstractHandler {
	/*
	 * 提供get和set方法，方便MyHandler类设置和修改引用对象
	 */
	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
}
