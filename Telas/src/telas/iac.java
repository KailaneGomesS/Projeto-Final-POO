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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class iac extends JFrame {
	private JTextField jcQuadril;
	private JTextField jpeso;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iac frame = new iac();
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

	public iac() {
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
				infoiac info= new infoiac ();
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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 472);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cálculo IAC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(153, 77, 271, 35);
		getContentPane().add(lblNewLabel);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSexo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSexo.setBounds(96, 164, 112, 20);
		getContentPane().add(lblSexo);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltura.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAltura.setBounds(112, 195, 96, 20);
		getContentPane().add(lblAltura);
		
		JLabel lblPeso = new JLabel("Comprimento quadril:");
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPeso.setBounds(27, 226, 168, 20);
		getContentPane().add(lblPeso);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblResultado.setBounds(96, 257, 112, 20);
		getContentPane().add(lblResultado);
		
		JRadioButton feminino = new JRadioButton("Feminino");
		feminino.setFont(new Font("Times New Roman", Font.BOLD, 13));
		feminino.setBounds(193, 164, 89, 23);
		getContentPane().add(feminino);
		
		JRadioButton masculino = new JRadioButton("Masculino");
		masculino.setFont(new Font("Times New Roman", Font.BOLD, 13));
		masculino.setBounds(284, 164, 140, 23);
		getContentPane().add(masculino);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(feminino);
		buttonGroup.add(masculino);
		jcQuadril = new JTextField();
		jcQuadril.setColumns(10);
		jcQuadril.setBounds(218, 195, 106, 20);
		getContentPane().add(jcQuadril);
		
		jpeso = new JTextField();
		jpeso.setColumns(10);
		jpeso.setBounds(218, 226, 106, 20);
		getContentPane().add(jpeso);
		
		resultado = new JTextField();
		resultado.setForeground(Color.BLACK);
		resultado.setEditable(false);
		resultado.setColumns(10);
		resultado.setBackground(Color.WHITE);
		resultado.setBounds(218, 257, 106, 20);
		getContentPane().add(resultado);
		
		JButton btnConfirma = new JButton("Calcule");
		btnConfirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float quadril = Float.parseFloat(jpeso.getText());
			        float altura = Float.parseFloat(jcQuadril.getText());
			        float iac= (float) (quadril/(Math.pow(altura, 1.5)))-18;
			       resultado.setText(String.valueOf(iac));
			       if (masculino.isSelected()) {
			     
			       if (iac<6) {
			    	   JOptionPane.showMessageDialog(null, "Extremamente baixa!");
			       }
			       if (iac>=6&&iac<=11) {
			    	   JOptionPane.showMessageDialog(null, "Muito Baixa!");
			       }
			       if (iac>11&&iac<=15) {
			    	   JOptionPane.showMessageDialog(null, "Baixa.");
			       }
			       if (iac>15&&iac<=19) {
			    	   JOptionPane.showMessageDialog(null, "Ideal.");
			       }
			       if (iac>19&&iac<=25) {
			    	   JOptionPane.showMessageDialog(null, "Moderada.");
			       }
			       if (iac>25) {
			    	   JOptionPane.showMessageDialog(null, "Excesso!");
			       }
			     
			}
			       if (feminino.isSelected()) {
					     
				       if (iac<10) {
				    	   JOptionPane.showMessageDialog(null, "Extremamente baixo!");
				       }
				       if (iac>10&&iac<=16) {
				    	   JOptionPane.showMessageDialog(null, "Muito baixo!");
				       }
				       if (iac>16&&iac<=20) {
				    	   JOptionPane.showMessageDialog(null, "Baixo!");
				       }
				       if (iac>20&&iac<=26) {
				    	   JOptionPane.showMessageDialog(null, "Ideal.");
				       }
				       if (iac>26&&iac<=30) {
				    	   JOptionPane.showMessageDialog(null, "Moderado.");
				       }
				       if (iac>30) {
				    	   JOptionPane.showMessageDialog(null, "Excesso!");
				       }
				       
				}
			}
		});
		btnConfirma.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnConfirma.setBounds(388, 329, 106, 23);
		getContentPane().add(btnConfirma);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcQuadril.setText(null);
				jpeso.setText(null);
				buttonGroup.clearSelection();

			}
		});
		btnLimpar.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnLimpar.setBounds(218, 329, 106, 23);
		getContentPane().add(btnLimpar);
		
		JLabel lblUseOFormato = new JLabel("Use o formato: 999.999");
		lblUseOFormato.setHorizontalAlignment(SwingConstants.CENTER);
		lblUseOFormato.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblUseOFormato.setBounds(348, 226, 157, 20);
		getContentPane().add(lblUseOFormato);
		
		JLabel lblParaAlturaUse = new JLabel("Use o formato: 9.99");
		lblParaAlturaUse.setHorizontalAlignment(SwingConstants.CENTER);
		lblParaAlturaUse.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblParaAlturaUse.setBounds(348, 195, 157, 20);
		getContentPane().add(lblParaAlturaUse);
	}
}
