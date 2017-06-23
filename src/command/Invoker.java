package command;

public class Invoker {
	private Command command;
	
	public Invoker(Command command) {
		// TODO Auto-generated constructor stub
		this.command=command;
	}
	
	public void action(){  
        command.exe();  
    }
}
