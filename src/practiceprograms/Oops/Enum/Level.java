package practiceprograms.Oops.Enum;

/*
An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
To create an enum, use the enum keyword (instead of class or interface),
and separate the constants with a comma. Note that they should be in uppercase letters:
*/

public enum Level {

    LOW ,
    MEDIUM ,
    HIGH,
}
class Runnable
{
    public static void main(String[] args) {

        Level myobj = Level.LOW;
        Level myobj1 = Level.MEDIUM;
        Level myobj2 = Level.HIGH;

        System.out.println(myobj);
        System.out.println(myobj1);
        System.out.println(myobj2);
    }
}
