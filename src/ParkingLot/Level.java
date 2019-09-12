package ParkingLot;

import java.util.*;

class Level {
    private final List<ParkingSpot> spotList;
    Level(int numOfSpots) {
        List<ParkingSpot> list = new ArrayList<>();
        int i = 0;
        for (; i < numOfSpots/2; i++) {
            list.add(new ParkingSpot(VehicleSize.Compact));
        }
        for (; i < numOfSpots; i++) {
            list.add(new ParkingSpot(VehicleSize.Large));
        }
        spotList = Collections.unmodifiableList(list);
    }
    boolean hasSpot(Vehicle v) {
        for (ParkingSpot spot : spotList) {
            if (spot.fit(v)) {
                return true;
            }
        }
        return false;
    }
    boolean park(Vehicle v) {
        for (ParkingSpot spot : spotList) {
            if (spot.fit(v)) {
                spot.park(v);
                return true;
            }
        }
        return false;
    }
    boolean leave(Vehicle v) {
        for (ParkingSpot spot : spotList) {
            if (spot.getVehicle() == v) {
                spot.leave();
                return true;
            }
        }
        return false;
    }
    Integer findMyCar(Vehicle v) {
        for (int i = 0; i < spotList.size(); i++) {
            if (spotList.get(i).getVehicle() == v) {
                return i;
            }
        }
        return null;
    }
}
