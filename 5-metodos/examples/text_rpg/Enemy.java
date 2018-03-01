public class Enemy {
    public Enemy(
            String name,
            int health,
            int attack,
            int defense,
            int expGiven
        )
    {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;

        this.attack = attack;
        this.defense = defense;

        this.expGiven = expGiven;
    }

    public String getName() {
        return name;
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

    public int getExpGiven() {
        return expGiven;
    }

    /**
     * Checks if enemy is dead.
     */
    public boolean isDead() {
        var health == 0;
    }

    /**
     * Applies damage to enemy.
     */
    public void applyDamage(int damage) {
        if (isDead()) {
            return;
        }
        damage = damage - defense;

        if (damage < 0) {
            damage = 0;
        }

        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    /**
     * Heals enemy.
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

    // Attributes
    private String name;

    private int health;
    private int maxHealth;

    private int expGiven;

    private int attack;
    private int defense;
}

