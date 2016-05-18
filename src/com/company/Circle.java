package com.company;

/**
 * Created by mazi on 18.05.2016.
 */
public class Circle {

    private int radius;

    // Constructor
    public Circle(){
        radius = 0;
    }
    public Circle(int radius){
        this.radius = radius;
    }

    /**
     * This method count area of circle
     * @return integer value
     */
    public int area(){
        return (int)Math.PI * radius * radius;
    }

    /**
     * This method count circumferenc
     * @return integer value
     */
    public int circumference(){
        return (int) ((int)2 * Math.PI * radius);
    }

    /**
     * This method count diameter of circle
     * @return
     */
    public int diameter(){
        return 2 * radius;
    }

    /**
     * This method count sector area of circle
     * @param angle degree
     * @return integer value or -1 in case wrong input
     */
    public int sectorArea(int angle){
        if ((angle >= 0) && (angle <= 360)){
            return (int) ((Math.PI * Math.pow(radius, 2) * angle) / 360);
        }
        return -1;
    }

    /**
     * This method check input value and set radius
     * @param radius integer value
     */
    public void setRadius(int radius) {
        if (radius >= 0){
            this.radius = radius;
        }
    }

    public void print(){
        System.out.print("Radius: " + radius);
    }

    /**
     * This method override equals method
     * @param obj input Circle object
     * @return boolean result
     */
    public boolean equals(Circle obj){
        if (this == obj){ // same address
            return true;
        }
        if (obj == null){ // no address
            return false;
        }
        if (obj instanceof Circle){
            Circle temp = (Circle) obj;
            return this.radius == temp.radius;
        }else{
            return false;
        }
    }

    /**
     * This method generate hashcode
     * @return integer value
     */
    public int hashCode(){
        return 17 * radius + radius % 3;
    }

    /**
     * This method override toString
     * @return String constant
     */
    public String toString(){
        return getClass().getName() + "@radius" + radius;
    }

}
