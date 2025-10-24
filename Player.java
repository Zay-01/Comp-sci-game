public class Player
{
    private int[] attack = {10,20,30,40,50};
    private int[] health = {100,200,300,400,500};
    private int[] mana = {100,120,140,160,180};
    
    private double[] defense = {.1,.2,.3,.4,.5};

    private int level = 0;
    private int xp = 0;

    private final int[] maxHealth = {100,200,300,400,500};
    private final int[] maxMana = {100,120,140,160,180};

    public Player(int[] info)
    {
        level = info[0];
        xp = info[1];
    }

    public void savePointReset()
    {
        health = maxHealth;
        mana = maxMana;
    }

    /**
     * @param damage How much to remove from players health
     * Defense is a % and reduces how much attack damages the players
     */
    public void damageRecieved(int damage)
    {
        health[level] -= damage-((int)(damage*defense[level]));

    }

    /**
     * @param xp XP gained from monster
     * level up if required xp is reached and level is not the limit
     * levrl - 1 should be used instead of the number
     */
    public void gainedXp(int xpGain)
    {
        xp += xpGain;
        if(xp >= 1000 && level != 4)
        {
            xp -= 1000;
            level += 1;
            savePointReset();

        }

    }

    /**
     * @param heal
     * Heals 100% of the healed amount
     * Restores 10% mana from healed amount
     * Avoids health overflow
     */
    public void amountHealed(int heal)
    {
        health[level] += heal;
        mana[level] += (int)(heal*.1);

        if(health[level] > maxHealth[level])
        {
            health = maxHealth;

        }
    }

    /**
     * @param Mana
     * Reduces mana stored
     * Any other mana that goes above the amount
     * stored will damage the player defense reduces
     * damage inflicted
     */
    public void manaUsed(int Mana)
    {
        mana[level] -= Mana;

        if(mana[level] < 0)
        {

            health[level] += mana[level] - (int)(mana[level]*defense[level]);
            mana[level] = 0;
 
        }

    }

    public boolean isAlive()
    {
        return health[level] > 0;
    }

    @Override
    public String toString()
    {
        return "\n[HEALTH]: " + health[level] + "\n[DEFENSE]: " + defense[level] + "\n[ATTACK]: " + attack[level] + "\n[MANA]: " + mana[level] + "\n\n[MAX-HEALTH]: " + maxHealth[level] + "\n[MAX-MANA]: " + maxMana[level] + "\n\n[ALIVE]: " + isAlive() + "\n[LEVEL]: " + level + "\n[XP]: " + xp;
    }
}
