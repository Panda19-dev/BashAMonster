public class Main {
    public static void main(String[] args) {

        var Tilda = new Friend("Tilda", 5, 10, true);
        var Shrimp = new Friend("Shrimp", 5, 10, false);

        Tilda.getHP();
        Shrimp.getHP();
        Tilda.setHP(4);
        Tilda.getHP();
    }
}