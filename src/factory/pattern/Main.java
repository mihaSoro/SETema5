package factory.pattern;

/**
 * The main class of the project
 */
public class Main {
    public static void main(String[] args) {

        //get a FootballFactory
        AbstractPlayerFactory footFactory = FactoryProducer.getPlayerFactory("Football");

        //get a Goalkeeper
        IFootball goalkeeper = footFactory.getFootballPlayer("Goalkeeper", "Manuel Neuer", 30);

        //make him play
        goalkeeper.playFootball();

        //get a Defender
        IFootball defender = footFactory.getFootballPlayer("Defender","Phillip Lahm", 32);

        //make him play
        defender.playFootball();

        //get a Midfielder
        IFootball midfielder = footFactory.getFootballPlayer("Midfielder","Mario Goetze", 22);

        //make him play
        midfielder.playFootball();

        //get a Forward
        IFootball forward = footFactory.getFootballPlayer("Forward", "Robert Lewandowski",26);

        //make him play
        forward.playFootball();

        //get a Basketball Factory
        AbstractPlayerFactory basketFactory = FactoryProducer.getPlayerFactory("Basketball");

        //get a PointGuard
        IBasketball pointGuard = basketFactory.getBasketballPlayer("Pointguard", "Lebron James", 30);

        //make him play
        pointGuard.playBasketball();

        //get a ShootingGuard
        IBasketball shootingGuard = basketFactory.getBasketballPlayer("Shootingguard","Emanuel Ginobili", 37);

        //make him play
        shootingGuard.playBasketball();

        // get a Small Forward
        IBasketball smallForward = basketFactory.getBasketballPlayer("Smallforward", "Kawhi Leonard", 23);

        //make him play
        smallForward.playBasketball();

        //get a Power Forward
        IBasketball powerForward = basketFactory.getBasketballPlayer("Powerforward", "Tim Duncan", 38);

        //make him play
        powerForward.playBasketball();

        //get a Center
        IBasketball center = basketFactory.getBasketballPlayer("Center", "Aron Baynes", 28);

        //make him play
        center.playBasketball();
    }
}
