package mainclass;


import java.io.*;
import java.net.*;
import java.util.ArrayList;

class Server {
    
    DataInputStream in;
    DataOutputStream out;
    ServerSocket server;
    Socket socket;
    
 public static void main(String argv[]) throws Exception {
 

  while (true) {
      
   ServerSocket welcomeSocket = new ServerSocket(1234);
   Socket connectionSocket = welcomeSocket.accept();
   
    ObjectInputStream objin=new ObjectInputStream(connectionSocket.getInputStream());
   ObjectOutputStream objout=new ObjectOutputStream(connectionSocket.getOutputStream());
   
   Shape shape = (Shape)objin.readObject();
   
   ArrayList<Object> clientin = new ArrayList<Object>();
   clientin.add(shape);
   
   if (shape instanceof TwoD){
       TwoD twoD = (TwoD)shape;
       double area = twoD.getArea();
       double perimeter = twoD.getPerimeter();
            
            if (twoD instanceof Rectangle){
                Rectangle r = (Rectangle) twoD;
                System.out.println("Length of rectangle from Client: " + r.length +  "Breadth of rectangle recieved from client" + r.breadth);
            }
            else if (twoD instanceof Circle){
                Circle c =(Circle) twoD;
                System.out.println("Radius received from Client: "+ c.Radius);
             }
            else if (twoD instanceof Triangle){
               Triangle t = (Triangle)twoD;
               System.out.println("First Side of the Triangle: " + t.side1);
               System.out.println("Second Side of the Triangle: " + t.side2);
               System.out.println("Third Side of the Triangle " + t.side3);
            }
            System.out.println("The area of the shape is :" + area);
            System.out.println("The perimeter of the shape is :" + perimeter);
            
   }
   
    else if(shape instanceof ThreeDShapes){
                ThreeDShapes threeD=(ThreeDShapes)shape;
                double surfarea=threeD.getSa();
                double vol=threeD.getVolume();
                if (threeD instanceof Sphere){
                    Sphere s = (Sphere)threeD;
                    System.out.println("Received radius of Sphere- "+s.Radius);
                }
                if (threeD instanceof Cylinder){
                    Cylinder c=(Cylinder)threeD;
                    System.out.println("Received radius of Cylinder- "+c.Radius);
                    System.out.println("Received height of Cylinder- "+c.Height);
                }
                System.out.println("Surface Area: "+surfarea);
                System.out.println("Volume: "+vol);

  }
 }
 }

}