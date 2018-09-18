package mysound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import sun.audio.*;
import java.io.*;

public class MySound {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(200, 200);
        JButton b = new JButton("Click me");
        f.add(b);
        b.addActionListener(new AL());
        f.setVisible(true);

    }

    public static class AL implements ActionListener {

        public final void actionPerformed(ActionEvent e) {
            music();
        }
    }

    public static void music() {
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
      //  ContinousAudioDataStream loop = null;
        try {
            BGM = new AudioStream(new FileInputStream("song.mp3"));
            MD = BGM.getData();
        //    loop = new ContinousAudioDataStream(MD);
        } catch (IOException error) {
            
        }

        MGP.start();

    }

}
