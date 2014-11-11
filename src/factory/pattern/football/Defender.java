package factory.pattern.football;

import factory.pattern.IFootball;

/**
 * This class implements a Defender
 */
public class Defender implements IFootball {

    //Members of the class
    String name;
    int age;

    /**
     *
     * @param name The name of the player
     * @param age The age of the player
     */
    public Defender(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public void playFootball() {
        // Specific playing techniques for every type of player

        System.out.println(this.name+ " is "+this.age+ " years old and plays as Defender.");
        System.out.println("A defender's job is to prevent the opponent from shooting or scoring.");
    }
}
