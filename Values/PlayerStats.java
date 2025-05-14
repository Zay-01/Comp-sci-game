package Values;

import java.io.*;

public class PlayerStats
{
    int[] stats = new int[3];
    String path_Player = "Player_Info.txt";

    /**
     * @return The info from the player text file
     */
    public int[] getStats()
    {
        return stats;
    }

    /**
     * 
     * @param Info Array from Game_Runner, its given then it modifies the text file for player info
     * this is in the case that the player quits the game and so they can start off from where they left!
     * @throws IOException incase of issues
     */
    public void modifyStats(int[] Info) throws IOException 
    {
        stats = Info;
        BufferedWriter modifying_player = new BufferedWriter(new FileWriter("Values/Player_Info.txt"));
        for (int i = 0; i < stats.length; i++) 
        {
            modifying_player.write(stats[i] + "\n");
        }
        modifying_player.close();
    }

    }
    
