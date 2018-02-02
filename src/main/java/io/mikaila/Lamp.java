package io.mikaila;

/**
 * Created by makerofapps on 11/21/17.
 */
public class Lamp {
    private String style;
    private boolean battery;
    private int gloRating;

    public Lamp(String style, boolean battery, int gloRating) {
        this.style = style;
        this.battery = battery;
        this.gloRating = gloRating;
    }

    public void turnOn(){
        System.out.println("turning on Lamp");
    }

}
