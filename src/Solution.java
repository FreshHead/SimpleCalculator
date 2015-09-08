
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Solution {
    public static void main(String []args){
        ButtonFrame frame= new ButtonFrame();//������� �����
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�������� ���������� �� ��������� ��������� ����� �������� ������
        frame.setVisible(true);//������ ����� �������
    }
}
class ButtonFrame extends JFrame{//������� ����� ���������� �� �����
    public ButtonFrame(){//����������� ������� �����
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHE);//������� ������
        setTitle("Button");//�������� ������
        ButtonPanel panel=new ButtonPanel();//������� ������
        add(panel);//��������� ������ �� �����
    }
    public static final int DEFAULT_WIDTH=300;
    public static final int DEFAULT_HEIGHE=200;
}
class ButtonPanel extends JPanel{//����� ���������� �� �����
    public ButtonPanel(){ //����������� ������
        JButton yellowButton=new JButton("yellow");//������� ������(� �������� ��������� ����� ����������� �� ������)
        JButton blueButton=new JButton("blue");
        JButton redButton=new JButton("red");
        add(yellowButton);//��������� ������ �� ������
        add(blueButton);
        add(redButton);
        ColorAction yellowAction=new ColorAction(Color.yellow);//������� ������� ��� ������� �����(��������-����)
        ColorAction blueAction=new ColorAction(Color.blue);
        ColorAction redAction=new ColorAction(Color.red);
        yellowButton.addActionListener(yellowAction);//�������� ������ ������� ��������������� ������
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }
    private class ColorAction implements ActionListener{//��������� ��������� ���������� �� �������
        public ColorAction(Color c){//����������� �������� ���� � �������� ���������
            backgroundColor=c;
        }
        public void actionPerformed(ActionEvent event){//������� �� ������� ������-����� ����� ������
            setBackground(backgroundColor);
        }
        private Color backgroundColor;
    }
}