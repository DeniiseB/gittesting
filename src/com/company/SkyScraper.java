package com.company;

public class SkyScraper {

    static public void floorList(int totalRealFloors){

        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= totalRealFloors; realFloor++){
            System.out.println("realFloorNo: " + realFloor + " fakeFloor " + fakeFloor);
            do{
            fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
    }

    static public int toRealFloor(int fakeFloorsGoal){

        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= fakeFloor; realFloor++){
            if(fakeFloorsGoal == fakeFloor){
                return realFloor;
            }
            do{
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
        return -1; // could not find real floor number
    }


}
