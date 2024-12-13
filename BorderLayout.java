import javax.swing.JButton;

public class BorderLayout {
  //The BorderLayout divides a container's space into five areas: north, south , east and west
  //when you add component to a container with a BorderLayout, you need to specify
  // to which of the five areas you want to add the component. The Border Layout class 
  // defines  five constants to identify each of the five areas you want to add component 
  // The BorderLayout class defines five constants to identify each of the five areas
  // The constants are NORTH, SOUTH, EAST, and CENTER


  //Add a button to the North area of the container 
  JButton northButton = new JButton("North");
  container.add(northButton, BorderLayout.NORTH);

  // The default layout for the content pane of a JFrame is a BorderLayout
  //You can add at most one component to one area of a BorderLayout
  // if you want to add more than one component to an area of a BorderLayout
  // You can do so by adding those component to a container and then adding the container
  // to the desired area
  // four more constants exits to specify areas in a BorderLayout
  //These constants are PAGE_START, PAGE_END, LINE_START, and LINE_END
  //The PAGE_START and PAGE_END constants are thesame as NORTH and SOUTH constants
  // The LINE_START and LINE_END constants change their positions depending on the orientation of 
  // the container
  // If container orientation is left to right, LINE_START is thesame as WEST and LINE_END is thesame as EAST
  //If the container's orientation is right to left, the case is otherwise 
  //If you do not specify area for a component, it is added to the center, The following two statements 
  // have thesame effect 
  // Assume that the container has a Border Layout 
  // Add a button to the Container without specifying the area
  container.add(new JButton("Close"));

  //The above statement has thesame effect as the following
  container.add(new JButton("Close"), BorderLayout.CENTER);

  //if you add more than one component to thesame area of a BorderLayout
  // That is what happens if you write the following code
  //Assume that container has a BorderLayout
  container.add(new JButton("Close"), BorderLayout.NORTH);
  container.add(new JButton("Help"), BorderLayout.NORTH);

  // it will only display the last button added to it

  // A border layout compute the size of the componnet based on the area 
  // in which they are placed. It respects the preferred height of the component 
  // in north and south, However it stretches the component's width horizontally 
  // according to the available space in North and South
  // it does not respect  
}
