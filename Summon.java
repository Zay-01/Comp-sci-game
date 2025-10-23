
public class Summon
{
    private Enemy currentEntity;
    private int[] range = new int[2];
    private int random;

    public void enemyRange(int minimumRange,int maximumRange)
    {
        random = (int) (Math.random()*maximumRange + minimumRange);
    }

}