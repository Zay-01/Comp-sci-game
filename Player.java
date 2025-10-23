public class Player
{
    private int attack,health,mana;
    private double defense;
    private final int maxHealth, maxMana;

    /**
     * @param Attack
     * @param Defense
     * @param Health
     * @param Mana
     */
    public Player(int Attack,double Defense,int Health,int Mana)
    {
        attack = Attack;
        defense = Defense;
        health = Health;
        mana = Mana;
        maxHealth = Health;
        maxMana = Mana;
    }
    
    /**
     * @param actionIndex Takes you current action options
     * @return Which action you want to do and a integer of what there currently is
     */
    public String actions(int actionIndex)
    {

            switch(actionIndex)
            {
            case 1:
            return "Attack " + attack;
            case 2:
            return "Defend " + defense;
            case 3:
            return "Mana " + mana;
            case 4: 
            return "Heal " + 30;
            }
        
        return "[ERROR Did you figure this out?? - Player -> Actions]";
    }

    /**
     * @param damage How much to remove from players health
     * Defense is a % and reduces how much attack damages the players
     */
    public void damageRecieved(int damage)
    {
        health -= damage-((int)(damage*defense));
    }


    /**
     * @param heal 
     * How much player healed up
     */
    public void amountHealed(int heal)
    {
        health += heal;
        if(health > maxHealth)
        {
            health = maxHealth;
        }
    }

    public void manaUsed(int used)
    {
        mana -= used;
        if(mana <= 0)
        {
            health -= (int)(used*defense);
        }
    }
    public boolean isAlive()
    {
        return health > 0;
    }

    public String toString()
    {
        return "\n[HEALTH]: " + health + "\n[DEFENSE]: " + defense + "\n[ATTACK]: " + attack + "\n[MANA]: " + mana + "\n[MAX-HEALTH]: " + maxHealth + "\n[MAX-MANA]: " + maxMana + "\n[ALIVE]: " + isAlive();
    }
}
