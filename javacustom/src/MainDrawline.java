package soal;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Main {
	private static int n=0;
	public static void main(String[] args){
		JFrame window=new JFrame();
		window.setLayout(null);
		Panel nomor1=new Panel();
		window.getContentPane().add(nomor1);
		window.setVisible(true);
		window.setResizable(false);
		window.setSize(1000,1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button2=new JButton("");
		button2.setBounds(0,500,500,500);
		button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (n>=-1 && n<=3) {
                    n-=1;
                } if(n==-1) {
                    n=3;
                }
                nomor1.setColor(n);
                nomor1.repaint();
            }
        });
		window.getContentPane().add(button2);
		JButton button1=new JButton("");
		button1.setBounds(500,0,500,500);
		button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (n>=-1 && n<=2) {
                    n+=1;
              
                } if(n>=3) {
                    n=-1;
                  
                }
                nomor1.setColor(n);
                nomor1.repaint();
            }
        });
		window.getContentPane().add(button1);
	}
}
