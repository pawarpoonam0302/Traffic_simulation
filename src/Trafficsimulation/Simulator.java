package Trafficsimulation;


import java.util.ArrayList;
import java.util.List;

public class Simulator {

        public static void main(String[] args) {
            // Create traffic lights
            TrafficLight light1 = new TrafficLight(5, 2, 5);
            TrafficLight light2 = new TrafficLight(5, 2, 5);

            // Create roads
            Road road1 = new Road("Road 1", 60, light1);
            Road road2 = new Road("Road 2", 40, light2);

            // Create intersection
            List<Road> roads = new ArrayList<>();
            roads.add(road1);
            roads.add(road2);
            Intersection intersection = new Intersection(roads);

            // Create vehicles
            Vehicle vehicle1 = new Vehicle("Vehicle 1", road1);
            Vehicle vehicle2 = new Vehicle("Vehicle 2", road2);

            // Simulation loop
            for (int time = 0; time < 5; time++) {
                System.out.println("Time: " + time);

                // Update intersection and traffic lights
                intersection.update();

                // Vehicles update based on traffic lights
                if (road1.getTrafficLight().isGreen()) {
                    vehicle1.start();
                } else {
                    vehicle1.stop();
                }
                if (road2.getTrafficLight().isGreen()) {
                    vehicle2.start();
                } else {
                    vehicle2.stop();
                }

                // Vehicle updates (movement or stopping)
                vehicle1.update();
                vehicle2.update();

                // Simulate vehicle lane changes
                if (time % 3 == 0) {
                    vehicle1.changeLane(2);
                    vehicle2.changeLane(1);
                }

                // Pause simulation for clarity
                try {
                    Thread.sleep(1000); // 1 second per loop iteration
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println();
            }
        }
    }


