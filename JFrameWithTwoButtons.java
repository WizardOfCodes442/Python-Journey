import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;

public class JFrameWithTwoButtons {
  public static void main(String[] args) {
    JFrame frame = new Jframe("Adding Components to JFrame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton closeBtn = new JButton("Close");
    JButton helpButton = new JButton("Help");

    Container  contentPane = frame.getContentPane();
    contentPane.add(closeBtn);
    contentPane.add(helpButton);
    frame.pack();
    frame.setVisible(true);
  }  
}
