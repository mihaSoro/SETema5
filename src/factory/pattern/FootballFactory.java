package factory.pattern;

import factory.pattern.football.Defender;
import factory.pattern.football.Forward;
import factory.pattern.football.Goalkeeper;
import factory.pattern.football.Midfielder;

/**
 * This is the Football Factory
 */
public class FootballFactory extends AbstractPlayerFactory {

    /**
     *  This methods produces a player according to the position provided
     * @param position    The playing position of de desired player
     * @param position    The desired position for the player
     * @param name        The name of the player
     * @return            The instance of a player class object or null if the parameters don't match
     */
    @Override
    IFootball getFootballPlayer(String position, String name, int age) {

        if (position == null) {
            return null;
        }

        if (position.equalsIgnoreCase("GOALKEEPER")) {
            return new Goalkeeper(name, age);
        } else if (position.equalsIgnoreCase("DEFENDER")) {
            return new Defender(name, age);
        }else if (position.equalsIgnoreCase("MIDFIELDER")){
            return new Midfielder(name,age);
        } else if (position.equalsIgnoreCase("FORWARD")){
            return new Forward(name,age);
        } else {
            return null;
        }


    }

    @Override
    IBasketball getBasketballPlayer(String position, String name, int age) {
        return null;
    }
}
