package gui;

import javax.swing.*;

public class GuiDesign {
    public static void guiDesign()
    {
        try {
            // Windows Look & Feel
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
