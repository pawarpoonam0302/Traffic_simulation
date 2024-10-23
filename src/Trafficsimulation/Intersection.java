package Trafficsimulation;

import java.util.List;

public class Intersection {
    private List<Road> connectingRoads;

    public Intersection(List<Road> connectingRoads) {
        this.connectingRoads = connectingRoads;
    }

    public void update() {
        for (Road road : connectingRoads) {
            road.updateTrafficLight();
        }
    }
}

