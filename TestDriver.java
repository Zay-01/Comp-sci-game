import java.io.IOException;

public class TestDriver
{

    public static void main(String[] args) throws IOException 
    {

        ProgressSaving savingTest = new ProgressSaving();
        Player playerTest = new Player(savingTest.obtainSavePoint());
        Enemy enemyTest = new Enemy(90, .4, 1, "nuclear bomb", 900);
        
        System.out.println(playerTest);
        playerTest.amountHealed(900);
        System.out.println(playerTest);
        playerTest.gainedXp(1);
        System.out.println(playerTest);
        System.out.println(enemyTest);
        
        int[] e = savingTest.obtainSavePoint();

        e[0] = 2;
        e[1] -= 90;
        e[2] = 2;

        savingTest.setSavePoint(e);

        e = savingTest.obtainSavePoint();

        System.out.println(playerTest);


        

    }
}