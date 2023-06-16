package telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class infoIMC extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					infoIMC frame = new infoIMC();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public infoIMC() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("MENU");
		Menu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(Menu);
		

		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Tela Inicial");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					TelaInicial escolha= new TelaInicial ();
			          escolha.setVisible(true);
				
			}
		});
		Menu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Sobre a equipe");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sEquipe= new Sobre ();
		          sEquipe.setVisible(true);
				
			}
		});
		Menu.add(mntmNewMenuItem_2);
		
		JMenuItem menuSair= new JMenuItem("Sair");
		menuSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		
		
	
		menuSair.setHorizontalAlignment(SwingConstants.CENTER);
		Menu.add(menuSair);
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 0, 0);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(infoIMC.class.getResource("/imagens/imc2.png")));
		lblNewLabel.setBounds(10, 11, 691, 329);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("IMC");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblNewLabel_1.setBounds(101, 358, 274, 70);
		contentPane.add(lblNewLabel_1);
	}
}
