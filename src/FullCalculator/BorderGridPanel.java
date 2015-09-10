package FullCalculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by San on 07.09.2015.
 */
public class BorderGridPanel extends JPanel{
<<<<<<< HEAD
    ButtonsListener buttonsListener;

    public BorderGridPanel() {
        this.setLayout(new BorderLayout());
        JTextField field = new JTextField();
        this.add(field, BorderLayout.NORTH);
        buttonsListener = new ButtonsListener(field);
        this.add(getButtonPanel(), BorderLayout.CENTER);
        JButton result = new JButton("=");
        this.add(result, BorderLayout.SOUTH);
        result.addActionListener(buttonsListener);
=======

    public BorderGridPanel() throws HeadlessException {
        this.setLayout(new BorderLayout());
        this.add(new JTextArea(1, 1), BorderLayout.NORTH);
        this.add(getButtonPanel(), BorderLayout.CENTER);
        this.add(new Button("="), BorderLayout.SOUTH);
>>>>>>> origin/master
    }

    private JComponent getButtonPanel(){
        JPanel inner = new JPanel();
<<<<<<< HEAD
        inner.setLayout(new GridLayout(4, 3));
        inner.add(new JButton("7"));
        inner.add(new JButton("8"));
        inner.add(new JButton("9"));
        inner.add(new JButton("4"));
        inner.add(new JButton("5"));
        inner.add(new JButton("6"));
        inner.add(new JButton("3"));
        inner.add(new JButton("2"));
        inner.add(new JButton("1"));
        inner.add(new JButton("0"));
        inner.add(new JButton("+"));
        inner.add(new JButton("-"));
        for (int i = 0; i < inner.getComponentCount(); i++) {
            JButton currentButton = (JButton) inner.getComponent(i);
            currentButton.addActionListener(buttonsListener);
        }
=======
        inner.setLayout(new GridLayout(4,3));
        inner.add(new Button("7"));
        inner.add(new Button("8"));
        inner.add(new Button("9"));
        inner.add(new Button("4"));
        inner.add(new Button("5"));
        inner.add(new Button("6"));
        inner.add(new Button("3"));
        inner.add(new Button("2"));
        inner.add(new Button("1"));
        inner.add(new Button("0"));
        inner.add(new Button("+"));
        inner.add(new Button("-"));
>>>>>>> origin/master
        return inner;
    }
}
