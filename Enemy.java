
public class Enemy 
{

    private int attack;
    private int health;
    private int manaShield;

    private String name;

    private double defense;

    private final int maxHealth;
    private final int maxShield;

    /**
     * @param Attack
     * @param Defense
     * @param Health
     * @param Name
     * @param Shield
     */
    public Enemy(int Attack, Double Defense, int Health, String Name, int Shield)
    {
        attack = Attack;
        defense = Defense;
        health = Health;
        name = Name;
        manaShield = Shield;

        maxShield = Shield;
        maxHealth = Health;
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

    public void shatterShield()
    {
        manaShield = 0;

    }

    @Override
    public String toString()
    {
        return "\n[E-HEALTH]: " + health + "\n[E-DEFENSE]: " + defense + "\n[E-ATTACK]: " + attack + "\n[E-SHIELD]: " + manaShield + "\n\n[E-MAX-HEALTH]: " + maxHealth + "\n[E-MAX-SHIELD]: " + maxShield + "\n\n[E-ALIVE]: " + isAlive();

    }
}
