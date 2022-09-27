public class Friend {

        String name;
        int hp;
        int dmg;
        boolean isFriend;
        public Friend(String name, int hp, int dmg, boolean isFriend) {
            this.name = name;
            this.hp = hp;
            this.dmg = dmg;
            this.isFriend = isFriend;
        }
        public Boolean isFriend() {
            return this.isFriend;
        }
        public void getHP() {
            System.out.println(name + " has " + this.hp + " liv kvar!");
        }
        public void setHP(int newHP) {
            this.hp = newHP;
        }
}
