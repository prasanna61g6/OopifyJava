abstract class Enemy {
    abstract void spawn();
    abstract void attack();
}

// making BossEnemy as abstract as we can't provide implementation for attack() method
abstract class BossEnemy extends Enemy {
    @Override
    void spawn() {
        System.out.println("Boss Enemy is making a dramatic entry");
    }
}

class Dragon extends BossEnemy {
    @Override
    void attack() {
        System.out.println("Spitting fire");
    }
}

class Assasin extends BossEnemy {
    @Override
    void attack() {
        System.out.println("Shoots Bullets");
    }
}
public class AbstractChild {
    public static void main(String[] args) {
        BossEnemy boss1 = new Dragon();
        BossEnemy boss2 = new Assasin();
        boss1.spawn();
        boss1.attack();
        boss2.spawn();
        boss2.attack();
    }
}
