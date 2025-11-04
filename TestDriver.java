import java.io.IOException;
import java.util.Scanner;

public class TestDriver
{

    public static void main(String[] args) throws IOException  
    {

        Scanner sc = new Scanner(System.in);
        ProgressSaving savingTest = new ProgressSaving();
        Player playerTest = new Player(savingTest.obtainSavePoint());
        Enemy enemyTest = new Enemy(90, .4, 1, "nuclear bomb", 900);
        RoomGUI gui = new RoomGUI();
        

        System.out.println(playerTest);
        playerTest.amountHealed((int)(Math.random()*20));
        System.out.println(playerTest);
        playerTest.gainedXp(1);
        System.out.println(playerTest);
        System.out.println(enemyTest);
        playerTest.damageRecieved(33);

        int[] info = savingTest.obtainSavePoint();
        gui.setWindow();
        gui.setLayout(-1);


        while(true)
        {
            int input = sc.nextInt();
            gui.setLayout(input);
        }

          
    }
}