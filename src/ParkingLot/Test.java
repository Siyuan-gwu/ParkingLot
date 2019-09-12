package ParkingLot;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(4, 4);
        List<Vehicle> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            final Vehicle v = i % 2 == 0 ? new Car() : new Truck();
            list.add(v);
        }
        lot.park(list.get(0));
        lot.park(list.get(1));
        lot.park(list.get(2));
        lot.park(list.get(3));
        lot.park(list.get(4));
        Integer[] location = lot.findMyCar(list.get(10));
        Integer[] location1 = lot.findMyCar(list.get(4));
        System.out.println(location);
        System.out.println("Level: " + location1[0] + ", Number: " + location1[1]);
//        for (int i = 0; i < 50; i++) {
//            final Vehicle v = i % 2 == 0 ? new Car() : new Truck();
//            list.add(v);
//            boolean hasSpot = lot.hasSpot(v);
//            if (i < 40) {
//                assert hasSpot;
//                assert lot.park(v);
//            } else {
//                assert !hasSpot;
//                assert !lot.park(v);
//            }
//        }
//        assert list.size() == 50;
//        int i = 0;
//        for (Vehicle v : list) {
//            assert i >= 40 || lot.leave(v);
//            i++;
//        }
    }
}
