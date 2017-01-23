package composerproject;

public class Quackologist implements Observer {
	
	String name;
	
	Quackologist(String name){
		this.name = name;
	}
	
	public void update(QuackObservable subject) {
		System.out.println(this.name + ": " + "I heared something!");
	}
}
