package entities;

public class Rectangle {
   public double width;
   public double height;

   public double area(){
       return width * height;
   }

   public double perimeter(){
       return (width + height) * 2;
   }

   public double diagonal() {
       return Math.sqrt(Math.pow(width, 2)+ Math.pow(height, 2));
   }

   public String toString (){
       return
               "AREA = "
               + String.format("%.2f%n", area())
               + "PERIMENTER = "
               + String.format("%.2f%n", perimeter())
               + "DiAGONAL = "
               + String.format("%.2f", diagonal());
   }
}