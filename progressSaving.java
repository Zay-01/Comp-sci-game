import java.io.*;
import java.util.Scanner;

public class progressSaving 
{
    private Scanner sc;
    
    public progressSaving()
    {
        try
        {
                sc = new Scanner(new File("Save.txt"));

        }

        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    /**
     * 
     * @return info array which will be used to initialize the player stats from the player file!
     * @format:
     * [0] Level
     * [1] Xp
     * [3] Room number - DO NOT USE IN PLAYER CLASS
     */
    public int[] obtainSavePoint()
    {
        int[] info = new int[3];
        info[0] = sc.nextInt();
        info[1] = sc.nextInt();
        info[2] = sc.nextInt();
        return info;

    }

    /**
     *  Modifies text file and stores all important stats that need to be saved througout different runs
     */
    public void setSavePoint()
    {
        /* LATER */
    }

    
}
