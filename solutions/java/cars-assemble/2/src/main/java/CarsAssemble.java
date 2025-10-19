public class CarsAssemble {
    private static final int PRODUCTION_PER_SPEED_UNIT = 221;

    public double productionRatePerHour(int speed) {
        validateSpeed(speed);

        if (speed == 0) {
            return 0;
        } else {
            return speed * PRODUCTION_PER_SPEED_UNIT * getSuccessRate(speed);
        }
    }

    public int workingItemsPerMinute(int speed) {
        validateSpeed(speed);

        if (speed == 0) {
            return 0;
        } else {
            return (int) ((speed * PRODUCTION_PER_SPEED_UNIT * getSuccessRate(speed)) / 60);
        }
    }

    private double getSuccessRate(int speed) {
        if (speed == 0) {
            return 0;
        } else if (speed <= 4) {
            return 1.0;
        } else if (speed <= 8) {
            return 0.9;
        } else if (speed == 9) {
            return 0.8;
        } else { // speed == 10
            return 0.77;
        }
    }

    private void validateSpeed(int speed) {
        if (speed < 0 || speed > 10) {
            throw new IllegalArgumentException("Speed must be between 0 and 10");
        }
    }
}
