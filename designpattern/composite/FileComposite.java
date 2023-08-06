package net.media.training.designpattern.composite;

interface FileComponent {
    String getName();
    int getSize();
    FileComponent getParent();
    void setParent(FileComponent parent);
}
