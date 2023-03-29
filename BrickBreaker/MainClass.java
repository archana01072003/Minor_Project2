package BrickBreaker;

import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        JFrame f = new JFrame();//wo jo new window a rhi h uske liye jFrame responsible h
        f.setTitle("Brick Breaker");
        f.setSize(700,600);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        GamePlay gamePlay = new GamePlay();
        f.add(gamePlay);//it is accepting the container type argument that's why we are extending JPanel
    }
}
