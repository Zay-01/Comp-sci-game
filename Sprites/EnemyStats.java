package Sprites;
import java.io.*;

public class EnemyStats
{
    int[] stats = new int[3];
    String path_Enemy = "Enemy_Info.txt";

    /**
     * @return The info from the player text file
     */
    public int[] getStats()
    {
        return stats;
    }


    public void modifyStats(int[] Info) throws IOException 
    {


    }

    }