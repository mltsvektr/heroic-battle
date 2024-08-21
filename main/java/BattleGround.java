public class BattleGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Niall", 200, 50);
        Hero mage = new Mage("Vidar", 150, 70);
        Hero archer = new Archer("Haakon", 120);
        Enemy dragon = new Dragon(100);
        Enemy demon = new Demon(200);
        Enemy ghost = new Ghost(150);
        System.out.println("================");
        System.out.println("Battle 1: Dragon");
        battle(archer, dragon);
        System.out.println("================");
        System.out.println("Battle 2: Demon");
        battle(mage, demon);
        System.out.println("================");
        System.out.println("Battle 3: Ghost");
        battle(warrior, ghost);
    }

    public static void battle(Hero hero, Enemy enemy) {
        while (enemy.isAlive() && hero.isAlive()) {
            hero.attackEnemy(enemy);
            if (!enemy.isAlive()) break;
            enemy.attackHero(hero);
        }
        if (enemy.isAlive()) {
            System.out.println("Enemy has won!");
        } else {
            System.out.println("Hero has won!");
        }
    }
}