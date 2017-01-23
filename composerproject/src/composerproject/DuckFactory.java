package composerproject;


/**
 * blaadaieeee
 */
public class DuckFactory extends AbstractDuckFactory {
	public MallardDuck createMallardDuck(){
		return new MallardDuck(new Quacker());
	}

	@Override
	public RedheadDuck createRedheadDuck() {
		// TODO Auto-generated method stub
		return new RedheadDuck(new Quacker());
	}

	@Override
	public RubberDuck createRubberDuck() {
		// TODO Auto-generated method stub
		return new RubberDuck(new Sqweeker());
	}
	
	
}
