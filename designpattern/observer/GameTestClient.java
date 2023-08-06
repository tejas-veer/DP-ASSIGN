package net.media.training.designpattern.observer;

public class GameTestClient {
    public Person person;
    public Sun sun;
    public Dog dog;
    public Cat cat;
    public Robot robot;
    public Game game;

    public void setup() {
        person = new Person();
        dog = new Dog();
        cat = new Cat();
        robot = new Robot();

        Sun sun = new Sun();
        sun.addCharacter(cat);
        sun.addCharacter(dog);
        sun.addCharacter(robot);
        sun.addCharacter(person);

        game = new Game(sun);
    }

    public void everyoneGoesOut() {
        person.goOutdoors();
        robot.goOutdoors();
        dog.goOutdoors();
        cat.goOutdoors();
    }

    public void everyoneOutdoorsComesIn() {
        for (Character character : sun.characters) {
            if (character.isOutdoors())
                character.goIndoors();
        }

    }

    public void tickOnce() {
        game.tick();
    }

    public void tickTwice() {
        game.tick();
        game.tick();
    }

    public boolean outdoorsCharactersFeelWarm() {

        for (Character character : sun.characters) {
            if (character.isOutdoors() && !character.isFeelingWarm())
                return false;
        }

        for (Character character : sun.characters) {
            if (!character.isOutdoors() && character.isFeelingWarm())
                return false;
        }

        return true;
    }

    public boolean allFeelCold() {
        return !person.isFeelingWarm() && !cat.isFeelingWarm() && !dog.isFeelingWarm() && !robot.isFeelingWarm();
    }
}