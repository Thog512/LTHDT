package hoctap;
import java.util.Scanner;
public class Shape {
    Scanner sc = new Scanner(System.in);
    public String color;
    public boolean filled;
    
    public Shape(){      
    }
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString(){
        return "color :"+color+ "filled :"+filled;
    }
    
    public class Circle extends Shape{
        public Circle (String color, boolean filled){
            super(color,filled);
        }
        public double Radius;
        public double Area;
        public double Perimeter;
        
        public Circle(double Radius, double Area, double Perimeter){
            this.Radius = 1.0;
            this.Area = Area;
            this.Perimeter = Perimeter;
        }

        public double getRadius() {
            return Radius;
        }

        public void setRadius(double Radius) {
            this.Radius = Radius;
        }
        
        public double getArea() {
            return 3.14*Radius^2;
        }

        public double getPerimeter() {
            return (Radius*2)*3.14;
        }
        
        public String toString(){
            return "Radius ="+Radius+ "Area ="+Area+ "Perimeter ="+Perimeter;
        }
    }
    public class Rectangle extends Shape{
        public Rectangle (String color, boolean filled){
            super(color,filled);
        }
        public double width;
        public double length;
        public double Area;
        public double Perimeter;
        
        public Rectangle(){
        }
        
        public Rectangle(double width, double length){
            this.width = 1.0;
            this.length = 1.0;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }
        
       public double getArea(){
           return length*width;
       }
       
       public double getPerimeter(){
           return (length+width)*2;
       }

        public String toString() {
            return "Rectangle(" + "width=" + width + ", length=" + length + ", Area=" + Area + ", Perimeter=" + Perimeter + ')';
        }
    }
    
    public class Square extends Rectangle{
        public Square (double width, double length, String color, boolean filled){
            super(width,length, color, filled);
        }
        public double side;
        
        public Square(){
        }
        
        public Square(double side){
            this.side = side;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }
        
        public void setwidth(double side){
            this.width = side;
        }
        
        public void setlength(double side){
            this.length = side;
        }

        public String toString() {
            return "Square{" + "side=" + side + '}';
        }
        
    }
    
    }
