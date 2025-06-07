package name.klamm;

import java.awt.BorderLayout;
import javax.swing.*;

public class SynthFrame extends JFrame {
    public SynthFrame() {
        setTitle("SynthFrame Synth Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        JPanel myPanel = new JPanel(new BorderLayout());
        myPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add some padding

        JButton myButton = new JButton("Play");

        myButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Playing");
        });

        myPanel.add(myButton, BorderLayout.NORTH);
        myPanel.add(new SynthPanel(), BorderLayout.CENTER);

        add(myPanel);
    }
}
