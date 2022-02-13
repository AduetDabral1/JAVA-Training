/*
Name: Aduet Dabral
Roll No: 190184010
SAP ID: 1000013239
Program: B.Tech CSE (AI-DS) A
Technical Training Batch - 2
*/

import java.util.Date;

class Shape{
    String color;
    double area;
    double perimeter;
    Date date = new Date();

    Shape(){
        this.color = "Red";
    }

    void dateOfCreation(){
        System.out.println("A new shape was created on : " + date);
    }

    void computeArea(){
        System.out.println("The area is : " + area);
    }
}


class Square extends Shape{
    double side;

    Square (Double side){
        this.side = side;
    }

    @Override
    void computeArea(){
        area = side * side;
        System.out.println("The area of square is : " + area);
        }
}


class Circle extends Shape{
    private static final double PI = 3.1457;
    double radius;

    Circle (double radius){
        this.radius = radius;
    }

    @Override
    void computeArea(){
        area = PI * radius * radius;
        System.out.println("The area of circle is : " + area);
    }
}


class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void computeArea(){
        area =  length * breadth;
        System.out.println("The area of rectangle is : " + area);

    }
}


public class Assignment{

    void caller(Shape shape1){
        shape1.dateOfCreation();

        if(shape1 instanceof Square){
            Square sq = (Square) shape1;   //Down-casting
            sq.computeArea();
        }

        else if(shape1 instanceof Circle){
            Circle cir = (Circle) shape1;   //Down-casting
            cir.computeArea();
        }

        else if(shape1 instanceof Rectangle){
            Rectangle rec = (Rectangle) shape1;   //Down-casting
            rec.computeArea();
        }

    }
    public static void main(String[] args) {
        Assignment object = new Assignment();

        Shape s1 = new Square(6.5);
        object.caller(s1);
        System.out.println("==========================================================");

        Shape s2 = new Circle(7.7);
        object.caller(s2);
        System.out.println("==========================================================");

        Shape s3 = new Rectangle(5.0,9.0);
        object.caller(s3);
        System.out.println("==========================================================");
    }
}