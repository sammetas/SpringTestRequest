package com.example.SpringTestRequest;

public class ShapeExs {

    public static void main(String[] a) throws CloneNotSupportedException {

        Shape s1= new Shape("Triangle","yellow");
        Shape s2= new Shape("Square","Blue");

        Shape new1=s1.UT("Rectangle");
        Shape new2=s1.cloneShape();
        System.out.println(s1.getType()+"changed to "+ new2.getType()+ new2.getColor());


    }
}

class  Shape implements  Cloneable{
    //Shape shape;
    String type;
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

     public Shape cloneShape() throws CloneNotSupportedException {
       return (Shape)this.clone();
    }


    public Shape(String type,String color) {
this.color=color;
this.type=type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Shape CS(Shape shape) throws CloneNotSupportedException {
        return shape.cloneShape();

    }

    public Shape UT(String type ) throws CloneNotSupportedException {
        Shape  tempS=(Shape)this.clone();
        tempS.type=type;
        return  tempS;

    }

    public Shape UC(String color) throws CloneNotSupportedException {
        Shape  tempS=(Shape)this.clone();
        tempS.color=color;
        return  tempS;

    }

}



