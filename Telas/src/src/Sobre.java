

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
 
public class Sobre extends JFrame {
 private static final long serialVersionUID = 5L;
 private JPanel panel;
 private JTextArea txtArea;
 private JLabel lblNewLabel;
 private JLabel lblNewLabel_1;
 private JLabel lblNewLabel_2;
 private JLabel lblNewLabel_3;
 private JLabel lblNewLabel_4;
 private JLabel lblNewLabel_5;
 private JLabel lblNewLabel_6;
 private JLabel lblNewLabel_7;
 private JLabel lblNewLabel_8;
 private JLabel lblNewLabel_9;
 
public Sobre() {
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setSize(717, 510);
 
  panel = new JPanel();
  txtArea = new JTextArea(
  "UIASDUSADHUSADUDSSDAUHSDAUHSDAHUSA \t\r\n TESTE \r\n \r\n \r\n \r\n ASDASDASDASSDSDSD");
  txtArea.setEditable(false);
  txtArea.setRows(78);
  txtArea.setTabSize(87);
  JScrollPane jsp = new JScrollPane(panel);
  
  lblNewLabel = new JLabel("NOSSA FOTO\r\n");
  
  lblNewLabel_1 = new JLabel("A Health Calculator \u00E9 um projeto em java realizado pela equipe The Voids, que busca");
  lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_2 = new JLabel("Sobre a equipe");
  lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
  
  lblNewLabel_3 = new JLabel("levar informa\u00E7\u00F5es sobre as quest\u00F5es de sa\u00FAde da popula\u00E7\u00E3o, como a obesidade e a");
  lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_4 = new JLabel("denutri\u00E7\u00E3o.");
  lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_5 = new JLabel("O programa oferece dois meios de verificar a sa\u00FAde de um corpo: o IAC (\u00CDndice de");
  lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_6 = new JLabel("Adiposidade Corporal, e o IMC (\u00CDndide de Massa Corporal)");
  lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_7 = new JLabel("Lembrando que os resultados obtidos n\u00E3o s\u00E3o definitivos, eles apenas servem de ");
  lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_8 = new JLabel("apoio para diagn\u00F3stico m\u00E9dico, para mais informa\u00E7\u00F5es e pelo bem de sua sa\u00FAde,");
  lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  
  lblNewLabel_9 = new JLabel("consulte um especilista. ");
  lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 18));
  GroupLayout gl_panel = new GroupLayout(panel);
  gl_panel.setHorizontalGroup(
  	gl_panel.createParallelGroup(Alignment.TRAILING)
  		.addGroup(gl_panel.createSequentialGroup()
  			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
  				.addGroup(gl_panel.createSequentialGroup()
  					.addGap(269)
  					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
  				.addGroup(gl_panel.createSequentialGroup()
  					.addGap(22)
  					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
  						.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
  						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE)
  						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE)
  						.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE)
  						.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE)
  						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE)
  						.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE)))
  				.addGroup(gl_panel.createSequentialGroup()
  					.addGap(303)
  					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
  			.addPreferredGap(ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
  			.addComponent(txtArea, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE))
  );
  gl_panel.setVerticalGroup(
  	gl_panel.createParallelGroup(Alignment.LEADING)
  		.addGroup(gl_panel.createSequentialGroup()
  			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
  				.addComponent(txtArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
  				.addGroup(gl_panel.createSequentialGroup()
  					.addGap(45)
  					.addComponent(lblNewLabel_2)
  					.addPreferredGap(ComponentPlacement.UNRELATED)
  					.addComponent(lblNewLabel_1)
  					.addPreferredGap(ComponentPlacement.RELATED)
  					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
  					.addPreferredGap(ComponentPlacement.RELATED)
  					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
  					.addGap(1)
  					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
  					.addGap(1)
  					.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
  					.addPreferredGap(ComponentPlacement.UNRELATED)
  					.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
  					.addPreferredGap(ComponentPlacement.RELATED)
  					.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
  					.addPreferredGap(ComponentPlacement.RELATED)
  					.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
  					.addGap(80)
  					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
  			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
  );
  panel.setLayout(gl_panel);
  jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
  jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
  getContentPane().add(jsp);
 
  this.setVisible(true);
 }
 
 public static void main(String[] args) {
  new Sobre();
 }
}