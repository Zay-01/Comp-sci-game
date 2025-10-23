public class TestDriver
{

    public static void main(String[] args) 
    {

        Player test = new Player();
        test.damageRecieved(90);
        System.out.println(test);
        System.out.println(test.damageRecieved(100))
        System.out.println(test.manaUsed(120));
        System.out.println(test);
    }
}