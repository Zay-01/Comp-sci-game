package Values;
public class PlayerStats
{
    int[] stats = new int[3];
    String path_Player = "C:\\Users\\mobmi\\ToMerge\\Values\\Player_Info.txt";
    
    public int[] giveStats(int i, int[] e)
    {
        stats = e;
            return stats;
    }

    public int[] modifyStats(int[] Info)
    {
        stats = Info;
        for(int i: stats)
        {


        }
        return stats;
    }
    
}