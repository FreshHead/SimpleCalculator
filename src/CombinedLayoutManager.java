/**
 * Created by San on 07.09.2015.
 */
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CombinedLayoutManager extends JFrame {

    public static void main(String[] args) {
        CombinedLayoutManager e = new CombinedLayoutManager();
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        e.setSize(400, 300);
        e.setVisible(true);
    }

    public CombinedLayoutManager() {
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        pane.add(getHeader(), BorderLayout.NORTH);
        pane.add(getTextArea(), BorderLayout.CENTER);
        pane.add(getButtonPanel(), BorderLayout.SOUTH);
    }

    protected JComponent getHeader() {
        JLabel label = new JLabel("Embedded Layout Manager Test", JLabel.CENTER);
        label.setFont(new Font("Courier", Font.BOLD, 24));
        return label;
    }

    protected JComponent getTextArea() {
        return new JTextArea(10, 10);
    }

    protected JComponent getButtonPanel() {
        JPanel inner = new JPanel();
        inner.setLayout(new GridLayout(1, 2, 10, 0));
        inner.add(new JButton("Ok"));
        inner.add(new JButton("Cancel"));
        return inner;
    }

}