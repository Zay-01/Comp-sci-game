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

    /**
     * @param damage
     * Damages the enemy, defense reduces a % of the damage 
     */
    public void damageRecieved(int damage)
    {

        health -= damage-((int)(damage*defense));

    }

    public boolean isAlive()
    {
        return health > 0;
    }

    public int Attack()
    {
        double increase = Math.random() * 10;

        return attack + (int)(attack*increase);
    }


}
