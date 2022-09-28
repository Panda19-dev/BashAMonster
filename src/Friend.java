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

        //HP
        public int getHP() {
            return this.hp;
        }
        public void setHP(int newHP) {
            this.hp = newHP;
        }

        //DMG
        public int getDMG() {
            return this.dmg;
        }
        public void setDMG(int dmg) {
            this.dmg = dmg;
        }
        //NAME
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
}
