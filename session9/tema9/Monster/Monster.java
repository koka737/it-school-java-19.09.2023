package tema9.Monster;

public class Monster {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " is attacking");
    }

    public String getName() {
        return name;
    }
}
