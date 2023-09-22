package Window;

import javax.swing.*;
import java.awt.*;

public class indexWindow extends JFrame {
    public indexWindow(){
            setTitle("Welcome");
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            setSize((int) (screenSize.width * 0.25), (int) (screenSize.height * 0.5));
            setResizable(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);
    }


}
