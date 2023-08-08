package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {

    public Case buildPhone(String phoneType) {
        Factory factory;
        if (phoneType.equals("Android")) {
           factory = new AndriodFactory();
        } else {
            factory = new IphoneFactory();
        }
        MotherBoard motherBoard= factory.attachMotherBoard();
        Screen screen = factory.attachScreen();
        Case phoneCase = factory.attachCase();
        phoneCase.attachScreen(screen);
        phoneCase.attachMotherBoard(motherBoard);

        return phoneCase;

    }

}
