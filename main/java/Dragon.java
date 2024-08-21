import java.util.Random;

public class Dragon extends Enemy {
    private boolean fly;

    public Dragon(int health) {
        super(health);
        this.fly = false;
    }

    private void isFlying() {
        Random random = new Random();
        this.fly = random.nextBoolean();
        if (fly) {
            System.out.println("Dragon is taking off into the sky!");
        } else {
            System.out.println("Dragon remains on earth!!");
        }
    }

    public void breatheFire(Hero hero) {
        if (fly) {
            int fireDamage = 40;
            System.out.println("Dragon is breathing fire!" + hero.getName() + " got " + fireDamage + " damage!");
            hero.takeDamage(fireDamage);
        } else {
            System.out.println("Dragon uses its claws.");
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (fly) {
            System.out.println("Dragon dodges the attack in the air, the damage is zero!");
        } else {
            super.takeDamage(damage);
        }
    }

    @Override
    public void attackHero(Hero hero) {
        isFlying();
        if (fly) {
            breatheFire(hero);
        } else {
            int damage = 30;
            System.out.println("Dragon attacks!" + hero.getName() + " got " + damage + " damage!");
            hero.takeDamage(damage);
        }
    }
}
