import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Movement implements KeyListener {
    private RoomGUI gui;

    public Movement(RoomGUI gui) {
        this.gui = gui;
        gui.getFrame().addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_UP:
             gui.playerMove(0, -10);
             System.out.println("UP");
             break;
            case KeyEvent.VK_DOWN:
             gui.playerMove(0, 10);
             System.out.println("down");
             break;
            case KeyEvent.VK_LEFT:
            gui.playerMove(-10, 0);
            System.out.println("left");
            break;
            case KeyEvent.VK_RIGHT:
            gui.playerMove(10, 0);
            System.out.println("right");
            break;
        }
    }

    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
}
