import java.io.*;
import java.util.Scanner;

public class ProgressSaving 
{

    private Scanner sc;
    private RandomAccessFile tbd;
    int[] info = new int[3];

    public ProgressSaving()
    {
        try
        {
                sc = new Scanner(new File("SaveFile.txt"));
                tbd = new RandomAccessFile("SaveFile.txt", "rw");
        }

        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    /**
     * @return info array which will be used to initialize the player stats from the player file!
     * [[0] - Level] 
     * [[1] - Xp]
     * [[3] - Room number - <b>DO NOT USE IN PLAYER CLASS<b>]
     */
    public int[] obtainSavePoint()
    {
        try
        {
            sc = new Scanner(new File("SaveFile.txt"));

            info[0] = sc.nextInt();
            info[1] = sc.nextInt();
            info[2] = sc.nextInt();
        }

        catch(IOException e)
        {
            System.out.println(e);
        }


        return info;

    }

    /**
     *  Modifies text file and stores all important stats that need to be saved througout different runs
     *  <br><b>WARNING: THIS ONLY RUNS WHEN YOU SAVE TO A CHECKPOINT!<b>
     */
    public void setSavePoint(int[] input) throws IOException 
    {
        
        tbd.setLength(0);
        for (int i = 0; i < 3; i++) 
        {
            tbd.writeBytes(info[i] + "\n"); 
        }

    }
}
