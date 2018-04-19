package org.nichosschool.www;

public class Bear {
    
    private String name;

    public Integer age = 0;
    
    public Integer weight;
    
    public String color;
    
    public Boolean alive = true;
    
    // constructor
    public Bear(String myname, Integer myweight) {
        name = myname;
        weight = myweight;
    }
    
    public void eats(Bear thisbear) {
        weight = weight + thisbear.weight;
        thisbear.alive = false;
    }
    
    public void poop() {
        if ((weight - 1) == 0) {
            alive = false;
            weight = 0;
        } else {
            weight--;
        }
    }
    
    public void birthday() {
        age++;
    }
    
    public void profile() {
        System.out.println();
        System.out.println("Name: " + name);
        if (alive) {
            System.out.println("Age: " + age);
            System.out.println("Weight: " + weight);
            System.out.println("Color: " + color);
        } else {
            System.out.println("IS DEAD!");
        }
    }
    
}
