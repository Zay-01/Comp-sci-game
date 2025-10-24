public class TestDriver
{

    public static void main(String[] args) 
    {

        progressSaving test1 = new progressSaving();
        Player test = new Player(test1.obtainSavePoint());

        System.out.println(test);
        test.amountHealed(900);
        System.out.println(test);
        test.gainedXp(300);
        System.out.println(test);
    }
}