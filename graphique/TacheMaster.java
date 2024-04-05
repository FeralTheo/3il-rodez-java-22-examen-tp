package graphique;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.border.Border;

import javax.swing.*;

public class TacheMaster extends JFrame {

	/*
	 * Interface graphique pour l'application TacheMaster
	 * 
	 */
	public TacheMaster() {
	super("Tache Master");
	JPanel panneau = new JPanel(new GridLayout(0, 1));
	
    JButton bouton1 = new JButton("Ajouter");
    panneau.add(bouton1);
    
    JButton bouton2 = new JButton("Modifier");
    panneau.add(bouton2);
    
    JButton bouton3 = new JButton("Supprimer");
    panneau.add(bouton3);
    
    JTextField  field1 = new JTextField ("Titre");
    panneau.add(field1);
    
    JTextField  field2 = new JTextField ("Description");
    panneau.add(field2);
    
    JTextField  field3 = new JTextField ("Date échéance");
    panneau.add(field3);
    
    /*
     * Bouton pour choisir la prioritée de la tache
     */
    Border border = BorderFactory.createTitledBorder("Prioritée");
    panneau.setBorder(border);
    ButtonGroup group = new ButtonGroup();
    
    JRadioButton radio1 = new JRadioButton("Forte");
    radio1.setMnemonic(KeyEvent.VK_1);
    radio1.setActionCommand("Forte");
    radio1.setSelected(true);
    
    JRadioButton radio2 = new JRadioButton("Moyenne");
    radio2.setMnemonic(KeyEvent.VK_2);
    radio2.setActionCommand("Moyenne");
    
    JRadioButton radio3 = new JRadioButton("Faible");
    radio3.setMnemonic(KeyEvent.VK_3);
    radio3.setActionCommand("Faible");
    
    group.add(radio1);
    panneau.add(radio1);
    group.add(radio2);
    panneau.add(radio2);
    group.add(radio3);
    panneau.add(radio3);
    
    
    setContentPane(panneau);
    setSize(500,300);
    setVisible(true);
	}

	/*
	 * Starter pour l'application Tache Master
	 * 
	 */
	public static void main(String[] args) {
		JFrame frame = new TacheMaster();
	}
}
