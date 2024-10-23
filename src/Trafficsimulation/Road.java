package Trafficsimulation;

public class Road {
    private String name;
    private int speedLimit;
    private TrafficLight trafficLight;

    public Road(String name, int speedLimit, TrafficLight trafficLight) {
        this.name = name;
        this.speedLimit = speedLimit;
        this.trafficLight = trafficLight;
    }

    public String getName() {
        return name;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public TrafficLight getTrafficLight() {
        return trafficLight;
    }

    public void updateTrafficLight() {
        trafficLight.update();
    }
}
