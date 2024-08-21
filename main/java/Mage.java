public class Mage extends Hero {
    private int magicPower;

    public Mage(String name, int health, int magicPower) {
        super(name, health);
        this.magicPower = magicPower;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int baseDamage = 30;
        int actualDamage = magicPower > 0 ? baseDamage : baseDamage / 2;
        if (magicPower > 0) {
            magicPower -= 10;
            System.out.println(getName() + " uses magical power and inflicts " + actualDamage + " damage!");
        } else {
            System.out.println(getName() + " exhausted his magic power, deals reduced damage: " + actualDamage);
        }
        enemy.takeDamage(actualDamage);
    }
}
