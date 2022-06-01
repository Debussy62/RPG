public abstract class Heroes implements Fighter{
    private String name;
    private int hp;
    private int force;
    private int dexterity;
    private int xp;
    private int gold;

    public Heroes(String neme, int hp, int force, int dexterity, int xp, int gold) {
        this.name = name;
        this.hp = hp;
        this.force = force;
        this.dexterity = dexterity;
        this.xp = xp;
        this.gold = gold;
    }
    @Override
    public int attack() {
        if(dexterity*3 > getRandomValue())return force;
        else return 0;
    }

    private int getRandomValue() {
        return (int)(Math.random()*100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    @Override
    public String toString() {
        return String.format( "%s здоровье:%d" , name, hp);
    }
    }
