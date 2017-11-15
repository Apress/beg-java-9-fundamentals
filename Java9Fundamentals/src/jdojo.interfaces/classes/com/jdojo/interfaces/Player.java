// Player.java
package com.jdojo.interfaces;

public interface Player {
    void play();
    void setRate(double rate);

    default double getRate() {
        return 300.0;
    }
}
