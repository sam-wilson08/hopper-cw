import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Square 
{
    ImageIcon Image;
    int xPosition;
    int yPosition;
    String imageName;
    JButton button = new JButton();

    public Square(int x, int y, String image)
    {
        Image = new ImageIcon(image);
        button.setIcon(new ImageIcon(image));
        xPosition = x;
        yPosition = y;
    }

    public JButton getButton()
    {
        return button;
    }

    public int getXPosition()
    {
        return xPosition;
    }

    public void setXPosition(int x)
    {
        this.xPosition = x;
    }

    public int getYPosition()
    {
        return yPosition;
    }

    public void setYPosition(int y)
    {
        this.yPosition = y;
    }

    // public ImageIcon getImageIcon()
    // {
    //     System.out.println(imageIcon);
    //     return imageIcon;
    // }

    // public void setImageIcon(String image)
    // {
    //     this.imageIcon = new ImageIcon(image);
    //     System.out.println(image);
    // }

    public void moveTo(JButton square2)
    {
        System.out.println("kds");
        // icon = square1.getIcon();
        // square2.setIcon(icon);
        // square11.setIcon(lilyPad);
    
        // square[x][y].button.getIcon();
        
        // button.getIcon();
        // get the icon of the current square
        // this.getIcon();
        // set the current square's icon to be a lily pad


        //set the new square's icon to be the icon of the old square (frog)
    }

}

