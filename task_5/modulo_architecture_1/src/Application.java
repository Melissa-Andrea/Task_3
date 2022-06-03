import builder.RocketsBuilder;
import builder.SpaceStationsBuilder;
import director.Director;
import products.Rockets;
import products.SpaceStations;

public class Application {
    public static void main(String[] args) {
        RocketsBuilder rocket = new RocketsBuilder();
        Director director = new Director(rocket);
        director.constructRockets();
        Rockets rocket0ne = rocket.getSpaceShips();

        System.out.println("Passengers: "+ rocket0ne.getPassengers());
        System.out.println("Engines: "+ rocket0ne.getEngines());
        System.out.println("ControlPanel: "+ rocket0ne.getControlPanel());
        System.out.println("FuelTank: "+ rocket0ne.getFuelTank());
        System.out.println("-------------------------");

        SpaceStationsBuilder spaceStation = new SpaceStationsBuilder();
        Director director1 = new Director(spaceStation);
        director1.constructSpaceStations();
        SpaceStations spaceStation0ne = spaceStation.getSpaceShips();

        System.out.println("Passengers: "+ spaceStation0ne.getPassengers());
        System.out.println("Engines: "+ spaceStation0ne.getEngines());
        System.out.println("ControlPanel: "+ spaceStation0ne.getControlPanel());
        System.out.println("FuelTank: "+ spaceStation0ne.getFuelTank());
        System.out.println("-------------------------");

    }
}
