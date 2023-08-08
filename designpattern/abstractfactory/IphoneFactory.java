package net.media.training.designpattern.abstractfactory;

public class IphoneFactory implements Factory{

    @Override
    public MotherBoard attachMotherBoard() {
        IphoneMotherBoard iphoneMotherBoard = new IphoneMotherBoard();
        iphoneMotherBoard.attachBattery(new Battery());
        iphoneMotherBoard.attachProcessor(new IphoneProcessor());
        return iphoneMotherBoard;
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
