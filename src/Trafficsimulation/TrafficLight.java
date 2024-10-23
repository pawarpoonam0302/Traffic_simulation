package Trafficsimulation;

public class TrafficLight {

        private enum LightColor { GREEN, YELLOW, RED }
        private LightColor currentColor;
        private int durationGreen;
        private int durationYellow;
        private int durationRed;
        private int timeElapsed;

        public TrafficLight(int durationGreen, int durationYellow, int durationRed) {
            this.durationGreen = durationGreen;
            this.durationYellow = durationYellow;
            this.durationRed = durationRed;
            this.currentColor = LightColor.RED;
            this.timeElapsed = 0;
        }

        public void update() {
            timeElapsed++;

            if (currentColor == LightColor.GREEN && timeElapsed >= durationGreen) {
                currentColor = LightColor.YELLOW;
                timeElapsed = 0;
            } else if (currentColor == LightColor.YELLOW && timeElapsed >= durationYellow) {
                currentColor = LightColor.RED;
                timeElapsed = 0;
            } else if (currentColor == LightColor.RED && timeElapsed >= durationRed) {
                currentColor = LightColor.GREEN;
                timeElapsed = 0;
            }
        }

        public boolean isGreen() {
            return currentColor == LightColor.GREEN;
        }

        public boolean isYellow() {
            return currentColor == LightColor.YELLOW;
        }

        public boolean isRed() {
            return currentColor == LightColor.RED;
        }

        public String getCurrentColor() {
            return currentColor.toString();
        }
    }


