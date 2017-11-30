
import java.io.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.imageio.*;
import javax.swing.*;

/*This will be an init file*/
public class StartGame {

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Dead Duck");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JLabel textLabel = new JLabel("WELCOME TO THIS GREAT WINDOW", SwingConstants.CENTER);
        //textLabel.setPreferredSize(new Dimension(300, 100));
        //frame.getContentPane().add(textLabel, BorderLayout.CENTER);

        ImageIcon image = new ImageIcon("/home/ladminster/git/DeadDuck/DeadDuckBackground.jpg");

        try {

            //image= ImageIO.read(new File("/home/ladminster/git/DeadDuck/DeadDuckBackground.jpg"));
            JLabel background = new JLabel(image);
            background.setPreferredSize(new Dimension(1080, 720));
            JScrollPane bg = new JScrollPane(background);
            frame.getContentPane().add(bg, BorderLayout.CENTER);
        } catch (Exception e) {
            System.out.println("Failed to load image!");
        }
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setMaximumSize(new Dimension(1080, 720));
        frame.setResizable(false);
        frame.setVisible(true);
      
    }

}
