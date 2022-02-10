package mvc_Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class panel_bienvenida extends JPanel{
	
	/**
	 * Create the panel.
	 */
	public panel_bienvenida() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 255, 47));
		panel.setBounds(10, 11, 1024, 768);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDOS");
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 97));
		lblNewLabel.setBounds(151, 267, 712, 215);
		panel.add(lblNewLabel);		
	}
}
