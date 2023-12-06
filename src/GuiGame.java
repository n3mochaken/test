import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GuiGame extends JFrame {
    private JButton[] guessButtons;
    private JLabel helloMsg = new JLabel("Угадай, кто так делает!");
    private JButton close = new JButton("Закрыть");

    private void playSound(String soundFilePath) {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFilePath));
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public GuiGame() {
        super("AnimalsGame");
        this.setBounds(500, 500,1500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(1, 4, 20, 20));
        container.add(helloMsg);
        Animals animals = new Animals();
        animals.fillLogic();
        animals.fillForGame();
        guessButtons = new JButton[3];
        for (
                int i = 0;
                i < 3; i++) {
            guessButtons[i] = new JButton();
            guessButtons[i].setVisible(false);
        }
        helloMsg.setText("КТО ПИЗДЕЛ");


        for (int i = 0; i < 3; i++) {

            container.add(guessButtons[i]);
            guessButtons[i].setVisible(true);
        }
        for (int i = 0; i < 3; i++) {
            guessButtons[i].setIcon(new ImageIcon("F:\\skypro\\projects\\testgui\\test\\src\\images\\animals\\" + animals.forGame[i] + ".jpg"));
        }
        for (int i = 0; i < 3; i++) {
            if (animals.logic[i] == true) {
                playSound("F:\\skypro\\projects\\testgui\\test\\src\\sounds\\animals\\" + animals.forGame[i] + ".wav");
            }
        }

        guessButtons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(animals.logic[0] == true){
                    for (int i = 0; i < 3; i++) {
                        guessButtons[i].setVisible(true);
                        helloMsg.setText("Правильно! Ты победил");
                    }

                }else {
                    for (int i = 0; i < 3; i++) {
                        guessButtons[i].setVisible(true);
                        helloMsg.setText("Попробуй еще!");
                    }


                }

            }
        });


    }
    }



