package duck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import duck.behavior.FlyBehavior;
import duck.behavior.FlyNoWay;
import duck.ducks.Duck;
import duck.ducks.MallarDuck;
import duck.ducks.RubberDuck;
import duck.quack.Squeak;

public class DuckMain {

	public static void main(String[] args) {

		// spring container
		
		ApplicationContext context = new ClassPathXmlApplicationContext("duck/setting.xml");
		Duck duck = context.getBean("duck", Duck.class);
		
//		duck.setFlyBehavior(new FlyNoWay());
//		duck.getFlyBehavior().fly();
//		duck.setQuackBehavior(new Squeak());
//		duck.getQuackBehavior().quack();
				
		duck.display();
		duck.performFly();
		duck.performQuack();
		
		 

	}

}
