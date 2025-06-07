package name.klamm;

import javax.swing.*;
import java.awt.*;

class SynthPanel extends JPanel {
    private int rectX = 50, rectY = 50;

    public SynthPanel() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        g.setColor(Color.BLUE);
        g.fillRect(rectX, rectY, 200, 100);
    }
}
