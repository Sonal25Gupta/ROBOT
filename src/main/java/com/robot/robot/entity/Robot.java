package com.robot.robot.entity;

public class Robot {
    private int weight;
    private int distance_cover;
    private int work_done;
    private int battery;

    public long getWeight_carried() {
        return weight_carried;

    }

    public void setWeight_carried(long weight_carried) {
        this.weight_carried = weight_carried;
    }

    private long weight_carried;

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = (int) weight;
    }

    public int getDistance_cover() {
        return distance_cover;
    }

    public void setDistance_cover(int distance_cover) {
        this.distance_cover = distance_cover;
    }

    public int getWork_done() {
        return work_done;
    }

    public void setWork_done(int work_done) {
        this.work_done = work_done;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
