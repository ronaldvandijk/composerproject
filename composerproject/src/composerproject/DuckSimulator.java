package composerproject;

public class DuckSimulator {
	DuckFactory duckFactory;
	Duck duck;

	public static void main(String[] args) {
		DuckSimulator mySimulator = new DuckSimulator();
		mySimulator.run();
	}

	DuckSimulator() {

	}

	public void run() {
		this.duckFactory = new DuckFactory();
		this.duck = duckFactory.createMallardDuck();

		Quackologist john = new Quackologist("John");
		Quackologist simon = new Quackologist("Simon");

		duck.registerObserver(john);
		duck.registerObserver(simon);

		duck.quack();
	}
}
