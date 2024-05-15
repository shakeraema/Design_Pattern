package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{
    private String name;
    private long size;
    private List<FileSystemComponent> children;

    public Directory(String name, long size){
        this.name = name;
        this.size = size;
        children = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void displayDetails() {
        System.out.println("Directory: " + name);
        System.out.println("Contents:");
        for (FileSystemComponent component : children) {
            component.displayDetails();
        }
    }



//    public long getSize() {
//        long size = 0;
//        for (FileSystemComponent component : children) {
//            if (component instanceof File) {
//                size += ((File) component).getSize();
//            }
//        }
//        return size;
//    }
}
