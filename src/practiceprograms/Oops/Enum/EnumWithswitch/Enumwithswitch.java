package practiceprograms.Oops.Enum.EnumWithswitch;

public enum Enumwithswitch {

    RED,
    GREEN,
    BLUE,

}

class Runnable {

    public static void main(String[] args) {

        Enumwithswitch enobj1 = Enumwithswitch.RED;
        Enumwithswitch enobj2 = Enumwithswitch.GREEN;
        Enumwithswitch enobj3 = Enumwithswitch.BLUE;

        switch (enobj1){
            case RED :
                System.out.println("The color is RED");
                break;

            case GREEN:
                System.out.println("The color is GREEN");
                break;
            case BLUE :
                System.out.println("The color is BLUE");
                break;
            default:
                System.out.println("End the program");
                break;

        }


    }
}
