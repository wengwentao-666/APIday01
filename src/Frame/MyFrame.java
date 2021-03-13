package Frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
                {
                    SimpleFrame TestFrame = new SimpleFrame();
                    TestFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    TestFrame.setVisible(true);
                });

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHight = screenSize.height;
        int screenWidth = screenSize.width;
        System.out.println(screenHight + " " +screenWidth);
    }
}
class SimpleFrame extends JFrame{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public SimpleFrame(){
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        setLocation(600,300);
        setTitle("第一次尝试！");
    }

}