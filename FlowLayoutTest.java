import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Flow Layout Test");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = frame.getContentPane();
    contentPane.setLayout(new FlowLayout());

    for (int i= 1; i <= 3; i++)
      contentPane.add(new JButton("Button " + i));
    
    frame.pack();
    frame.setVisible(true);


    //By  Default, a FlowLayout aligns all component in the center of the container
    // You can change the alignment by using its setAlignment() method or passing 
    // the alignment in its constructor, like so:
    //Set the alignment when you create the layout manager object
    //FlowLayout flowLayout  = new FlowLayout(FlowLayout.RIGHT);

    //set the alignment after you have created the flow layout manager
    //flowLayout.setAlignment(FlowLayout.RIGHT)
    // LEFT, RIGHT, CENTER,LEADING, and TRAILING
    //The LEADING alignment may mean either left or right
    //If the component's orientation is RIGHT_TO_LEFT,the leading 
    // means right and left otherwise
    // Trailing alignment may means either left or right
    // if component orientation is RIGHT_TO_LEFT, the 
    // Trailing alignment means LEFT and RIGTH otherwise
    //good to use leading and trailing instead of right and left
    //so you do not have to worry about orientation of your component

    //You can set the gaps between two components either in the constructor of 
    // the FlowLayout class or using its setHgap() and setVgap() methods.
    //
  } 

}
