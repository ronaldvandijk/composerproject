package composerproject;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable {
	ArrayList<Observer> observers;
	QuackObservable duck;

	public Observable(QuackObservable duck) {
		this.duck = duck;
		this.observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer observer) {
		System.out.println("Registrating observer");
		this.observers.add(observer);
	}

	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		Observer observer;
		while (iterator.hasNext()) {
			 observer = (Observer) iterator.next();
			 observer.update(this.duck);			
		}

	}
}
