import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Board implements ActionListener
{
    JFrame frame = new JFrame("Hopper");
    JPanel panel = new JPanel();

    Square[][] square = new Square[5][5];

    ImageIcon water = new ImageIcon("water.png");
    ImageIcon lilyPad = new ImageIcon("LilyPad.png");
    ImageIcon greenFrog = new ImageIcon("GreenFrog.png");
    ImageIcon redFrog = new ImageIcon("RedFrog.png");
    ImageIcon greenFrogBorder = new ImageIcon("GreenFrog2.png");
    ImageIcon redFrogBorder = new ImageIcon("RedFrog2.png");
    boolean clicked = false;
    ImageIcon icon = new ImageIcon();
    int x1;
    int y1;
    int possibleX;
    int possibleY;
    

    public Board()
    {   //creates a grid 5 by 5
        panel.setLayout(new GridLayout(5,5));
      
        frame.setTitle("Hopper");
        frame.setSize(770,770);
        frame.setContentPane(panel);
        //creates 5 buttons across and 5 buttons down, therefore making 25 total buttons
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {  
                //creates and instance of each square            
                square[x][y] = new Square(x, y, water);
                panel.add(square[x][y].getButton());
                //enables each button to be aware of clicks 
                square[x][y].getButton().addActionListener(this);
            }
        }
        
        //sets the icon of each square to initialide the board
        square[0][0].setImage(lilyPad);
        square[0][2].setImage(lilyPad);
        square[0][4].setImage(lilyPad);
    
        square[2][0].setImage(lilyPad);
        square[2][4].setImage(lilyPad);
    
        square[3][1].setImage(lilyPad);
        square[3][3].setImage(lilyPad);
    
        square[1][1].setImage(greenFrog);
        square[1][3].setImage(greenFrog);
        square[2][2].setImage(greenFrog);
    
        square[4][0].setImage(greenFrog);
        square[4][4].setImage(greenFrog);
    
        square[4][2].setImage(redFrog);
    
        frame.setVisible(true);
    }

      public void actionPerformed(ActionEvent e)
      {
          //gets source information of the button which has been clicked
        JButton source = (JButton)e.getSource();

        for (int x = 0; x < 5; x++) { 
            for (int y = 0; y < 5; y++) { 
                //checks if the clicked button exists on the board
                if (source.equals(square[x][y].button)) {
                    //ensures legal move (only red and green frog allowed)
                    if (clicked == false && (square[x][y].getImage() == greenFrog || square[x][y].getImage() == redFrog)) {
                        //stores the x, y and icon of the button that was clicked first
                        x1 = square[x][y].getXPosition();
                        y1 = square[x][y].getYPosition();

                        icon = square[x1][y1].getImage();
                        //sets the icon to a bordered icon
                        if (square[x1][y1].getImage() == greenFrog) {
                            square[x1][y1].setImage(greenFrogBorder);
                        } else if (square[x1][y1].getImage().equals(redFrog)) {
                            square[x1][y1].setImage(redFrogBorder);
                        }
                        //clicked = true after the first click
                        clicked = true;
                        //if this is the second click
                    } else if (clicked == true) {
                        //calls the moveTo method from the Square class
                        square[x1][y1].moveTo(square[x][y]);
                        //sets clicked to false
                        clicked = false;
                    }
                }
            }
        }
    }
}