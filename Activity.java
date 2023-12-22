package Proj3;

public class Activity {
    String name;

    public Activity(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String toString() {
        // Customize this method to return the desired string representation
        return getName();
    }
}
