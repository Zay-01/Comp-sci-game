import java.io.*;
import java.util.Scanner;

public class ProgressSaving 
{

    private Scanner sc;
    private RandomAccessFile fw;
    private int[] info = new int[3];


    /**
     * @return info array which will be used to initialize the player stats from the player file!
     * <br>[[0] - Level] 
     * <br>[[1] - Xp]
     * <br>[[3] - Room number - <b>DO NOT USE IN PLAYER CLASS<b>]
     */
    public int[] obtainSavePoint() throws IOException
    {
            sc = new Scanner(new File("SaveFile.txt"));

            info[0] = sc.nextInt();
            info[1] = sc.nextInt();
            info[2] = sc.nextInt();

        return info;

    }

    /**
     * Sets the main 3 stats into the text file so if you ever quit you can restore your progress
     * Anything past the checkpoint will be lost until you reach another checkpoint or go back to a checkpoint
     * to save your progress 
     * [[1] - Level]
     *  <br><b>WARNING: THIS ONLY RUNS WHEN YOU SAVE TO A CHECKPOINT!<b>
     */
    public void setSavePoint(int[] input) throws IOException 
    {

        fw = new RandomAccessFile("SaveFile.txt", "rw");
        fw.setLength(0);

        for (int i = 0; i < 3; i++) 
        {
            fw.writeBytes(info[i] + "\n"); 
        }

    }
}
