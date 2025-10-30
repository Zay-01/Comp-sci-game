import javax.swing.*;
public class RoomGUI 
{
    private JFrame gameFrame = new JFrame();
    private RoomLoading room = new RoomLoading();
    
    public void setWindow()
    {
        gameFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gameFrame.setTitle("Void Game");
        gameFrame.setVisible(true);
    }

    public void setLayout()
    {
        
    }
}
