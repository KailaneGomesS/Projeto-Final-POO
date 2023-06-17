package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class imc extends JFrame {

	private JPanel contentPane;
	private JTextField jaltura;
	private JTextField jpeso;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					imc frame = new imc();
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
	public imc() {
		float peso, altura;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 439);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("");
		Menu.setIcon(new ImageIcon(imc.class.getResource("/imagens/menu.png")));
		Menu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(Menu);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Modo de Uso");
		mntmNewMenuItem_3.setIcon(new ImageIcon(imc.class.getResource("/imagens/info.png")));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoimc info= new infoimc ();
		          info.setVisible(true);
			
			}
		});
		Menu.add(mntmNewMenuItem_3);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("Cálculo IMC");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_1.setBounds(140, 71, 271, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltura.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAltura.setBounds(75, 164, 112, 20);
		contentPane.add(lblAltura);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPeso.setBounds(75, 195, 112, 20);
		contentPane.add(lblPeso);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblResultado.setBounds(75, 226, 112, 20);
		contentPane.add(lblResultado);
		
		jaltura = new JTextField();
		jaltura.setColumns(10);
		jaltura.setBounds(197, 164, 127, 20);
		contentPane.add(jaltura);
		
		jpeso = new JTextField();
		jpeso.setColumns(10);
		jpeso.setBounds(197, 195, 127, 20);
		contentPane.add(jpeso);
		
		resultado = new JTextField();
		resultado.setForeground(Color.BLACK);
		resultado.setEditable(false);
		resultado.setColumns(10);
		resultado.setBackground(Color.WHITE);
		resultado.setBounds(197, 226, 127, 20);
		contentPane.add(resultado);
		
		JButton btnConfirma = new JButton("Calcule");
		btnConfirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float peso = Float.parseFloat(jpeso.getText());
		        float altura = Float.parseFloat(jaltura.getText());
		        float imc1 = peso/(altura*altura);
		        resultado.setText(String.valueOf(imc1));
		        if (imc1<=16.9) {
			    	   JOptionPane.showMessageDialog(null, "Muito abaixo do peso!");
			       }
			       if (imc1>=17&&imc1<18.4) {
			    	   JOptionPane.showMessageDialog(null, "Abaixo do peso!");
			       }
			       if (imc1>=18.5&&imc1<25) {
			    	   JOptionPane.showMessageDialog(null, "Peso ideal.");
			       }
			       if (imc1>=25&&imc1<30) {
			    	   JOptionPane.showMessageDialog(null, "Acima do peso.");
			       }
			       if (imc1>=30&&imc1<35) {
			    	   JOptionPane.showMessageDialog(null, "Obeidade grau I!");
			       }
			       if (imc1>=35&&imc1<40) {
			    	   JOptionPane.showMessageDialog(null, "Obesidade grau II!");
			       }
			       if (imc1>40) {
			    	   JOptionPane.showMessageDialog(null, "Obesidade grau III!");
			       }
		       
			}
		});
		btnConfirma.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnConfirma.setBounds(364, 327, 106, 23);
		contentPane.add(btnConfirma);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jaltura.setText(null);
				jpeso.setText(null);
			}
		});
		btnLimpar.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnLimpar.setBounds(207, 327, 106, 23);
		contentPane.add(btnLimpar);
		
		JLabel lblParaAlturaUse = new JLabel("Use o formato: 9.99");
		lblParaAlturaUse.setHorizontalAlignment(SwingConstants.CENTER);
		lblParaAlturaUse.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblParaAlturaUse.setBounds(348, 164, 157, 20);
		contentPane.add(lblParaAlturaUse);
		
		JLabel lblUseOFormato = new JLabel("Use o formato: 999.999");
		lblUseOFormato.setHorizontalAlignment(SwingConstants.CENTER);
		lblUseOFormato.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblUseOFormato.setBounds(348, 195, 157, 20);
		contentPane.add(lblUseOFormato);
	}
}
