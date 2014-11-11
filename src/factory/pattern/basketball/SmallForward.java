package factory.pattern.basketball;

import factory.pattern.IBasketball;

/**
 * This class implements a Small Forward player
 */
public class SmallForward implements IBasketball {

    //Members of the class
    String name;
    int age;

    /**
     *
     * @param name The name of the player
     * @param age The age of the player
     */
    public SmallForward(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public void playBasketball() {
        // Specific playing techniques for every type of player
        System.out.println(this.name+ " is "+this.age+ " years old and plays as Small Forward.");
        System.out.println("The Small Forward is quick and powerful. He does a little bit of everything on court");
    }

}
