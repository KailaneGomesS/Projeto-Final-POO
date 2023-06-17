package telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
 
public class Sobre extends JFrame {
 private static final long serialVersionUID = 1L;
 private JPanel panel;
 private JLabel lblNewLabel_1;
 private JLabel lblNewLabel_2;
 private JLabel lblNewLabel_3;
 private JLabel lblNewLabel_4;
 private JLabel lblNewLabel_5;
 private JLabel lblNewLabel_6;
 private JLabel lblNewLabel_7;
 private JLabel lblNewLabel_8;
 private JLabel lblNewLabel_9;
 private JLabel lblNewLabel;
 private JLabel lblNewLabel_10;
 private JLabel lblNewLabel_11;
 private JLabel lblNewLabel_12;
 private JLabel lblNewLabel_13;
 private JLabel lblNewLabel_14;
 private JLabel lblNewLabel_15;
 private JLabel lblNewLabel_16;
 
public Sobre() {
	
	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
	JMenu Menu = new JMenu("");
	Menu.setIcon(new ImageIcon(imc.class.getResource("/imagens/menu.png")));
	Menu.setHorizontalAlignment(SwingConstants.CENTER);
	menuBar.add(Menu);
	
	JMenuItem menuSair= new JMenuItem("Sair");
	menuSair.setIcon(new ImageIcon(imc.class.getResource("/imagens/sair.png")));
	menuSair.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
			
		}
	});
	
	

	menuSair.setHorizontalAlignment(SwingConstants.CENTER);
	Menu.add(menuSair);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setSize(717, 605);
 
  panel = new JPanel();
  JScrollPane jsp = new JScrollPane(panel);
  // sroll pane não foi utilizado
  
  lblNewLabel_1 = new JLabel("A Health Calculator \u00E9 um projeto em java realizado pela equipe The Voids, que busca");
  lblNewLabel_1.setBounds(28, 70, 636, 21);
  lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_2 = new JLabel("Sobre o projeto");
  lblNewLabel_2.setBounds(258, 38, 148, 26);
  lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
  
  lblNewLabel_3 = new JLabel("levar informa\u00E7\u00F5es sobre as quest\u00F5es de sa\u00FAde da popula\u00E7\u00E3o, como a obesidade e a");
  lblNewLabel_3.setBounds(28, 92, 602, 21);
  lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_4 = new JLabel("denutri\u00E7\u00E3o.");
  lblNewLabel_4.setBounds(28, 117, 624, 21);
  lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_5 = new JLabel("O programa oferece dois meios de verificar a sa\u00FAde de um corpo: o IAC (\u00CDndice de");
  lblNewLabel_5.setBounds(28, 144, 624, 21);
  lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_6 = new JLabel("Adiposidade Corporal, e o IMC (\u00CDndide de Massa Corporal)");
  lblNewLabel_6.setBounds(28, 169, 624, 21);
  lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_7 = new JLabel("Lembrando que os resultados obtidos n\u00E3o s\u00E3o definitivos, eles apenas servem de ");
  lblNewLabel_7.setBounds(28, 208, 624, 21);
  lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_8 = new JLabel("apoio para diagn\u00F3stico m\u00E9dico, para mais informa\u00E7\u00F5es e pelo bem de sua sa\u00FAde,");
  lblNewLabel_8.setBounds(28, 235, 624, 21);
  lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_9 = new JLabel("consulte um especilista. ");
  lblNewLabel_9.setBounds(28, 262, 624, 21);
  lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  JLabel lblNewLabel_2_1 = new JLabel("Sobre a equipe");
  lblNewLabel_2_1.setBounds(251, 334, 148, 26);
  lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
  panel.setLayout(null);
  panel.add(lblNewLabel_2);
  panel.add(lblNewLabel_2_1);
  panel.add(lblNewLabel_3);
  panel.add(lblNewLabel_1);
  panel.add(lblNewLabel_4);
  panel.add(lblNewLabel_7);
  panel.add(lblNewLabel_5);
  panel.add(lblNewLabel_6);
  panel.add(lblNewLabel_8);
  panel.add(lblNewLabel_9);
  
  lblNewLabel = new JLabel("Mário Néo:");
  lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
  lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
  lblNewLabel.setBounds(28, 365, 94, 21);
  panel.add(lblNewLabel);
  
  lblNewLabel_10 = new JLabel("idealização, desenvolvimento");
  lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  lblNewLabel_10.setBounds(140, 365, 336, 21);
  panel.add(lblNewLabel_10);
  
  lblNewLabel_11 = new JLabel("Kailane:");
  lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
  lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 19));
  lblNewLabel_11.setBounds(28, 404, 94, 21);
  panel.add(lblNewLabel_11);
  
  lblNewLabel_12 = new JLabel("design, desenvolvimento");
  lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  lblNewLabel_12.setBounds(140, 404, 336, 21);
  panel.add(lblNewLabel_12);
  
  lblNewLabel_13 = new JLabel("João Pedro:");
  lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
  lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 19));
  lblNewLabel_13.setBounds(28, 443, 103, 21);
  panel.add(lblNewLabel_13);
  
  lblNewLabel_14 = new JLabel("design, desenvolvimento");
  lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  lblNewLabel_14.setBounds(140, 443, 336, 21);
  panel.add(lblNewLabel_14);
  
  lblNewLabel_15 = new JLabel("Gabriel:");
  lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
  lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 19));
  lblNewLabel_15.setBounds(28, 475, 94, 21);
  panel.add(lblNewLabel_15);
  
  lblNewLabel_16 = new JLabel("design, desenvolvimento");
  lblNewLabel_16.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  lblNewLabel_16.setBounds(140, 475, 336, 21);
  panel.add(lblNewLabel_16);
  getContentPane().add(jsp);
 
  this.setVisible(true);
 }
 
 public static void main(String[] args) {
  new Sobre();
 }
}