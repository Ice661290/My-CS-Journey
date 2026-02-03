import javax.swing.*;
import java.awt.*;

public class Doraemon_Amp extends JFrame {

    public Doraemon_Amp() {
        setTitle("Doraemon Drawing");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel doraemonPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawDoraemon(g);
            }
        };

        add(doraemonPanel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void drawDoraemon(Graphics g) {
        // Draw Doraemon's face
        g.setColor(Color.BLUE);
        g.fillOval(100, 50, 200, 200);

        // Draw Doraemon's eyes
        g.setColor(Color.WHITE);
        g.fillOval(140, 110, 40, 40);
        g.fillOval(220, 110, 40, 40);

        // Draw Doraemon's pupils
        g.setColor(Color.BLACK);
        g.fillOval(155, 125, 15, 15);
        g.fillOval(235, 125, 15, 15);

        // Draw Doraemon's nose
        g.setColor(Color.RED);
        g.fillOval(195, 160, 20, 20);

        // Draw Doraemon's mouth
        g.setColor(Color.BLACK);
        g.drawArc(170, 160, 60, 40, 0, -180);

        // Draw Doraemon's whiskers
        g.drawLine(120, 120, 180, 140);
        g.drawLine(120, 150, 180, 160);
        g.drawLine(120, 180, 180, 180);

        g.drawLine(280, 120, 220, 140);
        g.drawLine(280, 150, 220, 160);
        g.drawLine(280, 180, 220, 180);

        // Draw Doraemon's bell
        g.setColor(Color.YELLOW);
        g.fillOval(185, 220, 30, 30);

        // Draw Doraemon's body
        g.setColor(Color.BLUE);
        g.fillRect(120, 250, 160, 80);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Doraemon_Amp());
    }
}
