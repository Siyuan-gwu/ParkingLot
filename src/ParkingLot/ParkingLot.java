package ParkingLot;

public class ParkingLot {
    private final Level[] levels;
    public ParkingLot(int numOfLevels, int numOfSpotsPerLevel) {
        levels = new Level[numOfLevels];
        for (int i = 0; i < numOfLevels; i++) {
            levels[i] = new Level(numOfSpotsPerLevel);
        }
    }
    public boolean hasSpot(Vehicle v) {
        for (Level l : levels) {
            if (l.hasSpot(v)) {
                return true;
            }
        }
        return false;
    }
    public boolean park(Vehicle v) {
        for (Level l : levels) {
            if (l.park(v)) {
                return true;
            }
        }
        return false;
    }
    public boolean leave(Vehicle v) {
        for (Level l : levels) {
            if (l.leave(v)) {
                return true;
            }
        }
        return false;
    }
    public Integer[] findMyCar(Vehicle v) {
        //if we cannot find the car, then we return -1.
        Integer[] location = new Integer[2];
        for (int i = 0; i < levels.length; i++) {
            Integer spotNumOfCar = levels[i].findMyCar(v);
            if (spotNumOfCar != null) {
                location[0] = i;
                location[1] = spotNumOfCar;
                return location;
            }
        }
        return null;
    }
}
