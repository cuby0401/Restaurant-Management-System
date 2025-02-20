import javax.swing.*;

import static gui.Hauptmenue.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = createMainFrame();
            createAndShowMenu(frame);
        });    }
}