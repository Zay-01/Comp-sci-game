import javax.swing.*;
public class RoomGUI 
{
    private JFrame gameFrame = new JFrame();
    
    public void setWindow()
    {
        gameFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gameFrame.setTitle("Void Game");
        gameFrame.setVisible(true);
        gameFrame.setLayout(null);

    }

    public void setLayout(int room) 
    {
        gameFrame.getContentPane().removeAll(); 

        JLabel label = new JLabel();
        ImageIcon icon = null;

        switch (room) 
        {
        case 0:
            icon = new ImageIcon("RoomSprites/Room0.png");
            System.out.println("Room 0");
            break;
        case 1:
            icon = new ImageIcon("RoomSprites/Room1.png");
            System.out.println("Room 1");
            break;
        case 2:
            icon = new ImageIcon("RoomSprites/Room2.png");
            System.out.println("Room 2");
            break;
        default:
            System.out.println("Invalid room!");
            return;
        }

        label.setIcon(icon);
        label.setBounds(0, 0, gameFrame.getWidth(), gameFrame.getHeight());
        gameFrame.add(label);
        gameFrame.revalidate();
        gameFrame.repaint();
}


    public void setBarriers()
    {
        
    }

    public void playerMove(int x,int y)
    {
        
    }
}
