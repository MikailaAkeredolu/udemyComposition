package io.mikaila;

/**
 * Created by makerofapps on 11/21/17.
 */
public class Main {

    public static void main(String[] args) {


        Dimension dimensions = new Dimension(20, 25, 5);

        Case theCase = new Case("220b panasonic","Dell", "240 powerSupply", dimensions );

        //Resolution resolution = new Resolution(100, 200);
        //creating a class without a variable - new Resolution(100, 200)

        Monitor monitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(100, 200) );

        MotherBoard theMotherBoard = new MotherBoard("BJ-200","Asus", 4, 6, "v2.44");


        //Create PC Object

        PC thePc = new PC(theCase, monitor,theMotherBoard);

        //use the getters in the PC class that have access to the Objects / properties
        thePc.powerUp();

        //thePc.getMotherBoard().loadProgram("Windows 1.0");

       // thePc.getTheCase().pressPowerButton();

        //Encapsulate the functionality



        Wall wall1 = new  Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3= new Wall("South");
        Wall wall4 = new Wall("West");


        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4,3,2,1);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Tims", wall1,wall2,wall3,wall4, ceiling, bed, lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();

    }



}



