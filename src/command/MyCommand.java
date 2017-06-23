package command;

public class MyCommand implements Command {

	private Receiver receiver;
	
	public MyCommand(Receiver receiver) {
		// TODO Auto-generated constructor stub
		this.receiver=receiver;
	}
	
	@Override
	public void exe() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
