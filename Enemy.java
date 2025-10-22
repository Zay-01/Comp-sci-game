public class Enemy 
{

    private int attack;
    private double defense;
    private int health;
    private int shield;
    private String name;

    /**
     * @param Attack
     * @param Defense
     * @param Health
     * @param Shield
     * @param Name
     */
    public Enemy(int Attack, Double Defense, int Health, int Shield, String Name)
    {
        attack = Attack;
        defense = Defense;
        health = Health;
        shield = Shield;
        name = Name;
    }

    public String getName()
    {
        return name;
    }

    public boolean killedCheck()
    {
        return health <= 0;
    }

    /**
     * Shield reduces it by a certain % due to armor reducing how much the enemy swings or attacks you
     * the weight of armor is heavy after all cant have much heavy swings 
     * @return attack amnt
     */
    public void Attack()
    {
        health -= attack - (attack*shield);
    }


}
