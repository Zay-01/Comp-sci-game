public class Player
{
    int[] attack = {10,20,30,40,50};
    int[] health = {100,200,300,400,500};
    int[] mana = {100,120,140,160,180};
    
    double[] defense = {.1,.2,.3,.4,.5};

    private int level = 0;
    private int xp = 0;

    private final int[] maxHealth = {100,200,300,400,500};
    private final int[] maxMana = {100,120,140,160,180};

    public Player(int lastLevel,int lastXp)
    {
        level = lastLevel;
        xp = lastXp;
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
        if(xp == 1000 && level != 4)
        {
            xp -= 1000;
            level += 1;
            savePointReset();
        }
    }

    /**
     * @param heal
     * Heals 75% of the healed amount
     * Restores 25% mana from healed amount
     * Avoids health overflow
     */
    public String amountHealed(int heal)
    {
        health[level] += (int)(heal*.75);
        mana[level] += (int)(heal*.25);
        if(health[level] > maxHealth[level])
        {
            health = maxHealth;
        }
        return "Healed: " + heal + " Current HP: " + health[level];
    }

    /**
     * @param Mana
     * Reduces mana stored
     * Any other mana that goes above the amount
     * stored will damage the player defense reduces
     * damage inflicted
     */
    public String manaUsed(int Mana)
    {
        mana[level] -= Mana;

        if(mana[level] < 0)
        {
            health[level] -= mana - (int)(mana*defense[level]);
            mana = 0;

            return " [RESTORED]: " + Mana + " [MANA]: " + mana[level] + " [HP]";

        }
        
        return "Mana Restored: " + Mana + " Current Mana: " + mana[currentLevel];


    }

    public boolean isAlive()
    {
        return health[currentLevel] > 0;
    }

    public String toString()
    {
        return "\n[HEALTH]: " + health[currentLevel] + "\n[DEFENSE]: " + defense[currentLevel] + "\n[ATTACK]: " + attack[currentLevel] + "\n[MANA]: " + mana[currentLevel] + "\n\n[MAX-HEALTH]: " + maxHealth[currentLevel] + "\n[MAX-MANA]: " + maxMana[currentLevel] + "\n\n[ALIVE]: " + isAlive() + "\n[LEVEL]: " + currentLevel + "\n[XP]: " + currentXp;
    }
}
