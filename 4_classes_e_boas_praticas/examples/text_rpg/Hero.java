public class Hero {
    public Hero(
            String name,
            int startHealth,
            int healthIncrement,
            int startExp,
            int expIncrement,
            int startAttack,
            int attackIncrement,
            int startDefense,
            int defenseIncrement
        )
    {
        this.level = 1;

        this.name = name;

        this.maxHealth = startHealth;

        this.health = startHealth;
        this.attack = startAttack;
        this.defense = startDefense;

        this.exp = 0;
        this.neededExp = startExp;

        this.healthIncrement = healthIncrement;
        this.expIncrement = expIncrement;
        this.attackIncrement = attackIncrement;
        this.defenseIncrement = defenseIncrement;

        this.defending = false;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getExp() {
        return exp;
    }

    public int getNeededExp() {
        return neededExp;
    }

    public void setDefending(boolean defending) {
        this.defending = defending;
    }

    public boolean isDefending() {
        return defending;
    }

    /**
     * Checks if hero is dead.
     */
    public boolean isDead() {
        return health == 0;
    }

    /**
     * Applies damage to hero.
     */
    public void applyDamage(int damage) {
        if (isDead()) {
            return;
        }
        damage = damage - defense;

        if (defending) {
            damage /= 2;
        }

        if (damage < 0) {
            damage = 0;
        }

        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    /**
     * Heals hero.
     */
    public void heal(int amount) {
        if (isDead() || amount < 0) {
            return;
        }

        health += amount;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    /**
     * Resurrects hero.
     */
    public void resurrect() {
        this.health = 1;
    }

    /**
     * Adds amount of experience to hero, leveling up if needed.
     */
    public void giveExp(int amount) {
        exp += amount;

        while (exp >= neededExp) {
            maxHealth += healthIncrement;

            attack += attackIncrement;
            defense += defenseIncrement;

            exp -= neededExp;
            neededExp += expIncrement;
            level++;
        }
    }

    private String name;

    private int level;
    private int health;
    private int maxHealth;

    private int exp;
    private int neededExp;

    private int attack;
    private int defense;

    private int healthIncrement;
    private int expIncrement;
    private int attackIncrement;
    private int defenseIncrement;

    private boolean defending;
}
