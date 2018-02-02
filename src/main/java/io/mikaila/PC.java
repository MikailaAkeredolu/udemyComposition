package io.mikaila;

/**
 * Created by makerofapps on 11/21/17.
 */
public class PC {

    private Case theCase;
    private Monitor monitor;





    private MotherBoard motherBoard;




    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();

    }

    private void drawLogo(){
        //Fancy Graphics
        monitor.drawPixelAt(12500, 50,"yellow");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private MotherBoard getMotherBoard() {
        return motherBoard;
    }



}
