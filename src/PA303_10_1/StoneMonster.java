package PA303_10_1;

public class StoneMonster extends Monster{
    StoneMonster(String monsterName) {
        super(monsterName);
    }

    @Override
    public String attack(){
        return "Attack with stones!";
    }
}
