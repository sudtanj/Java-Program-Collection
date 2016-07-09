package soal;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
public class Panel extends JPanel implements MouseMotionListener {
	private int[] x1=new int[100];
	private int[] y1=new int[100];
	private int[] x2=new int[100];
	private int[] y2=new int[100];
	private int[] warna=new int[100];
	private int jumlah=0;
	private boolean draw=false;
	public Panel(){
		super();
		setSize(500,500);
		setVisible(true);
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		setBackground(Color.WHITE);
		addMouseListener(new MouseAdapter() { 
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isRightMouseButton(e)){
					x2[jumlah]=e.getX();
					y2[jumlah]=e.getY();
					repaint();
					draw=false;
					jumlah++;
				}
				if(SwingUtilities.isLeftMouseButton(e)){
				draw=true;  
					x1[jumlah]=e.getX();
				  y1[jumlah]=e.getY();
				  x2[jumlah]=e.getX();
				  y2[jumlah]=e.getY();
				  repaint();
				}
			}
	    });
		addMouseMotionListener(this);
		for (int i=0;i<100;i++)
			warna[i]=0;
	}
	public void setColor(int n){
		warna[jumlah]=n;
		 System.out.println(n);
	}
	public void mouseMoved (MouseEvent me) {
	    if(draw){
		x2[jumlah] = (int) me.getPoint().getX();
	    y2[jumlah] = (int) me.getPoint().getY();
	    repaint();
	    }
	}
	public void paintComponent(Graphics e){
		super.paintComponent(e);
		
			for (int i=0;i<x1.length;i++){
				if(warna[i]==1){
					e.setColor(Color.RED);
				}
				if(warna[i]==2){
					e.setColor(Color.BLUE);
				}
			e.drawLine(x1[i], y1[i], x2[i], y2[i]);
			}
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
