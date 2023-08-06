package net.media.training.designpattern.abstractfactory;

public class IphonePhone implements Phone{
    IphoneMotherBoard iphoneMotherBoard;
    IphoneScreen iphoneScreen;
    IphoneCase iphoneCase;

    public IphonePhone(IphoneMotherBoard iphoneMotherBoard , IphoneScreen iphoneScreen , IphoneCase iphoneCase){
        this.iphoneMotherBoard = iphoneMotherBoard;
        this.iphoneScreen = iphoneScreen;
        this.iphoneCase = iphoneCase;
    }
}
