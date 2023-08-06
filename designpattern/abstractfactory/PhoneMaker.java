package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {

    public Phone buildPhone(String phoneType) {
        if (phoneType.equals("Android")) {
            return new AndriodPhone(new AndroidMotherBoard() , new AndroidScreen() , new AndroidCase());
        } else {
            return new IphonePhone(new IphoneMotherBoard() , new IphoneScreen() , new IphoneCase());
        }

    }

    public static void main(String[] args) {

        Phone myAndriodPhone = new PhoneMaker().buildPhone("Andriod");
        Phone myIphone = new PhoneMaker().buildPhone("Iphone");

    }
}
