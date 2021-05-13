package com.tdd.pratices._4isp.resolution;

import lombok.Data;

@Data
public class Car implements MovebleVehicle {

    public static final String LEFT = "Left";
    public static final String RIGHT = "Right";
    private boolean isOn;
    private String direction;

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn=true;
    }

    @Override
    public void off() {
        this.isOn=false;
    }

    @Override
    public void moveLeft() {
        this.direction= LEFT;
    }

    @Override
    public void moveRight() {
        this.direction= RIGHT;
    }
}
