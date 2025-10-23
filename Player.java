public class Player
{
    private int attack;
    private double defense;
    private int health;
    private int mana;

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
     * Defense is a % and reduces how much attack hurts the players
     */
    public void damageRecieved(int damage)
    {
        health -= damage-((int)damage*defense);
    }

    /**
     * @param heal How much player healed up
     * @param reduction How much health gets voided due to mana attack
     */
    public void amountHealed(int heal, double reduction)
    {
        health += (int) (heal-(heal*reduction));
    }

    public boolean isAlive()
    {
        if(health <= 0)
        {
            return false;
        }
        return true;
    }
}
