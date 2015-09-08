package FullCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by San on 31.08.2015.
 */
public class ButtonsListener implements ActionListener {
    private JTextField field;
    private int value1 = 0;

    public ButtonsListener(JTextField field) {
        this.field = field;
    }

    public void actionPerformed (ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String clickedButtonLabel = clickedButton.getText();
        switch (clickedButtonLabel){
            case "C":
                field.setText("");
                break;
            case "+":
                value1 = Integer.parseInt(field.getText());
                field.setText("");
                break;
            case "-":
                value1 = - Integer.parseInt(field.getText());
                field.setText("");
                break;
            case "=":
                int value2 = Integer.parseInt(field.getText());
                int sum = value1 + value2;
                if (value1<0) sum = sum*(-1);
                field.setText("" + sum);
                break;
            default:
                field.setText(field.getText() + clickedButtonLabel);
                break;
        }
    }
}
