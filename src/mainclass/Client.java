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

  Socket clientSocket = new Socket("localhost", 1234);
  
  //DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
  //BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
  
  ObjectOutputStream objsend =new ObjectOutputStream(clientSocket.getOutputStream());
  ObjectInputStream objin=new ObjectInputStream(clientSocket.getInputStream());
  
  while(true){
      
      System.out.println("Select : \n 1. 2D \n 2. 3D  \n 3. Exit");
      Choicedimension = in.nextInt();
  if (Choicedimension == 1)
  {
      System.out.println("1. Rectanle \n 2. Circle \n 3. Triangle");
      Choiceshape = in.nextInt();
      
      if (Choiceshape == 1)
      {
        System.out.println("You have selected Rectangle");
                System.out.println("What is the name of the Rectangle");
                String rectname=in.next();
                System.out.println("Enter the length of the Rectangle");
                Double rectlength=in.nextDouble();
                System.out.println("Enter the breadth of the Rectangle");
                Double rectbreadth=in.nextDouble();
                Rectangle r=new Rectangle(rectname, rectlength, rectbreadth);
                objsend.writeObject(r);
                double rectarea =r.getArea();
                double rectperimeter = r.getPerimeter();
                System.out.println("The area of the triangle is: " + rectarea);
                System.out.println("The perimeter of the triangle is: " + rectperimeter);
                
      }      
      if (Choiceshape == 2)
      {
          System.out.println("You have selected Circle");
          System.out.println("What is the name of the Circle");
          String circlename = in.next();
          System.out.println("Enter the radius of the circle: ");
          double circleradius = in.nextDouble();
          Circle c =new Circle(circlename, circleradius);
          objsend.writeObject(c);
          double circlearea = c.getArea();
          double circleperimeter = c.getPerimeter();
          System.out.println("The area of the cricle is: " + circlearea);
          System.out.println("The perimeter of the cricle is: " + circleperimeter);
          
      }
      
      
      if (Choiceshape == 3)
       {
          System.out.println("You have selected Triangle");
          System.out.println("What is the name of the Triangle");
          String tname = in.next();
          System.out.println("Enter the first side of the triangle: ");
          double tside1 = in.nextDouble();
          System.out.println("Enter the second side of the triangle: ");
          double tside2 = in.nextDouble();
          System.out.println("Enter the third side of the triangle: ");
          double tside3 = in.nextDouble();
          
          Triangle t = new Triangle (tname, tside1, tside2, tside3);
          System.out.println("The area of the triangle is: " +t.getArea());
          System.out.println("The Perimeter of the triangle is: " +t.getPerimeter());
       }
  }
  
if (Choicedimension == 2)
  {
      System.out.println("1. Sphere \n 2. Cylinder \n");
      Choiceshape = in.nextInt();
      if (Choiceshape == 1)
      {
          System.out.println("You have selected Sphere");
          System.out.println("Enter the Name of the sphere :");
          String sname = in.next();
          System.out.println("Enter the radius of the sphere :");
          double sradius = in.nextDouble();
          
          Sphere s = new Sphere (sname, sradius);
          System.out.println("The surface area of the sphere is: " + s.getSa());
          System.out.println("The volume of the sphere is: " + s.getVolume());
      }
      
      if (Choiceshape == 2)
      {
          System.out.println("You have selected Cyliinder");
          
          System.out.println("Enter the Name of the Cylinder :");
          String cname = in.next();
          System.out.println("Enter the radius of the Cylinder :");
          double cradius = in.nextDouble();
          System.out.println("Enter the height of the Cylinder :");
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

  clientSocket.close();
 
}}
