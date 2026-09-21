package feature_session_7.assignment_problems;
public class Assignment1 {
    private int health;
    private final int maxHealth;
    public Assignment1(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }
    public void takeDamage(int amount) {
        health = health - amount;
        if (health < 0) {
            health = 0;
        }
    }
    public void heal(int amount) {
        health = health + amount;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }
    public int getHealth() {
        return health;
    }
    public static void main(String[] args) {
        Assignment1 c = new Assignment1(100);
        c.takeDamage(30);
        System.out.println(c.getHealth());
        c.heal(50);
        System.out.println(c.getHealth());
        c.takeDamage(150);
        System.out.println(c.getHealth());
    }
}