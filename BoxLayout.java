import javax.swing.Box;
import javax.swing.JComponent;

public class BoxLayout {
  //The BoxLayout arranges components in a container either horizontally  
  // in one column 
  //you need to use the following steps to use a BoxLayout in your program

  //Create a container, for example, a JPanel.
  JPanel hPanel = new JPanel();

  //Create an object of the BoxLayout class. Unlike other layout managers, 
  //you need to pass the container to the constructor 
  // you also need to pass the type of box, you are creating (horizontal or vertical)
  // to its constructor 
  // The class has four constants: X_AXIS, Y_AXIS, LINE_AXIS and PAGE_AXIS.
  //The constants X_AXIS is used to create a horizontal BoxLayout that lays
  // all components from left to right
  //The constants Y_AXIS is used to create a vertical BoxLayout that lays out 
  // all components from top to bottom
  //The other two constants , LINE_AXIS and PAGE_AXIS are similar to X_AXIS and Y_AXIS
  //However, they use the orientation of the container in laying out the components
  //Create a BoxLayout for hPanel to layout components from left to right

  Boxlayout boxLayout = new BoxLayout(hPanel, BoxLayout.X_AXIS);

  //set the layout for the container
  hPanel.setLayout(boxLayout);

  //Add the components to the Container
  hPanel.add(new JButton("Button 1"));
  hPanel.add(new JButton("Button 2"));

  // A Box Layout tries to give the preferred width to all components 
  // in a horizontal layout, the height of the tallest component is 
  // given to all other components.
  //If it cannot adjust the height of a component to match the tallest
  // component in the group, it aligns the component horizontally along the center
  // you can change default alignment by setting the component's alignment or 
  // the container alignment by using the setAlignmentY() method
  //In a vertical layout, it tries to give the preferred height to all components
  // and tries to make  the the size of all component thesame width as the widest component
  //If it cannot make all the components have thesame width, it aligns them
  // vertically along their centerlines. you can change this default alignment
  // by changing either the component's alignment or the container's alignment 
  // using the setAlignmentX() method.
  // The javax.swing package contains a Box class that makes using a BoxLayout easier
  //A Box is a container that uses a BoxLayout as its layout manager
  // The BoxLayout as its layout manager . The Box class provide static 
  //method to create a container with a horizontal or vertical layout
  //The createHorizontalBox() and createVerticalBox() methods create 
  // a horizontal or vertical layout.
  // The createHorizontalBox() and createVertical() methods create a horizontal  
  // and vertical box respectively

  //Create a horizontal box 
  Box hBox = Box.createHorizontalBox();

  //create a vertical box
  Box vBox = Box.createVertical();

  //To add a component to a box, use its add() method, like so
  //Add two buttons to the horizontal box
  hBox.add(new JButton("Button 1"));
  hBox.add(new JButton("Button 2"));

  //The Box class also alllows you to create invisible compponents and add them
  // to a box, so you can adjust the sapcing between two components. It provides 
  // four types of invisible components
  // Glue
  //Strut
  //Rigid Area
  //Filler
  //A glue is an invisble, expandable component. You can create Horizontal 
  // and vertical glues using the createHorizontalGlue() and createVerticalGlue()
  //static method of the  Box class.
  //The following snippet of code uses horizontal glue between two buttons
  // in a horizontal layout. You can also create a glue component using 
  // the createGlue() static method of the Box class that can expand 
  // horizontally as well as vertically.

  Box hBox = Box.createHorizontalBox();
  hBox.add(new JButton("First"));
  hBox.add(Box.createHorizontalGlue());
  hBox.add(new JButton("Last"));


  //A struct is an invisible component of a fixed width or a fixed height
  //You can create a horizontal strut using the createHorizontalStrut() method
  // which takes the width in pixels as an argument
  // you can create a vertical strut using the createVerticalStruct() method
  // which takes height in pixels as an argument
  
  //Add a 100px strut to a horizontal box
  hBox.add(Box.createHorizontalStrut(100));

  // A rigid area is an invisible component that is always thesame size 
  //You can create a rigid area by using the create RigidArea() static method
  // of the Box class. You need to pass a Dimension object to it to 
  // Specify its width and height

  //Add a 10x5 rigid area to a horizontal box
  hBox.add(Box.createRigidArea(new Dimension(10, 5)));


  // A filler is an invisible custom component that you can create by specifying
  //your own minimum, maximum, and preferred sizes. The Filler static nested class
  // of the Box rpresents  a filler

  //Create a filler, which acts like a glue. Note that the glue
  // is just a filler with a minimum and preferred size set to zero
  // and a maximum value set to Short.MAX_VALUE in both directions
  Dimension minSize = new Dimension(0, 0);
  Dimension prefSize = new Dimension(0, 0);
  Dimension maxSize = new Dimension(Short.MAX_VALUE, Short.MAX_VALUE);
  Box.Filler filler = new  Box.Filler(minSize, prefSize, maxSize);

  //You can get a very powerful layout by nesting boxes with a horizontal and 
  // vertical BoxLayout. The Box class provides convenience methods to create 
  // glue, strut, and rigid areas, However they are all objects of the 
  // Box.Filler class. When the minimum and preferred sizes are set to Zero
  // and the maximum size to Short. MAX_VALUE in both directions, 
  // a Box.Filler object acts as a glue. when the maximum height of a glue
  // is set to zero, it acts like a horizontal glue,
  // When the maximum width of a glue is set to Zero, it acts like 
  // a vertical glue. You can create a horizontal strut using Box.Filler class
  // by using its minimum and preferred sizes of a specified width and zero height
  // and a maximum size as the specified width and Short.MAX_VALUE height
  //Can you think of a way to create a rigid area using the Box.Filler class
  //All sizes (minimum, preferred, and maximum) will  be thesame for a rigid area

  //The following snippet of code creates a rigid area of 10x10
  //create a 10x10 rigid area
  Dimension d = new Dimension(10, 10); 
  JComponent rigidArea = new Box.Filler(d, d, d);


}