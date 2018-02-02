package io.mikaila;

import java.awt.*;

/**
 * Created by makerofapps on 11/21/17.
 */
public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimension dimensions;


    public Case(String model, String manufacturer, String powerSupply, Dimension dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }



    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimensions() {
        return dimensions;
    }



}
