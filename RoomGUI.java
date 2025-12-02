import javax.swing.*;

public class RoomGUI 
{
    JFrame frame = new JFrame();


    /**
     * Set up window layout 
     */
    public void windowLayout()
    {

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setTitle("Void Run");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);


        frame.setVisible(true);
    }

    public void roomLayout()
    {
        ImageIcon test = new ImageIcon("RoomSprites/Logo.png");
    }
}
