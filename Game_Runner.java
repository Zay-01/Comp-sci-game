import Game.Game_GUI;
import Values.PlayerStats;
import java.io.*;
public class Game_Runner extends Game_GUI
{
    public static void main(String[] args) throws IOException 
    {
        int[] PlayerInfo = new int[3];
        PlayerStats player = new PlayerStats();
        BufferedWriter modifying_player = new BufferedWriter(new FileWriter("Values/Player_Info.txt"));
        modifying_player.write("\n");
            modifying_player.write("0\n");
            modifying_player.write("0\n");
            modifying_player.close();
    }    
}
