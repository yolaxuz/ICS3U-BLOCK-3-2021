package week9;

public class Rectangle {

    private double length; 
    private double width; 

    public Rectangle(double l, double w) {
        length = l; 
        width = w; 
    }

    public Rectangle(double side){
        length = side; 
        width = side; 
    }

    public double getArea() {
        return length*width; 
    }
    
    public double getPerimeter() {
        return (length*2) + (width*2); 
    }
    public boolean isSqaure() {
        return length == width; 
    }

    public boolean equals(Object obj) {
        if (obj == this) 
            return true; 
        if (obj instanceof Rectangle) {
            return this.length == ((Rectangle) obj).length && this.length == ((Rectangle) obj).width; 
        } else {
            return false; 
        }
    }

    public String toString() {
        return "Rectangle with length of "+ length + " and width of " + width; 
    }
}
