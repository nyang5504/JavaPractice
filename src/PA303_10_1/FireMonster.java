package PA303_10_1;

public class FireMonster extends Monster{
    FireMonster(String monsterName) {
        super(monsterName);
    }

    @Override
    public String attack(){
        return "Attack with fire!";
    }
}
