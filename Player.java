public class Player
{
    int[] attack = {10,20,30,40,50};
    int[] health = {100,200,300,400,500};
    int[] mana = {100,120,140,160,180};
    
    double[] defense = {.1,.2,.3,.4,.5};

    private int currentLevel = 0;
    private int currentXp = 0;

    private final int[] maxHealth = {100,200,300,400,500};
    private final int[] maxMana = {100,120,140,160,180};

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
        health[currentLevel] -= damage-((int)(damage*defense[currentLevel]));
    }

    /**
     * @param xp XP gained from monster
     * level up if required xp is reached and currentLevel is not the limit
     * currentLevel - 1 should be used instead of the number
     */
    public void gainedXp(int xp)
    {
        currentXp += xp;
        if(currentLevel == 1000 && currentLevel != 4)
        {
            currentXp -= 1000;
            currentLevel += 1;
            savePointReset();
        }
    }

    /**
     * @param heal - How much player healed up
     */
    public String amountHealed(int heal)
    {
        health[currentLevel] += heal;

        if(health[currentLevel] > maxHealth[currentLevel])
        {
            health = maxHealth;
        }
        return "Healed: " + heal + " Current HP: " + health[currentLevel];
    }

    public String manaUsed(int Mana)
    {
        mana[currentLevel] -= Mana;

        if(mana[currentLevel] <= 0)
        {
            health[currentLevel] -= (int)(Mana*defense[currentLevel]);

            return " [] " + Mana + " [MANA] " + mana[currentLevel] + " [HP]";

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
