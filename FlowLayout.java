import java.awt.ComponentOrientation;

import javax.swing.JComponent;

public class FlowLayout {
  // The FlowLayout is the simplest layout manager
  // It lays out the component horizontally, and the vertically 
  // It lays the component in the order they are added to the container
  //When it is laying the component horizontally 
  // it may lay them left to right, or right to left 
  // The horizontal layout direction depends on the 
  // Orientation of The container
  // which you can set  by calling its setComponentOrientation() method
  //If you want to set the orientation of a container and all its children
  // you can use the applyComponentOrientation() method instead
  

  //Here is a snippet of code that set the orientation of a container
  //Method - 1
  //Set the orientation of the contentpane of a Frame to "right to left"
  JFrame frame = new JFrame("Test");
  Container pane = frame.getContentPane();
  pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

  //method - 2
  //Set the orientation of the Content pane and all its children to "right to left"
  JFrame frame = new JFrame("Test");
  Container pane = frame.getContentPane();
  pane.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);


  // If your application is multilingual and the component orientation will be decided at 
  // runtime, you may want to set the components locale and orientation in a more generic way
  // rather than hard coding them. you can globally set the default locale for all Swing
  // components in your application like so

  //"ar" is used for Arabic locale
  JComponent.setDefaultLocale(new Locale("ar"));

  //When you create a JFrame, you can get the component's orientation according to 
  // The default locale and set it to the frame and its children 
  // This way, you do not have to set the orientation for every container in 
  // your application

  //Get the default locale
  Locale defaultLocale = JComponent.getDefaultLocale();

  //Get the component's orientation for the default locale
  ComponentOrientation componentOrientation = ComponentOrientation.getOrientation(defaultLocale);

  //Apply the Component's default orientation for whole frame
  frame.applyComponentOrientation(componentOrientation);

  //A Flow Layout tries to place all component into one row, giving them their preferred size
  //if all components do not fit into one row its start another row
  //Every layout manager has to compute the height and width of the space
  // where it needs to lay out all components. A FlowLayout asks for width 
  //Which is the sum of the preferred widths of all components 
  // it asks for height , which is the height of the tallest components
  //in the container.
  //it adds extra space to the width and height to account for horizontal 
  // and vertical gaps between the components  

}