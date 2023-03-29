package BrickBreaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//here we are extending JPanel because it is the subclass of container class
public class GamePlay extends JPanel implements ActionListener, KeyListener {
    private boolean play = false;//game doesn't play automatically until we start
    private  int totalBricks = 21;
    private  Timer timer ;//class is present in javax.swing
    private  int delay = 8;
    private  int ballposX = 120;
    private  int ballposY = 350;
    private  int ballXdir = -1;
    private  int ballYdir = -2;
    private  int playerX = 350;

    public GamePlay(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);

        timer = new Timer(delay,this);
        timer.start();

    }
    //graphics class present in java.awt
    public void paint(Graphics g){
        //gray  color in bg
        g.setColor(Color.black);
        g.fillRect(1,1,692,592);
        //border
        g.setColor(Color.yellow);
        g.fillRect(0,0,692,3);//top
        g.fillRect(0,568,692,3);//bottom
        g.fillRect(0,3,3,592);//left
        g.fillRect(691,3,3,592);//right
        //paddle
        g.setColor(Color.green);
        g.fillRect(playerX,550,100,12);

        //ball
        g.setColor(Color.red);
        g.fillOval(ballposX,ballposY,22,22);

        //
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}
}
