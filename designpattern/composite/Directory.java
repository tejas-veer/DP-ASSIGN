package net.media.training.designpattern.composite;

import java.util.List;

import javax.swing.plaf.basic.BasicSliderUI.ComponentHandler;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements FileComponent{
    private final String name;
    private final List<FileComponent> components;
    private FileComponent parent;

    public String getName() {
        return name;
    }

    public Directory(String name, List<FileComponent> components) {
        this.name = name;
        this.components = components;

        for (FileComponent component : components) {
            component.setParent(this);
        }
    }

    public int getSize(FileComponent component) {
        int sum = 0;

        for (FileComponent fileComponent : components) {
            sum += fileComponent.getSize();
        }

        return sum;
    }


    public void setParent(FileComponent parent) {
        this.parent = parent;
    }

    public void delete(FileComponent component) {
        components.remove(component);
        components.remove(component);
    }

    public void delete() {
        delete(this);
    }

    public void add(FileComponent component) {
        components.add(component);
    }

    private boolean fileExists(String name, FileComponent directoryToSearch) {
        for (FileComponent component : components) {
            if (component.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean directoryExists(String name, FileComponent directoryToSearch) {
        if (directoryToSearch.getName().equals(name))
            return true;

        for (FileComponent component : components) {
            if (component.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public List<FileComponent> getFiles() {
        return components;
    }

    public List<FileComponent> getDirectories() {
        return components;
    }

    public FileComponent getParent() {
        return parent;
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSize'");
    }

}
