package PA303_10_1;

public class WaterMonster extends Monster{
    WaterMonster(String monsterName) {
        super(monsterName);
    }

    @Override
    public String attack(){
        return "Attack with water!";
    }
}
