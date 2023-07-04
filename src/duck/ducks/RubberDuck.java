package duck.ducks;

import duck.behavior.FlyBehavior;
import duck.behavior.FlyNoWay;
import duck.behavior.FlyWithWings;
import duck.quack.Quack;
import duck.quack.QuackBehavior;
import duck.quack.Squeak;

public class RubberDuck extends Duck{

	@Override
	public void display() {
		System.out.println("·¯¹ö´ö");
	}
	

}
