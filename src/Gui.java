import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import java.awt.*;

public class Gui extends JFrame {
    public JButton animalButton = new JButton("Start animal game");
    public JButton instrumentButton = new JButton("Start instrument game");

    private JLabel helloMsg = new JLabel("В ШО ИХРАЕМ");


    public Gui() {
        super("GuessGame");
        this.setBounds(500, 500, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(1, 3, 20, 20));
        container.add(helloMsg);
        container.add(animalButton);
        container.add(instrumentButton);
        animalButton.setVisible(true);
        instrumentButton.setVisible(true);
        animalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiGame game = new GuiGame();
                game.setVisible(true);
            }

        }
        );

    }

}
