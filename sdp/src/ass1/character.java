package ass1;

abstract class character {
    private Weaponbehavior weapon;

    public Weaponbehavior getWeapon() {
        return weapon;
    }

    public void setWeapon(Weaponbehavior w) {
        this.weapon = w;
    }
}

class king extends character {
    public fight() {

    }
}

    class queen {
        public fight() {
        }
    }

    class knight {
        public fight() {
        }


    }

    class troll {
        public fight() {
        }
    }
}