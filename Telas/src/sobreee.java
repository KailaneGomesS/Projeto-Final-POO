import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JScrollPane;

public class sobreee extends JFrame {

    private JPanel contentPane;
    private int qtButton = 0; 
    
    public static void main(String[] args) 
    {
        sobreee frame = new sobreee();
        frame.setVisible(true);
    }
    
    public sobreee() 
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        
        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane);
        
    }
}