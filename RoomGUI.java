import javax.swing.*;
public class RoomGUI 
{
    private JFrame gameFrame = new JFrame();
    private ImageIcon room0 = new ImageIcon("RoomSprites/Room1.png");
    private ImageIcon room1 = new ImageIcon("RoomSprites/Room1.png");    
    private ImageIcon room2 = new ImageIcon("RoomSprites/Room2.png");    
    int test = 2;
    
    public void setWindow()
    {
        gameFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gameFrame.setTitle("Void Game");
        gameFrame.setVisible(true);
        gameFrame.setLayout(null);

    }

    public void setLayout()
    {
        JLabel label = new JLabel();
        switch(test)
        {
            case 0:
            label.setIcon(room0);
            label.setBounds(0, 0, gameFrame.getWidth(),gameFrame.getHeight());
            label.setVisible(true);
            gameFrame.add(label);
            System.out.println("Room 0");

            break;
            
            case 1:
            label.setIcon(room1);
            label.setBounds(0, 0, gameFrame.getWidth(),gameFrame.getHeight());
            label.setVisible(true);
            gameFrame.add(label);
            System.out.println("Room 1");
            break;

            case 2:
            label.setIcon(room2);
            label.setBounds(0, 0, gameFrame.getWidth(),gameFrame.getHeight());
            label.setVisible(true);
            gameFrame.add(label);
            System.out.println("Room 3");
            break;
        }
    }

    public void player()
    {
        JLabel playerLabel = new JLabel();
        
    }
}
