package ObserverPattern;

import java.util.ArrayList;

public class stockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibm;
	private double aaple;
	private double google;
	
	public stockGrabber() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer newObservers) {
		// TODO Auto-generated method stub
		observers.add(newObservers);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		// TODO Auto-generated method stub
		int observerIndex = observers.indexOf(deleteObserver);
		observers.remove(deleteObserver);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		for(Observer observer: observers) {
			observer.update(ibm, aaple, google);
		}
		
	}

	public void setIBMPrice(double p) {
		this.ibm = p;
		notifyObserver();
	}
	
	public void setAAPLEPrice(double p) {
		this.aaple = p;
		notifyObserver();
	}
	
	public void setGOOGLEPrice(double p) {
		this.google = p;
		notifyObserver();
	}
}
