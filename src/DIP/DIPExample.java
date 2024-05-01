package DIP;

public class DIPExample {
    public static void main(String[] args) {

        Weapon sword = new Sword();
        Weapon bow = new Bow();

        BattleService battleService = new BattleService(sword);
        battleService.attack();

        battleService = new BattleService(bow);
        battleService.attack();
    }
}
