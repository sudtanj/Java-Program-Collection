import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Calculator {

	private JFrame frame;
	private JTextField calcubox1;
	private JTextField calcubox2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton calculate = new JButton("data");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double hasil;
				int calcubox1int=Integer.parseInt(calcubox1.getText());
				int calcubox2int=Integer.parseInt(calcubox2.getText());
				if (calcubox2int==0){
					hasil=(calcubox1int*3.14)*180/3.14;
					JOptionPane.showMessageDialog(null,String.valueOf(hasil));
				}
				if (calcubox1int==0){
					hasil=(calcubox2int*3.14)/180;
					JOptionPane.showMessageDialog(null,String.valueOf(hasil/3.14));
				}
			}
		});
		calculate.setBounds(168, 180, 89, 23);
		frame.getContentPane().add(calculate);
		
		calcubox1 = new JTextField();
		calcubox1.setText("0");
		calcubox1.setBounds(85, 132, 86, 20);
		frame.getContentPane().add(calcubox1);
		calcubox1.setColumns(10);
		
		calcubox2 = new JTextField();
		calcubox2.setText("0");
		calcubox2.setBounds(252, 132, 86, 20);
		frame.getContentPane().add(calcubox2);
		calcubox2.setColumns(10);
	}

}
