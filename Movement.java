import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Movement extends JFrame implements KeyListener
{

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
System.out.println("balls " + e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e);
    }















}
