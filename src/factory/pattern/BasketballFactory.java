package factory.pattern;

import factory.pattern.basketball.*;

/**
 * This is the Basketball Factory
 */
public class BasketballFactory extends AbstractPlayerFactory {

    @Override
    IFootball getFootballPlayer(String position, String name, int age) {
        return null;
    }

    /**
     * The method creates a basketball player according to the desired position
     * @param position    The desired position for the player
     * @param name        The name of the player
     * @param age         The players age
     * @return            Returns an instance of a basketball player object or null if the position doesn't match
     */
    @Override
    IBasketball getBasketballPlayer(String position, String name, int age) {

        if (position == null) {
            return null;
        }
        if (position.equalsIgnoreCase("CENTER")) {
            return new Center(name, age);
        } else if (position.equalsIgnoreCase("POINTGUARD")) {
            return new PointGuard(name, age);
        } else if (position.equalsIgnoreCase("POWERFORWARD")) {
            return new PowerForward(name, age);
        } else if (position.equalsIgnoreCase("SHOOTINGGUARD")) {
            return new ShootingGuard(name, age);
        } else if (position.equalsIgnoreCase("SMALLFORWARD")) {
            return new SmallForward(name, age);
        } else {
            return null;
        }
    }
}
