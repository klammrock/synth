package name.klamm;

import javax.swing.*;

public class App
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(() -> {
            SynthFrame frame = new SynthFrame();
            frame.setVisible(true);
        });
    }
}
