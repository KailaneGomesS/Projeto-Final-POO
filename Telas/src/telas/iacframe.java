package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class iacframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iacframe frame = new iacframe();
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
	public iacframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("");
		Menu.setIcon(new ImageIcon(imc.class.getResource("/imagens/menu.png")));
		Menu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(Menu);
	
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Tela Inicial");
		mntmNewMenuItem_1.setIcon(new ImageIcon(imc.class.getResource("/imagens/inicio.png")));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					TelaInicial escolha= new TelaInicial ();
			          escolha.setVisible(true);
				
			}
		});
		Menu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Sobre a equipe");
		mntmNewMenuItem_2.setIcon(new ImageIcon(imc.class.getResource("/imagens/code.png")));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sEquipe= new Sobre ();
		          sEquipe.setVisible(true);
				
			}
		});
		Menu.add(mntmNewMenuItem_2);
		
		JMenuItem menuSair= new JMenuItem("Sair");
		menuSair.setIcon(new ImageIcon(imc.class.getResource("/imagens/sair.png")));
		menuSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		
		
	
		menuSair.setHorizontalAlignment(SwingConstants.CENTER);
		Menu.add(menuSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(iacframe.class.getResource("/imagens/iac3.jpg")));
		lblNewLabel.setBounds(10, 184, 796, 158);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Informações sobre IAC");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setBounds(277, 38, 243, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("IAC, o Índice de Adiposidade Corporal, tem como resultado a porcentagem da quantidade de");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(65, 75, 667, 41);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("grodura presente no corpo, calculando se esse valor é ideal ou não.\r\n");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2_1_1.setBounds(65, 104, 667, 41);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Tabela\r\n");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_2.setBounds(351, 147, 76, 26);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Modo de uso");
		lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_2_1.setBounds(310, 353, 143, 26);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Para obter o resultado pela fórmula (    ) é necessário ter as medidas da altura e circufência do quadril");
		lblNewLabel_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2_1_2.setBounds(44, 390, 710, 41);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("O formato que deve ser usado na altura é em metros, utilizando o ponto (.). Exemplo: 1.75  ");
		lblNewLabel_2_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2_1_3.setBounds(44, 418, 667, 41);
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("O formato que deve ser usado no quadril é em centímetros. Exemplo: 120  ");
		lblNewLabel_2_1_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2_1_3_1.setBounds(44, 450, 667, 41);
		contentPane.add(lblNewLabel_2_1_3_1);
	}
}
