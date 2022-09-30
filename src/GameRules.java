import java.util.ArrayList;

public class GameRules {

    ArrayList<Friend> characters = new ArrayList<Friend>();

    public ArrayList<Friend> getList() {
        return characters;
    }

    public void DMG(Friend friend, Friend enemy) {
        if(!enemy.isFriend) {
            if(enemy.getHP() > 0) {
                int dmg = friend.getDMG();
                int hp = enemy.getHP();
                hp -= dmg;
                if(hp <= 0) {
                    enemy.setLife(false);
                    System.out.println("You killed the enemy!");
                } else {
                    System.out.println("You did " + dmg + " damage to the enemy");
                    System.out.println("The enemy now has " + hp + "hp left");
                }
            }
        }
    }

    public void HEAL(Friend friend) {
        if(friend.isFriend) {
            if(friend.getHP() < friend.maxHP) {
                friend.setHP(friend.getHP() + 3);
                if(friend.getHP() >= friend.getMaxHP()) {
                    friend.setHP(friend.getMaxHP());
                    System.out.println("Healed your friend to max HP!");
                } else {
                    System.out.println("Healed your friend to " + friend.getHP() + " HP");
                }

            } else {
                System.out.println("You are already at max HP!");
            }
        } else {
            System.out.println("Why do you want to heal your enemy?");
        }
    }
}
