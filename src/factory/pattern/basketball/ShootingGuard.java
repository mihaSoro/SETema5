package factory.pattern.basketball;

import factory.pattern.IBasketball;

/**
 * This class implements a Shooting Guard
 */
public class ShootingGuard implements IBasketball {

    //Members of the class
    String name;
    int age;

    /**
     *
     * @param name The name of the player
     * @param age The age of the player
     */
    public ShootingGuard(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public void playBasketball() {
        // Specific playing techniques for every type of player
        System.out.println(this.name+ " is "+this.age+ " years old and plays as Shooting Guard.");
        System.out.println("The Shooting Guard drives shoots the ball or drives it to the net.");
    }
}
