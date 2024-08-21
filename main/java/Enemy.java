public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println("Enemy has suffered losses: " + damage + ". Current health level: " + health);
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(10);
        System.out.println("The attacks " + hero.getName());
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
