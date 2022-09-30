public class Friend {

        String name;
        int maxHP;
        int hp = maxHP;
        int dmg;
        boolean isFriend;
        boolean life = true;
        public Friend(String name, int maxHP, int dmg, boolean isFriend) {
            this.name = name;
            this.maxHP = maxHP;
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

        //MAXHP
        public int getMaxHP() {
            return this.maxHP;
        }

        public void setMaxHP(int NewMaxHP) {
            this.maxHP = NewMaxHP;
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
        //Life
        public boolean isAlive() {
            return this.life;
        }
        public void setLife(boolean life) {
            this.life = life;
        }
}
