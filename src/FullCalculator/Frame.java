package FullCalculator; /**
 * Created by san on 21.08.15.
 */
import javax.swing.JFrame;

public class Frame extends JFrame{
    public Frame() {
        super("San's calculator");
        //this.setContentPane(new GridBagPanel());
        this.setContentPane(new BorderGridPanel());
        this.setSize(200, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
