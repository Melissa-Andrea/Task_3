package builder;

import products.SpaceStations;

public class SpaceStationsBuilder implements IBuilder{
    private int seats;
    private int engines;
    private String controlPanel;
    private String fuelTank;

    @Override
    public void setSeats(int seats) {
        this.seats=seats;
    }

    @Override
    public void setEngines(int engines) {
        this.engines=engines;
    }

    @Override
    public void setControlPanel(String controlPanel) {
        this.controlPanel=controlPanel;
    }

    @Override
    public void setFuelTank(String fuelTank) {
        this.fuelTank=fuelTank;
    }

    public SpaceStations getSpaceShips(){
        return new SpaceStations(this.seats, this.engines, this.controlPanel,this.fuelTank);
    }
}
