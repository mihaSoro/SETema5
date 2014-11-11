package factory.pattern.football;

import factory.pattern.IFootball;

/**
 This class implements a Midfielder
 */
public class Midfielder implements IFootball {

    //Members of the class
    String name;
    int age;

    /**
     *
     * @param name The name of the player
     * @param age The age of the player
     */
    public Midfielder(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public void playFootball() {
        // Specific playing techniques for every type of player
        System.out.println(this.name+ " is "+this.age+ " years old and plays as Midfielder.");
        System.out.println("The Midfielder controls the game by passing the ball to the forward players to score!");
    }
}
