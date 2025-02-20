package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Hauptmenue {
    public static JFrame createMainFrame() {
        JFrame frame = new JFrame("Restaurant Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 1, 10, 10));
        frame.setLocationRelativeTo(null);
        return frame;
    }

    public static void createAndShowMenu(JFrame frame) {
        JLabel titleLabel = new JLabel("Restaurant Manager", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(titleLabel);

        JButton btnReservierungen = new JButton("Reservierungen verwalten");
        JButton btnBestellungen = new JButton("Bestellungen verwalten");
        JButton btnKueche = new JButton("Küchen-Interface");
        JButton btnRechnungen = new JButton("Rechnungen verwalten");
        JButton btnStatistiken = new JButton("Statistiken anzeigen");

        frame.add(btnReservierungen);
        frame.add(btnBestellungen);
        frame.add(btnKueche);
        frame.add(btnRechnungen);
        frame.add(btnStatistiken);

        ActionListener actionListener = e -> JOptionPane.showMessageDialog(frame, e.getActionCommand() + " geöffnet");
        btnReservierungen.addActionListener(actionListener);
        btnBestellungen.addActionListener(actionListener);
        btnKueche.addActionListener(actionListener);
        btnRechnungen.addActionListener(actionListener);
        btnStatistiken.addActionListener(actionListener);

        frame.setVisible(true);
    }
}
