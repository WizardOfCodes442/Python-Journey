public class CardLayout {
  //The CardLayout lays out components in a container as a stack of cards.
  // Like a stack of cards only one card (the card at the top ) is visible at a time
  // you need to use the following step to use the CardLayout for a container

  //Create a container such as a Jpanel 

  JPanel cardPanel = new Panel();

  //Create a CardLayout object
  CardLayout cardlayout = new CardLayout();

  //set the layout manager for the container
  cardPanel.setLayout(cardLayout);

  //Add components to the container. you need to give a name to each component. 
  // To add a JButton to the cardPanel, use the following statement:
  cardPanel.add(new JButton("Card 1"), "myLuckyCard");

  // you have named your card myLuckyCard. This name can be used in the Show() 
  // method of the CardLayout to make this card visible

  // Call its next() method to show the next card
  cardLayout.next(CardPanel);

  //The CardLayout class provides several methods to flip through components
  // By default, it shows the first component that was added to it 
  //All flipping related methods takes the container it manages as its 
  // arguments. The first() and last() methods show the first and the last card
  //The previous() and next() methods show the previous and the next card 
  // from the card currently being shown 
}

