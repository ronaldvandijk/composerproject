package composerproject;

public class MallardDuck extends Duck {
	
	
	public MallardDuck(QuackBehaviour quackBehaviour){
		setQuackBehaviour(quackBehaviour);
		
	}
	
	@Override
	public void registerObserver(Observer observer) {
		this.getObservable().registerObserver(observer);

	}

	@Override
	public void notifyObservers() {
		//System.out.println(" Notifying observer" );
		this.observable.notifyObservers();

	}

}
