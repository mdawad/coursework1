/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Client {
 public static void main(String argv[]) throws Exception {
     Scanner in = new Scanner(System.in);
     int Choicedimension =0;
     int Choiceshape = 0;

  Socket clientS = new Socket("localhost", 1234);
  
  //DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
  //BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
  
  ObjectOutputStream objsend =new ObjectOutputStream(clientS.getOutputStream());
  ObjectInputStream objin=new ObjectInputStream(clientS.getInputStream());
  
  while(true){
      
      System.out.println("Select : \n 1. 2D \n 2. 3D  \n 3. Exit");
      Choicedimension = in.nextInt();
  if (Choicedimension == 1)
  {
      System.out.println("1. Rectanle \n 2. Circle \n 3. Triangle");
      Choiceshape = in.nextInt();
      
      if (Choiceshape == 1)
      {
        System.out.println("Rectangle");
                System.out.println("Input the name of the Rectangle: \n");
                String rectname=in.next();
                System.out.println("Enter the length");
                Double rectlength=in.nextDouble();
                System.out.println("Enter the breadth");
                Double rectbreadth=in.nextDouble();
                Rectangle r=new Rectangle(rectname, rectlength, rectbreadth);
                objsend.writeObject(r);
                double rectarea =r.getArea();
                double rectperimeter = r.getPerimeter();
                System.out.println("Area of the triangle is: " + rectarea);
                System.out.println("Perimeter of the triangle is: " + rectperimeter);
                
      }      
      if (Choiceshape == 2)
      {
          System.out.println("Circle");
          System.out.println("Input the name of the Circle: \n");
          String circlename = in.next();
          System.out.println("Radius of the circle: ");
          double circleradius = in.nextDouble();
          Circle c =new Circle(circlename, circleradius);
          objsend.writeObject(c);
          double circlearea = c.getArea();
          double circleperimeter = c.getPerimeter();
          System.out.println("Area of the cricle is: " + circlearea);
          System.out.println("Perimeter of the cricle is: " + circleperimeter);
          
      }
      
      
      if (Choiceshape == 3)
       {
          System.out.println("Triangle");
          System.out.println("Input the name of the Triangle: \n");
          String tname = in.next();
          System.out.println("Enter the first side:");
          double tside1 = in.nextDouble();
          System.out.println("Enter the second side:");
          double tside2 = in.nextDouble();
          System.out.println("Enter the third side:");
          double tside3 = in.nextDouble();
          
          Triangle t = new Triangle (tname, tside1, tside2, tside3);
          System.out.println("Area of the triangle is: " +t.getArea());
          System.out.println("Perimeter of the triangle is: " +t.getPerimeter());
       }
  }
  
if (Choicedimension == 2)
  {
      System.out.println("1. Sphere \n 2. Cylinder \n");
      Choiceshape = in.nextInt();
      if (Choiceshape == 1)
      {
          System.out.println("Sphere");
          System.out.println("Input the name of the sphere: \n");
          String sname = in.next();
          System.out.println("Enter the radius :");
          double sradius = in.nextDouble();
          
          Sphere s = new Sphere (sname, sradius);
          System.out.println("The surface area is: " + s.getSa());
          System.out.println("The volume is: " + s.getVolume());
      }
      
      if (Choiceshape == 2)
      {
          System.out.println("Cyliinder");
          
          System.out.println("Input the name of the Cylinder: \n");
          String cname = in.next();
          System.out.println("Enter the radius:");
          double cradius = in.nextDouble();
          System.out.println("Enter the height:");
          double cheight = in.nextDouble();
          Cylinder c = new Cylinder (cname, cradius, cheight);
          
          System.out.println("The surface area of the Cylinder is: " + c.getSa());
          System.out.println("The volume of the Cylinder is: " + c.getVolume());
         
      }
      
      
      
  }

if (Choicedimension == 3){
   System.out.print("Bye");
   TimeUnit.SECONDS.sleep(2);
   break;
}
 }

  clientS.close();
 
}}
