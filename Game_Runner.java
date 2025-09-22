import Game.Game_GUI;
import Player.PlayerStats;
import java.io.*;
public class Game_Runner extends Game_GUI
{
    public static void main(String[] args) throws IOException 
    {
        
        int[] PlayerInfo = new int[3];
        PlayerStats player = new PlayerStats();
        PlayerInfo[0] = 1;
        PlayerInfo[1] = 2;
        PlayerInfo[2] = 3;
        player.modifyStats(PlayerInfo);
        //FYI - This was testing and stuff please remove when not needed

    }    
}
