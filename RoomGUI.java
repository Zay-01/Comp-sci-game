import javax.swing.*;

public class RoomGUI {
    private JFrame gameFrame = new JFrame();
    private JLabel playerLabel;
    private int player_X = 100, player_Y = 100;

    public RoomGUI() {
        setWindow();
        initPlayer();

        setLayout(-1);
    }

    /**
     * Sets the window for the game
     */
    public void setWindow() 
    {
        gameFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gameFrame.setTitle("Void Game");
        gameFrame.setLayout(null);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setVisible(true);
    }

    /**
     * @param room
     * Sets the layout when you enter a room, game starts from -1 which is the intro screen
     */
    public void setLayout(int room) {
        gameFrame.getContentPane().removeAll();

        JLabel label = new JLabel();
        ImageIcon icon = null;

        switch (room) {
            case -1 -> icon = new ImageIcon("RoomSprites/Logo.png");
            case 0 -> icon = new ImageIcon("RoomSprites/Room0.png");
            case 1 -> icon = new ImageIcon("RoomSprites/Room1.png");
            default -> System.out.println("Invalid room!");
        }

        if (icon != null) {
            label.setIcon(icon);
            label.setBounds(0, 0, gameFrame.getWidth(), gameFrame.getHeight());
            gameFrame.add(label);
        }

        gameFrame.revalidate();
        gameFrame.repaint();
    }

    /**
     * Create the player
     */
    private void initPlayer() 
    {
        ImageIcon playerIcon = new ImageIcon("RoomSprites/Untitled.png");
    
        playerLabel = new JLabel(playerIcon);
        playerLabel.setBounds(player_X, player_Y, 200, 200);
        gameFrame.add(playerLabel); // add AFTER background
        gameFrame.setComponentZOrder(playerLabel, 0); // make sure player is on top
        gameFrame.repaint();
    }

    /**
     * @param x
     * @param y
     */
    public void playerMove(int x, int y) 
    {
        player_X += x;
        player_Y += y;
        playerLabel.setLocation(player_X, player_Y);
    }

    public JFrame getFrame() 
    {
        return gameFrame;
    }
}
