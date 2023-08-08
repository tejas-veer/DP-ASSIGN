package net.media.training.designpattern.abstractfactory;

interface Factory {
    public MotherBoard attachMotherBoard();

    public Screen attachScreen();

    public Case attachCase();
}
