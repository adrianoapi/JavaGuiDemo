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
import javax.swing.JComboBox;

public class Frame1 {

	private JFrame frmGeradorDeDezenas;
	private JLabel lblMessage;
	private JTextField textDezenas;
	private JComboBox qtdDezenas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmGeradorDeDezenas.setVisible(true);
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

		frmGeradorDeDezenas = new JFrame();
		frmGeradorDeDezenas.setType(Type.UTILITY);
		frmGeradorDeDezenas.setTitle("Gerador de Dezenas");
		frmGeradorDeDezenas.setResizable(false);
		frmGeradorDeDezenas.getContentPane().setBackground(SystemColor.inactiveCaption);
		frmGeradorDeDezenas.setBounds(100, 100, 450, 294);
		frmGeradorDeDezenas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeradorDeDezenas.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Gerar Dezenas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// converte uma string em interiro
				String quatidadeDez = String.valueOf(qtdDezenas.getSelectedItem());
				int qtdDez = Integer.parseUnsignedInt(quatidadeDez);
				if (qtdDez < 6 || qtdDez== 0) {
					qtdDez = 6;
				}
				// JOptionPane.showMessageDialog(null, "Give me!");
				lblMessage.setText("Dezenas geradas abaixo: " + qtdDez);
				textDezenas.setText(dezenas.drawTable(dezenas.gerarDezenas(qtdDez)));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(284, 155, 124, 23);
		frmGeradorDeDezenas.getContentPane().add(btnNewButton);

		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/fft.jpg")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(0, 0, 114, 271);
		frmGeradorDeDezenas.getContentPane().add(label);

		lblMessage = new JLabel("Clique no botão para gerar as dezenas:");
		lblMessage.setBounds(145, 99, 264, 14);
		frmGeradorDeDezenas.getContentPane().add(lblMessage);

		textDezenas = new JTextField();
		textDezenas.setBackground(SystemColor.inactiveCaptionBorder);
		textDezenas.setBounds(145, 124, 264, 20);
		frmGeradorDeDezenas.getContentPane().add(textDezenas);
		textDezenas.setColumns(10);

		qtdDezenas = new JComboBox();
		qtdDezenas.setBounds(236, 157, 38, 20);
		qtdDezenas.addItem("6");
		qtdDezenas.addItem("7");
		qtdDezenas.addItem("8");
		qtdDezenas.addItem("9");
		frmGeradorDeDezenas.getContentPane().add(qtdDezenas);

		JLabel lblQtdDeDezenas = new JLabel("Qtd. de Dezenas");
		lblQtdDeDezenas.setBounds(145, 160, 81, 14);
		frmGeradorDeDezenas.getContentPane().add(lblQtdDeDezenas);
	}
}
