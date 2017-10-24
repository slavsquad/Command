package com.ihamen.Devices;

/**
 * Created by stepanenko.sg on 23.10.2017.
 */
public class CellingFan {
    public static int HIGH = 3;
    public static int MEDIUM = 2;
    public static int LOW = 1;
    public static int OFF = 0;
    private int speed;

    public void setHigh() {
        speed = HIGH;
        System.out.println("Celling fan set high speed!");
    }

    public void setMedium() {
        speed = MEDIUM;
        System.out.println("Celling fan set medium speed!");
    }

    public void setLow() {
        speed = LOW;
        System.out.println("Celling fan set low speed!");
    }


    public void powerOff() {
        speed = OFF;
        System.out.println("Celling fan power off!");

    }

    public int getSpeed() {
        return speed;
    }
}

