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
    int x1 = -1;
    int y1 = -1;
    int possibleX;
    int possibleY;
    

    public Board()
    {      
         
        panel.setLayout(new GridLayout(5,5));
      
        //frame.add(panel);
        frame.setTitle("Hopper");
        frame.setSize(770,770);
        frame.setContentPane(panel);

        for(int x = 0; x < 5; x++)
        {
            for (int y = 0; y < 5; y++)
            {              
                square[x][y] = new Square(x, y, water);
                panel.add(square[x][y].getButton());
                square[x][y].getButton().addActionListener(this);
            }
        }
        

        
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
          
          JButton source = (JButton)e.getSource();

          for(int x = 0; x < 5; x++)
          { 
              for(int y = 0; y < 5; y++)
              { 
                possibleX = x - x1;
                possibleY = y - y1;
                

                if(source.equals(square[x][y].button))
                {
                    if(clicked == false && (square[x][y].getImage() == greenFrog || square[x][y].getImage() == redFrog))
                    {
                        icon = square[x][y].getImage();
                        
                        x1 = square[x][y].getXPosition();
                        y1 = square[x][y].getYPosition();
                    
                        if(square[x][y].getImage() == greenFrog)
                        {
                            square[x][y].setImage(greenFrogBorder);
                        }
                        else if (square[x][y].getImage().equals(redFrog))
                        {
                            square[x][y].setImage(redFrogBorder);
                        }

                        clicked = true;
              }
              else if(clicked == true)
              {
                square[x][y].setImage(icon);
                square[x][y].setImage(lilyPad);
                clicked = false;

              }

              else if (clicked == false)
              {
                square[x][y].setImage(lilyPad);
              }
              

             }
        }
    }
    }
}







        //   for(int x = 0; x < 5; x++) 
        //   { 
        //       for(int y = 0; y < 5; y++) 
        //       { 
        //           if(e.getSource() == square[x][y].getButton()){
        //           Icon icon = square[x][y].button.getIcon();
        //           square[x][y].moveTo(square1.moveTo(square2));
        //           }  
        //       }
        //   }

    



    

