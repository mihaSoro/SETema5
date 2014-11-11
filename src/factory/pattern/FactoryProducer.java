package factory.pattern;

import factory.pattern.AbstractPlayerFactory;
import factory.pattern.BasketballFactory;
import factory.pattern.FootballFactory;

/**
 * This is the factory producer class that creates the desired type of PlayerFactory
 */
public class FactoryProducer {

    /**
     *  This method creates a PlayerFactory according the option given as a parameter
     * @param option   The desired Player Factory
     * @return         The instance of a Factory object or null if the option doesn't match
     */
    public static AbstractPlayerFactory getPlayerFactory (String option){

        if (option == null){
            return null;
        } else if (option.equalsIgnoreCase("FOOTBALL")){
            return new FootballFactory();
        } else if (option.equalsIgnoreCase("BASKETBALL")){
            return new BasketballFactory();
        } else {
            return null;
        }

    }


}
