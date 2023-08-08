package net.media.training.designpattern.abstractfactory;

public class AndriodFactory implements Factory{
    @Override
    public MotherBoard attachMotherBoard() {
        AndroidMotherBoard androidMotherBoard = new AndroidMotherBoard();
        androidMotherBoard.attachBattery(new Battery());
        androidMotherBoard.attachProcessor(new IphoneProcessor());
        return androidMotherBoard;
    }

    @Override
    public Screen attachScreen() {
        Screen screen = new IphoneScreen();
        return screen;
    }

    @Override
    public Case attachCase() {
        Case phonecase = new IphoneCase();
        return phonecase;
    }


}
