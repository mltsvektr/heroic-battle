public class Warrior extends Hero {
    private int armor;

    public Warrior(String name, int health, int armor) {
        super(name, health);
        this.armor = armor;
    }

    @Override
    public void takeDamage(int damage) {
        if (armor > 0) {
            int remainingDamage = damage - armor;
            if (remainingDamage > 0) {
                armor = 0;
                super.takeDamage(remainingDamage);
            } else {
                armor -= damage;
                System.out.println(getName() + " gets hit, but the armor absorbs the damage. Armor remaining: " + armor);
            }
        } else {
            super.takeDamage(damage);
        }
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " raised his sword!");
        enemy.takeDamage(20);
    }
}
