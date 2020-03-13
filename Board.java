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

    public Board()
    {      
         
        panel.setLayout(new GridLayout(5,5));
      
        //frame.add(panel);
        frame.setTitle("Hopper");
        frame.setSize(700,700);
        frame.setContentPane(panel);

        for(int x = 0; x < 5; x++)
        {
            for (int y = 0; y < 5; y++)
            {              
                square[x][y] = new Square(1, 1, "water.png");
                panel.add(square[x][y].getButton());
                square[x][y].getButton().addActionListener(this);
            }
        }
        

        square[0][0].button.setIcon(lilyPad);
        square[0][2].button.setIcon(lilyPad);
        square[0][4].button.setIcon(lilyPad);

        square[2][0].button.setIcon(lilyPad);
        square[2][4].button.setIcon(lilyPad);

        square[3][1].button.setIcon(lilyPad);
        square[3][3].button.setIcon(lilyPad);

        square[1][1].button.setIcon(greenFrog);
        square[1][3].button.setIcon(greenFrog);
        square[2][2].button.setIcon(greenFrog);

        square[4][0].button.setIcon(greenFrog);
        square[4][4].button.setIcon(greenFrog);

        square[4][2].button.setIcon(redFrog);

        frame.setVisible(true);
      }
  
     
      public void actionPerformed(ActionEvent e)
      { 
          for(int x = 0; x < 5; x++) 
          { 
              for(int y = 0; y < 5; y++) 
              { 
                  if(e.getSource() == square[x][y].getButton()){
                  Icon icon = square[x][y].button.getIcon();
                  square[x][y].moveTo(square1.moveTo(square2));
                  }  
              }
          }

      }

}

    

