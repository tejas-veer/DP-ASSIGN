package net.media.training.designpattern.abstractfactory;

public class AndriodPhone implements Phone{
    AndroidMotherBoard andriodMotherBoard;
    AndroidCase androidCase;
    AndroidScreen androidScreen;

    public AndriodPhone(AndroidMotherBoard androidMotherBoard , AndroidScreen androidScreen , AndroidCase androidCase){
        this.andriodMotherBoard = androidMotherBoard;
        this.androidScreen = androidScreen;
        this.androidCase = androidCase;
    }


}
