package observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector=new Vector<Observer>();
	
	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		// TODO Auto-generated method stub
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		Enumeration<Observer> e=vector.elements();
		while(e.hasMoreElements()){
			e.nextElement().update();
		}
	}

}
