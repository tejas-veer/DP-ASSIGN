package net.media.training.designpattern.observer;

interface Character {
    void update();

    boolean isOutdoors();

    void notifySunSet();

    void notifySunRose();

    void goIndoors();

    boolean isFeelingWarm();

    boolean isFeelingTired();


}
