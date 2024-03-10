package day5;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Bouncing extends JFrame{

	public static void main(String[] args) {
		Bouncing bouncing = new Bouncing();
		bouncing.setVisible(true);
	}
	private Timer timer;
	public Bouncing() { 
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//close the window will shut down the programe
		setSize(800,400);
		
		setLayout(new GridLayout(2,1));//2 rows, 1column
		
		BouncingArea area = new BouncingArea();
		timer = new Timer(10,area);
		add(area);
		
		Container c = new Container();
		c.setLayout(new GridLayout(2,1));
		
		JButton btn = new JButton("Start");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//whatever you want to do by clicking the button, you write it here
				timer.start();
			}
		});
		
		
		c.add(btn);
		c.add(new StopButton());
		add(c);
	}
	
	class StopButton extends JButton implements ActionListener{
		public StopButton() {
			super("Stop");
			addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			timer.stop();
		}

	}
	
	class BouncingArea extends JPanel implements ActionListener{
		int x = 0;
		int y = 0;
		boolean moveRight = true;
		boolean moveDown = true;
		
		public void changeDirection() {
			if(y+50>=getHeight()) {
				moveDown = false;
			}
			if(y<=0) {
				moveDown = true;
			}
			if(x+50>=getWidth()) {
				moveRight = false;
			}
			if(x<=0) {
				moveRight = true;
			}
			
		}
		
		public void changePosition() {
			if(moveRight) {
				x++;
			}else {
				x--;
			}
			if(moveDown) {
				y++;
			}else {
				y--;
			}
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			changeDirection();
			changePosition();
			repaint();
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillOval(x, y, 50, 50);
		}
		
	}
	
}


















