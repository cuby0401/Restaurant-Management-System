package gui;


import javax.swing.*;
import java.awt.*;

public class resevierungsverwaltungGui {

    public static void main(String[] args) {
        GuiDesign.guiDesign();
        createWindowReservierung();
    }

    public static void createWindowReservierung()
    {
        JFrame frame = new JFrame("Reservierungsverwaltung");
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton btnNewRes = new JButton("Neue Reservierung erstellen");
        frame.add(btnNewRes);

        JLabel lblResNrInput = new JLabel("Reservierungsnummer suchen", SwingConstants.CENTER);
        frame.add(lblResNrInput);

        JTextField resNrTxtField = new JTextField(20);
        resNrTxtField.setSize(5,10);
        frame.add(resNrTxtField);

        JButton btnBestaetigen = new JButton("Bestätigen");
        btnBestaetigen.setSize(5,5);
        frame.add(btnBestaetigen);


        frame.setVisible(true);
    }
}
