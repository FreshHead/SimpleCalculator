package FullCalculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by san on 21.08.15.
 */
public class GridBagPanel extends JPanel{
    ButtonsListener buttonsListener;
    public GridBagPanel() {
        super();
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        JTextField field = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(field, gbc);
        gbc.gridwidth = 1;

        buttonsListener = new ButtonsListener(field);

        JButton clear = new JButton("C");
        gbc.gridx = 2;
        gbc.gridy = 0;
        this.add(clear, gbc);
        clear.addActionListener(buttonsListener);

        JButton result = new JButton("=");
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(result, gbc);
        result.addActionListener(buttonsListener);

        JButton plus = new JButton("+");
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(plus, gbc);
        plus.addActionListener(buttonsListener);

        JButton minus = new JButton("-");
        gbc.gridx = 2;
        gbc.gridy = 1;
        this.add(minus, gbc);
        minus.addActionListener(buttonsListener);

        gbc.gridy = 2;

        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(numButton(7), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        this.add(numButton(8), gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        this.add(numButton(9), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        this.add(numButton(4), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        this.add(numButton(5), gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        this.add(numButton(6), gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        this.add(numButton(1), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        this.add(numButton(2), gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        this.add(numButton(3), gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        this.add(numButton(0), gbc);

    }
    private JButton numButton(int number){
        JButton temp = new JButton(""+ number);
        temp.addActionListener(buttonsListener);
        return temp;
    }
}
