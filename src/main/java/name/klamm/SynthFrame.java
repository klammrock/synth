package name.klamm;

import javax.swing.*;

public class SynthFrame extends JFrame {
    public SynthFrame() {
        setTitle("SynthFrame Synth Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        add(new SynthPanel());
    }
}
