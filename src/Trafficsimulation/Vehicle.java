package Trafficsimulation;

public class Vehicle {

        private String id;
        private double speed;
        private boolean isMoving;
        private int currentLane;
        private Road currentRoad;

        public Vehicle(String id, Road currentRoad) {
            this.id = id;
            this.speed = 0;
            this.isMoving = false;
            this.currentLane = 1; // default lane
            this.currentRoad = currentRoad;
        }

        public void start() {
            if (currentRoad.getTrafficLight().isGreen()) {
                this.isMoving = true;
                this.speed = currentRoad.getSpeedLimit();
            }
        }

        public void stop() {
            this.isMoving = false;
            this.speed = 0;
        }

        public void changeLane(int newLane) {
            System.out.println(id + " is changing to lane " + newLane);
            this.currentLane = newLane;
        }

        public void update() {
            if (isMoving) {
                System.out.println(id + " is moving at " + speed + " km/h on road " + currentRoad.getName());
            } else {
                System.out.println(id + " is stopped at the intersection.");
            }
        }
    }


