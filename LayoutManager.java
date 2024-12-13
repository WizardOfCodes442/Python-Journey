import javax.swing.JPanel;
import java.awt.Container;
public class LayoutManager {
  // A container uses a layout manager to compute the position and size of all its components.
  // In other words, the job of a layout manager is to compute four properties (x,y,width, and height)
  // of all components in a container
  // The x and y properties determine the position of a component within the container
  // The width and height properties determine the size of the component.

  //If you do not use a Layout Manager, you are responsible for computing 
  //and setting the position and size of all component in a container
  // Technically, a layout manager is an object of Java class that implements the 
  //LayoutManager interface 
  // There is another interface called The LayoutManager2 that inherits from The 
  // LayoutManager interface 
  // some of the layout manager classes implements the LayoutManager2 interface
  // Both can be found in the java.awt package
  // Some of The Contemporary Layout Manager
  // FlowLayout
  //BorderLayout
  //CardLayout
  //BoxLayout
  //GridLayout
  //GridBagLayout
  //GroupLayout
  //SpringLayout
  

  //Every Container has a default layout Manager
  //The default layout manager for the content pane of a JFrame
  // is BorderLayout, and for a Jpanel is FlowLayout  
  // you can change the default layout by using its SetLayout() method
  //If you do not want your container to use a layout manger
  // you can pass null to the setLayout() method
  //The getLayout() method of a container returns the reference of 
  // the layout manager the container is currently using
  //set FlowLayout as the layout manager for the content pane of a JFrame
  JFrame frame = new JFrame("Test Frame");
  Container contentPane = frame.getContentPane();
  contentPane.setLayout(new FlowLayout());

  //Set BorderLayout as The layout manager for JPanel
  JPanel panel = new Jpanel();
  panel.setLayout(new BorderLayout());

  //Get the layout manager for a container
  LayoutManager layoutManager = container.getLayout();


  //Starting from Java5, the calls to add() and setLayout() methods on a JFrame
  // are forwarded to its contentPane. But before java 5, calling these methods 
  // on a JFrame would throw a runtime exception, That is, from Java 5
  // calling these methods on a JFrame would throw a runtime exception 
  // From java the two calls frame.setLayout() and frame.add() will do 
  // thesame thing as caling frame 
  //getContentPane().setLayout() and frame.getContentPane.add()
  //It is very important to note that the getLayout() method of a JFrame 
  // returns the layout manager of the JFrame, not its content pane
  //

}
