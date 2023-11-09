package tema9.Monster;

public class MiniMonster extends Monster {
    public MiniMonster(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with a mini attack!");
    }
}
