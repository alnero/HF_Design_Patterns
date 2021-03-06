package Strategy;

import Strategy.Ducks.MallardDuck;
import Strategy.Ducks.ModelDuck;
import Strategy.FlyBehavior.FlyRocketPowered;

/**
 * Testing the ducks
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        mallardDuck.performQuack();
    }
}
