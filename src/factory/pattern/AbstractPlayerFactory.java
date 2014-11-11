package factory.pattern;

/**
 * This is the Abstract Factory Class
 * It has methods to get a FootballPlayer or a BasketballPlayer
 */
public abstract class AbstractPlayerFactory {

    abstract IFootball getFootballPlayer(String position, String name, int age);
    abstract IBasketball getBasketballPlayer(String position, String name, int age);

}
