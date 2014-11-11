package factory.pattern.basketball;

import factory.pattern.IBasketball;

/**
 * This class implements a Power Forward player
 */
public class PowerForward implements IBasketball {

    //Members of the class
    String name;
    int age;

    /**
     *
     * @param name The name of the player
     * @param age The age of the player
     */
    public PowerForward(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public void playBasketball() {
        // Specific playing techniques for every type of player
        System.out.println(this.name+ " is "+this.age+ " years old and plays as Power Forward.");
        System.out.println("The Power Forward is used for both Defense and Attack.");
    }
}
