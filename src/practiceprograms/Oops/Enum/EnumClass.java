package practiceprograms.Oops.Enum;

public class EnumClass {

    public enum Level1 {

        LOW,
        Small,
        HIGH,
    }


    public static void main(String[] args) {

        Level1 levelobj = Level1.HIGH;
        Level1 levelobj1 = Level1.LOW;
        Level1 levelobj2 = Level1.Small;

        System.out.println(levelobj1);
        System.out.println(levelobj2);
        System.out.println(levelobj);

    }
}

