package day5;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.GridLayout;
import java.awt.Container;

import java.awt.Graphics;
import java.awt.Color;




public final class BouncingBall extends JFrame {
    public static void main(String[] args) {
        BouncingBall b = new BouncingBall();
    }

    private Timer t;
    public BouncingBall() {
        super("Bouncing Ball");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container c = new Container();
        c.setLayout(new GridLayout(2, 1));
        c.add(new StartButton());
        c.add(new StopButton());

        BouncingBallRegion b = new BouncingBallRegion();
        t = new Timer(10, b);//every 10 millisecond, it will update BouncingBallRegion view by intrigue the listener

        
        setLayout(new GridLayout(2, 1));
        add(b);//top
        add(c);//bottom

        setSize(800, 400);
        setVisible(true);
    }




    private class StartButton extends JButton implements ActionListener {
        private StartButton() {
            super("start");
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
            t.start();
        }
    }
    private class StopButton extends JButton implements ActionListener {
        private StopButton() {
            super("stop");
            addActionListener(this);
        }
        public void actionPerformed(ActionEvent e) {
            t.stop();
        }
    }




    private class BouncingBallRegion extends JPanel implements ActionListener {
        private int ballX = 0;
        private int ballY = 0;

        private int ballDiam = 50;

        private boolean moveRight = true;
        private boolean moveDown  = true;


        private void updateDirection() {
            if (ballX + ballDiam >= this.getWidth())  { moveRight = false; }
            if (ballY + ballDiam >= this.getHeight()) { moveDown  = false; }

            if (ballX <= 0) { moveRight = true; }
            if (ballY <= 0) { moveDown  = true; }
        }


        private void updatePosition() {
            if (moveRight) { ++ballX; }
            else           { --ballX; }

            if (moveDown)  { ++ballY; }
            else           { --ballY; }
        }


        public void actionPerformed(ActionEvent e) {
            updateDirection();
            updatePosition();
            repaint();
        }


        //repaint
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillOval(ballX, ballY, ballDiam, ballDiam);
        }
    }
}









