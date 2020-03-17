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

    ImageIcon greenFrogBorder = new ImageIcon("GreenFrog2.png");
    ImageIcon redFrogBorder = new ImageIcon("RedFrog2.png");

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

    public void setImage(ImageIcon image)
    {
        this.image = image;
        button.setIcon(image);
    }

    public Square moveTo(Square destinationSquare)
    {
        if (this.getImage().toString() == "GreenFrog2.png") {
            destinationSquare.setImage(new ImageIcon("GreenFrog.png"));
        } else if (this.getImage().toString() == "RedFrog2.png") {
            System.out.println("woo in red");
            destinationSquare.setImage(new ImageIcon("RedFrog.png"));
        } else {
            destinationSquare.setImage(new ImageIcon("LilyPad.png"));
        }
        
        this.setImage(new ImageIcon("lilypad.png"));

        return destinationSquare;
    }

}

