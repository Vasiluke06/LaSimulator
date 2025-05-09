import javax.swing.*;
import java.awt.*;

public class Frame_Simulation extends JFrame {
    class MapPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(new Color(34, 139, 34));
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(new Color(30, 144, 255));
            int riverWidth = 80;
            int x = getWidth() / 2 - riverWidth / 2;
            g.fillRect(x, 0, riverWidth, getHeight());
        }
    }
    Frame_Simulation(){
        this.setVisible(true); //creating a frame
        this.setSize(1100, 1000);
        this.setTitle("LaSimulation (simulation)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        /*JLabel label = new JLabel(); //creating a label with text
        label.setText("Simulation will be there\n Parameter = " + Frame_Settings.text1);

        this.add(label);
        label.setBounds(0, 0, 550, 100);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);*/
        this.add(new MapPanel());





    }
}
