//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//
//
//
//public class GuessGame extends JFrame {
//    private JButton угадыватьЖивотныхButton;
//    private JButton угадыватьИнструментыButton;
//    private JPanel mainPanel;
//    private JLabel gameLabel;
//    private JButton button1;
//    private JButton button2;
//    private JButton button3;
//    private JButton[] guessButtons = new JButton[3];
//
//    public GuessGame() {
//        setContentPane(mainPanel);
//        setTitle("GuessGameTestTitle");
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setSize(1500, 500);
//        setLocation(0, 0);
//        setVisible(true);
//        button1.setVisible(false);
//        button2.setVisible(false);
//        button3.setVisible(false);
//
//        угадыватьЖивотныхButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                gameAnimalsStarts();
//
//            }
//        });
//
//        угадыватьИнструментыButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                gameInstrumentsStarts();
//
//            }
//        });
//    }
//    private void playSound(String soundFilePath) {
//        try {
//            Clip clip = AudioSystem.getClip();
//            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFilePath));
//            clip.open(audioInputStream);
//            clip.start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void gameAnimalsStarts() {
//        угадыватьЖивотныхButton.setVisible(false);
//        угадыватьИнструментыButton.setVisible(false);
//
//        button1.setVisible(true);
//        button2.setVisible(true);
//        button3.setVisible(true);
//        gameLabel.setText("Какое животное издает такой звук?");
//        Animals animal = new Animals();
//        animal.fillForGame();
//
//
//
//
//        button1.setText(null);
//        button2.setText(null);
//        button3.setText(null);
//        button1.setIcon(new ImageIcon("F:\\skypro\\projects\\testgui\\test\\src\\images\\animals\\" + animal.forGame[0] + ".jpg"));
//        button2.setIcon(new ImageIcon("F:\\skypro\\projects\\testgui\\test\\src\\images\\animals\\" + animal.forGame[1] + ".jpg"));
//        button3.setIcon(new ImageIcon("F:\\skypro\\projects\\testgui\\test\\src\\images\\animals\\" + animal.forGame[2] + ".jpg"));
//        playSound("F:\\skypro\\projects\\testgui\\test\\src\\sounds\\animals\\" + animal.forGame[2] + ".wav");
//
//
//    }
//
//    public void gameInstrumentsStarts() {
////        угадыватьЖивотныхButton.setVisible(false);
////        угадыватьИнструментыButton.setVisible(false);
////        button1.setVisible(true);
////        button2.setVisible(true);
////        button3.setVisible(true);
////        gameLabel.setText("Какое животное издает такой звук?");
////        Instruments instruments = new Instruments();
////        button1.setText(instruments.getMusicalInstruments());
//
//    }
//
//
//}
