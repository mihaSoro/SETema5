package factory.pattern.basketball;

import factory.pattern.IBasketball;

/**
 * This class implements a Center player
 */
public class Center implements IBasketball{

    //Members of the class
    String name;
    int age;

    /**
     *
     * @param name The name of the player
     * @param age The age of the player
     */
    public Center(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public void playBasketball() {
        // Specific playing techniques for every type of player
        System.out.println(this.name+ " is "+this.age+ " years old and plays as Center.");
        System.out.println("The Center is usually used to  gather rebounds, contest shots and set screens on plays.");
    }
}
