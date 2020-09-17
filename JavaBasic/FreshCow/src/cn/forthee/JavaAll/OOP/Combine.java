package cn.forthee.JavaAll.OOP;

/**
 * @author 简小
 * @create 2020-09-17 23:57
 */
public class Combine {
    public static void main(String[] args) {
        String name = "FBBA";
        Soccer soccer = new Soccer("SomeBody");
        SoccerPlayer soccerPlayer = new SoccerPlayer(name, soccer);
        System.out.println(soccerPlayer);
    }
}

// 组合
class SoccerPlayer {
    private String name;
    private Soccer soccer;

    public SoccerPlayer(String name, Soccer soccer) {
        this.name = name;
        this.soccer = soccer;
    }

    @Override
    public String toString() {
        return "Name is : " + this.name + " Soccer is : " + this.soccer;
    }
}

class Soccer {
    private String SoccerName;

    public Soccer(String SoccerName) {
        this.SoccerName = SoccerName;
    }

    @Override
    public String toString() {
        return "Soccer is : " + this.SoccerName;
    }
}
