import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Image;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

import java.awt.Window.Type;
import javax.swing.JSplitPane;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class Frame1 {

	private JFrame frame;
	private JLabel lblMessage;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Dezenas dezenas = new Dezenas();
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 294);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Show Message");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				JOptionPane.showMessageDialog(null, "Give me!");
				lblMessage.setText("Give me! "+ dezenas.gerarDezenas()+ " ...");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(246, 227, 127, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/fft.jpg")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(0, 0, 114, 271);
		frame.getContentPane().add(label);
		
		lblMessage = new JLabel("Message:");
		lblMessage.setBounds(199, 75, 134, 14);
		frame.getContentPane().add(lblMessage);
	}
}
