import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Square 
{
    ImageIcon image;
    int xPosition;
    int yPosition;
    String imageName;
    JButton button = new JButton();

    public Square(int x, int y, ImageIcon image)
    {
        this.image = image;
        button = new JButton();
        button.setIcon(image);
        xPosition = x;
        yPosition = y;
        this.setXPosition(x);
        this.setYPosition(y);
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

    public ImageIcon getImage()
    {
        return this.image;
    }

    // public void setImage(ImageIcon image)

    public void setImage(ImageIcon image)
    {
        this.image = image;
        button.setIcon(image);
    }

    // public void moveTo(JButton square2)
    // {
    //     System.out.println("kds");
    //     // icon = square1.getIcon();
    //     // square2.setIcon(icon);
    //     // square11.setIcon(lilyPad);
    
    //     // square[x][y].button.getIcon();
        
    //     // button.getIcon();
    //     // get the icon of the current square
    //     // this.getIcon();
    //     // set the current square's icon to be a lily pad


    //     //set the new square's icon to be the icon of the old square (frog)
    // }

}

