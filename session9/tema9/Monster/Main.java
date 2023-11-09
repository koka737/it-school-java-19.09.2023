package tema9.Monster;



public class Main {
    public static void main(String[] args) {
        MiniMonster miniMonster = new MiniMonster("lolo");
        Monster monster = new Monster("loli");
        monster.attack();
        miniMonster.attack();
        System.out.println(miniMonster instanceof Monster);
    }
}
