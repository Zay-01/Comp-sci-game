public class Enemy 
{

    private int attack;
    private double defense;
    private int health;
    private String name;
    private int manaShield
    /**
     * @param Attack
     * @param Defense
     * @param Health
     * @param Name
     */
    public Enemy(int Attack, Double Defense, int Health, String Name, int Shield)
    {
        attack = Attack;
        defense = Defense;
        health = Health;
        name = Name;
        manaShield = Shield;
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

    public void heal(int heal)
    {
      health += (int) (manaShield*defense) + heal;
        manaShield -= (int)(manaShield*defense);
    }
    public int Attack()
    {
        double increase = Math.random() * 10;

        return attack + (int)(attack*increase);
    }


}
