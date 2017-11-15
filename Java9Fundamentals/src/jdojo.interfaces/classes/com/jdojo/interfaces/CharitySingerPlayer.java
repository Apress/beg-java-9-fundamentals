// CharitySingerPlayer.java
package com.jdojo.interfaces;

public interface CharitySingerPlayer extends CharitySinger, Player {
    // Override the setRate() method with an abstract method 
    @Override
    void setRate(double rate);

    // Override the getRate() method with a default method that calls the 
    // Player superinterface getRate() method
    @Override
    default double getRate() {
        return Player.super.getRate();
    }
}
