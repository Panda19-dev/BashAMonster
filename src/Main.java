import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Friend friend = new Friend("Tilda",100,20,true);
        Friend enemy = new Friend("Beetlejuice", 20, 30, false);
        friend.setHP(43);
        drawWindow(friend, enemy);
    }

    public static void drawWindow(Friend friend, Friend enemy) {
        JFrame frame = new JFrame("Healthbar"); //create the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set action on closing window
        HealthBar healthbar = new HealthBar(friend, enemy); //Create the canvas
        healthbar.setPreferredSize(new Dimension(900, 450));
        frame.getContentPane().add(healthbar); // add the canvas to the frame
        frame.pack(); // Package everything
        frame.setVisible(true); //make everything visible
    }
}