package FullCalculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by San on 07.09.2015.
 */
public class BorderGridPanel extends JPanel{

    public BorderGridPanel() throws HeadlessException {
        this.setLayout(new BorderLayout());
        this.add(new JTextArea(1, 1), BorderLayout.NORTH);
        this.add(getButtonPanel(), BorderLayout.CENTER);
        this.add(new Button("="), BorderLayout.SOUTH);
    }

    private JComponent getButtonPanel(){
        JPanel inner = new JPanel();
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
        return inner;
    }
}
