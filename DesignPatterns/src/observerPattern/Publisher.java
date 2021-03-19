package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Publisher extends Subject{
	
	private List<Observer> observers = new ArrayList<>();
	String state;

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllObservers() {
		for(Observer o: observers)
		{
			o.update(); 
		}
	}

	public String getState() {
		
		// TODO Auto-generated method stub
		return state;
	}
	public void setState(String state) {
	      this.state = state;
	      notifyAllObservers();
	   }

}
