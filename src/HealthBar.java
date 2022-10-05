import javax.swing.*;
import java.awt.*;

public class HealthBar extends JPanel {
    int Width = 200;
    int Height = 50;
    Friend f; //Friend
    Friend e; //Enemy
    public HealthBar(Friend f, Friend e) {
        this.f = f;
        this.e = e;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        addHealthbar(g);
    }

    protected void addHealthbar(Graphics g) {

        double currentHealthPercantage = (double)f.getHP() / f.getMaxHP();
        int currentHealthBarWidth = (int)(currentHealthPercantage * Width);
        int currentGrayBarWidth = Width - currentHealthBarWidth;
        int x = 10+currentHealthBarWidth;


        g.setColor(Color.GRAY);
        g.fillRect(x, 50, currentGrayBarWidth, Height);

        g.setColor(Color.RED);
        g.fillRect(10,50,currentHealthBarWidth,Height);

    }
}
