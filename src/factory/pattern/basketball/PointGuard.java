package factory.pattern.basketball;

import factory.pattern.IBasketball;

/**
 * This class implements a Point Guard player
 */
public class PointGuard implements IBasketball {

    //Members of the class
    String name;
    int age;

    /**
     *
     * @param name The name of the player
     * @param age The age of the player
     */
    public PointGuard(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public void playBasketball() {
        // Specific playing techniques for every type of player
        System.out.println(this.name+ " is "+this.age+ " years old and plays as Point Guard.");
        System.out.println("The Point Guard leads his team in assists and steals.");
    }


}
