package net.media.training.designpattern.composite;

import java.util.List;


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

    public int getSize() {
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

    private void delete(Directory component) {
        List<FileSystemComponent> copyComponents = new ArrayList(component.getComponents());

        for (FileSystemComponent comp : copyComponents) {
            if (comp instanceof Directory) {
                delete((Directory)comp);
            } else {
                components.remove(comp);
            }
        }

        if (component.getParent() != null) {
            component.getParent().removeEntry(component);
        }
    }


    public void delete() {
        delete(this);
    }

    public void add(FileComponent component) {
        components.add(component);
    }

    public boolean componentExists(String name, FileComponent directoryToSearch) {
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

}
