import java.util.ArrayList;

public class Game {
    ArrayList<Friend> characters = new ArrayList<Friend>();

    Friend Tilda = new Friend("Tilda", 20, 10, true);
    Friend Shrimp = new Friend("Shrimp", 15, 5, false);
    Friend Oliver = new Friend("Oliver", 10, 1, true);

    public ArrayList<Friend> getList() {
        return characters;
    }

    public void DMG(Friend friend, Friend enemy) {
        if(!enemy.isFriend) {
            if(enemy.getHP() > 0) {
                int dmg = friend.getDMG();
                int hp = enemy.getHP();
                hp -= dmg;
            }
        }
    }

}
