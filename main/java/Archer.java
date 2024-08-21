import java.util.Random;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        Random random = new Random();
        boolean willDodge = random.nextBoolean();
        if (willDodge) {
            System.out.println(getName() + " dodges the attack!");
        } else {
            int damage = 10;
            System.out.println(getName() + " releases an arrow!");
            enemy.takeDamage(damage);
        }
    }
}
