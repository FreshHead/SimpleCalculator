/**
 * Created by san on 20.08.15.
 */
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Component;

public class FlowCalculator {
    public static void main(String[] args) {
        JPanel jPanel = new JPanel();

        FlowLayout flowLayout = new FlowLayout();
        jPanel.setLayout(flowLayout);

        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton button = new JButton("Add");

        Component[] components = {label1, field1, label2, field2, label3, result, button};

        for(Component component : components) jPanel.add(component);

        JFrame frame = new JFrame("My first calculator");
        frame.setContentPane(jPanel);

        frame.setSize(400,100);
        frame.setVisible(true);
    }
}
