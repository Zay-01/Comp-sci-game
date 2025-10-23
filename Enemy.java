public class Enemy 
{

    private int attack;
    private double defense;
    private int health;
    private String name;

    /**
     * @param Attack
     * @param Defense
     * @param Health
     * @param Name
     */
    public Enemy(int Attack, Double Defense, int Health, String Name)
    {
        attack = Attack;
        defense = Defense;
        health = Health;
        name = Name;
    }

    public String getName()
    {
        return name;
    }

    public boolean isAlive()
    {
        return health > 0;
    }

    public int Attack()
    {
        return attack;
    }


}
