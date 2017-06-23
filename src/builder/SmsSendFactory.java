package builder;

public class SmsSendFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}
	
}
