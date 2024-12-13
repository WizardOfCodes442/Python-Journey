import javax.swing.JButton;

public class SwingUtilityClass {
  
  //The point class 
  // An object of the Point class represents a location in a two -dimensional space
  // A location in two dimensional space is represented by two values 
  // an x coordinate and a y coordinate 
  // The following snippet of code demonstrates its uses

  // Create an object of the point class with (x, y) coordinate of (20, 40)
  Point p = new Point(20, 40);

  //Get the x and y coordinate of p 
  int x = p.getX();
  int y = p.getY();

  // Set the x and y coordinates of p to (10, 60)
  p.setLocation(10, 60);

  // The main usage of the point class in swing is to set and get the location (x and y coordinates)
  // of a component
  // For example you can set the location of a JButton
  JButton closeButton = new JButton("Close");
  // The following two statements do thesame thing.
  // you will use one of the following statements , not both
  closeButton.setLocation(10, 15);
  closeButton.setLocation(new Point(10, 15));

  // Get the location of the closeButton
  Pointer p = closeButton.getLocation();

  //The Dimension class
  // An object of the Dimension class wraps the width and height of component 
  // The width and height of  component are collectively known  as its size 
  // In other words an object of the Dimension class  is used  to represent the size of 
  // a component

  // Create an object of the dimension  class with a Width and height of 200 and 20
  Dimension d = new Dimension(200, 20);

  // Set the size of the closeButton to 200 X 20  
  // Both of these statements have thesame effect
  // you will use one of the following two statements 
  closeButton.setSize(200, 20);
  closeButton.setsize(d);

  //get the size of closeButton
  Dimension d2 = closeButton.getSize();
  int width = d2.width;
  int height = d2.height;

  //The Insets Class
  // An object of the Insets class represent spaces that are left around a container
  //It wraps four properties named top, left, bottom, right. 
  //Create an oject of the insets  class represents spaces that are left around
  // a container. It wraps four properties named top, left, bottom, and right
  // Their values represent the spaces left on the four sides of a container

  //create an object of the Insets class using its constructor Insets(top,left, bottom, right)
  Insets ins = new Insets(20, 5, 5, 5);

  //Get the insets of a JFrame
  Insets ins = frame.getInsets();
  ins top = ins.top;
  int left = ins.left;
  int bottom = ins.bottom;
  int right = ins.right;

  //The rectangle class
  //As its name suggests, an instance of the Rectangle class represents a rectangle
  //you can define a rectangle in many ways. A rectangle is defined by three properties

  // (x, y) coordinates of the upper leftcorner
  // Width
  // Height
  // A Rectangle Object as a combination of a Point object and a Dimension object
  // The point object holds the (x, y) coordinates of the upper-left corner
  // and the Dimension object holds the width and height
  // You can create an object of the Rectangle class by specifying 
  // different combinations of its properties

  // Create  a Rectangle object whose upper-left corner is at (0,0) with zero width
  // and height 
  Rectangle r1 = new Rectangle();

  //Create a rectangle object from Point object with zero width and height
  Rectangle r2 = new Rectangle(new Point(10, 10));

  // Create a Rectangle object from a Point and Dimension object
  Rectangle r3 = new Rectangle(new Point(20, 20), new Dimension(200, 100));

  //Create a Rectangle object by specifying its upper-left corner's 
  // coordinate at (10, 10) and width as 200 and height as 100
  Rectangle r4 = new Rectangle(10, 10, 200, 100);

  // Rectangle class  defines many methods to manipulate a Rectangle object
  // and to inquire about its properties, such as the (x,y) cordinate
  // of its upper-left corner, width, and height

  // An object of the Rectangle class defines the loaction of a swing class
  // the location and size of a component are known as component's bounds 
  // Two methods , setBounds() and getBounds() cab be used to set and get the bounds
  // of any conponent or container. 
  // The setBounds() method is overloaded and you can specify x,y,width, and height
  //properties of a component, or a Rectangle object.
  //The getBounds() method does.
  // Similarly, you can use the combination of getLocation() or getX() and getY()
  // and getSize() (or getWidth() and getHeight()) instead of using the getBounds() method

}
