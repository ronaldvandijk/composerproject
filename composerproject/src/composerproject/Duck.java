package composerproject;

public abstract class Duck implements Quackable {
	QuackBehaviour quackBehaviour;
	Observable observable;
	int quackCount = 0;
	
	Duck()
	{
		this.observable = new Observable(this);
	}
	
	public Observable getObservable() {
		return observable;
	}

	public void setObservable(Observable observable) {
		this.observable = observable;
	}

	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public void quack(){
		quackBehaviour.quack();
		quackCount++;
		notifyObservers();
	}
	
	
}
