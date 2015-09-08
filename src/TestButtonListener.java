import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by san on 20.08.15.
 */
public class TestButtonListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        String clickedButtonLabel1 = clickedButton.getText();
        JOptionPane.showMessageDialog(null, "You pressed " + clickedButtonLabel1);
    }
}
