package director;

import builder.IBuilder;

public class Director {
    IBuilder builder;

    public Director(IBuilder builder){
        this.builder=builder;
    }
    public void constructRockets(){
        this.builder.setSeats(6);
        this.builder.setEngines(4);
        this.builder.setControlPanel("F1 ROCKET");
        this.builder.setFuelTank("Medium size");
    }

    public void constructSpaceStations(){
        this.builder.setSeats(12);
        this.builder.setEngines(8);
        this.builder.setControlPanel("F1 SPACE STATION");
        this.builder.setFuelTank("Big size");
    }
}
