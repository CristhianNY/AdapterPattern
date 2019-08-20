package com.cristhian.com.adapterpattern;

public class Adapter implements NewLocation {

    final OldLocation oldLocation;
    private String building;
    private int floor;
    private int desk;


    public Adapter(OldLocation oldLocation){
        this.oldLocation = oldLocation;
        setBuilding(oldLocation.getBuilding());
        setFloor(oldLocation.getFloor());
        setDesk(oldLocation.getDesk());
    }



    @Override
    public String getBuilding() {
        return building;
    }

    @Override
    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public int floor() {
        return floor;
    }

    @Override
    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public int desk() {
        return desk;
    }

    @Override
    public void setDesk(int desk) {
        this.desk = desk;
    }
}
