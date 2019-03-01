
package clock;
import java.awt.*;
import javax.swing.*;

public class Clock extends JFrame {

    public Clock(){
    
        setBackground(Color.yellow);
StillClock clock = new StillClock();

/*
MessagePanel messagePanel = new MessagePanel(clock.getHour() +":" + clock.getMinute() + ":" + clock.getSecond());

 messagePanel.setCentered(true);
 messagePanel.setForeground(Color.blue);
 messagePanel.setFont(new Font("Courier", Font.BOLD, 16));

*/
    add(clock);
    
  //  add(messagePanel, BorderLayout.SOUTH);
 }

 public static void main(String[] args) {
 Clock frame = new Clock();
 frame.setTitle(" DisplayClock ");
 frame.setSize(400, 400);
 frame.setLocationRelativeTo(null); 
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }  
    
}
