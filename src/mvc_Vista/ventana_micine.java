package mvc_Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ventana_micine extends JFrame implements Runnable{

	private Thread tiempo = null;
	private JPanel contentPane;
	private panel_bienvenida panel_bienvenida_;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana_micine frame = new ventana_micine();
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
	public ventana_micine() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 0, 1041, 797);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel_bienvenida_ = new panel_bienvenida();
		contentPane.add(panel_bienvenida_, BorderLayout.CENTER);
		tiempo = new Thread(this);
		this.setVisible(true);
		tiempo.start();
	}

	public void run() {
		while(tiempo != null) {
			try {
				Thread.sleep(300);				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			panel_intro pi = new panel_intro();
			dispose();
			pi.setVisible(true);
			break;
		}
	}
}


