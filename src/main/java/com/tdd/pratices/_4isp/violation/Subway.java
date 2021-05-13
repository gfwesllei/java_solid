package com.tdd.pratices._4isp.violation;

public class Subway implements Vehicle{

    private boolean isOn;

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
        throw new UnsupportedOperationException();
    }

    @Override
    public void moveRight() {
        throw new UnsupportedOperationException();
    }
}
