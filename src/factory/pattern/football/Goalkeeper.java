package factory.pattern.football;

import factory.pattern.IFootball;

/**
 * This is the class that implements a goalkeeper
 */
public class Goalkeeper implements IFootball {

    //Members of the class
    String name;
    int age;

    /**
     *
     * @param name The name of the player
     * @param age The age of the player
     */
    public Goalkeeper(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public void playFootball() {
        // Specific playing techniques for every type of player
        System.out.println(this.name+ " is "+this.age+ " years old and plays as Goalkeeper.");
        System.out.println("The Goalkeeper tries to keep the ball out of the gate");
    }
}
