package com.cristhian.com.adapterpattern;

public interface NewLocation {
    String getBuilding();
    void setBuilding(String building);

    int floor();
    void setFloor(int floor);

    int desk();
    void setDesk(int desk);
}
