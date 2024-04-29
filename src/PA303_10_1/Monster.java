package PA303_10_1;

public class Monster {
    String name;

    Monster(String monsterName){
        name = monsterName;
    }
    public String attack(){
        return "!^_&^$@+%$* I don't know how to attack!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
