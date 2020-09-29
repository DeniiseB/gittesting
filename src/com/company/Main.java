package com.company;

public class Main {

    public static void main(String[] args) {

        for(var floor = 1; floor <= 220; floor++){
            System.out.println("Floor " + floor);
            var fakeFloor = SkyScraper.toFakeFloor(floor);
            System.out.println("Fakefloor " + fakeFloor);
            var backToRealFloor = SkyScraper.toRealFloor(fakeFloor);
            System.out.println("Back to real floor " + backToRealFloor);
        }

    }
}
