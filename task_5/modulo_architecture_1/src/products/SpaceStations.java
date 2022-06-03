package products;

public class SpaceStations {
    private int engines;
    private int passengers;
    private String controlPanel;
    private String fuelTank;

    public SpaceStations(int engines, int passengers, String controlPanel, String fuelTank) {
        this.engines = engines;
        this.passengers = passengers;
        this.controlPanel = controlPanel;
        this.fuelTank = fuelTank;
    }

    public int getEngines() {
        return engines;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getControlPanel() {
        return controlPanel;
    }

    public String getFuelTank() {
        return fuelTank;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setControlPanel(String controlPanel) {
        this.controlPanel = controlPanel;
    }

    public void setFuelTank(String fuelTank) {
        this.fuelTank = fuelTank;
    }

}
