package practiceprograms.Oops.Enum.Enumwithforeachloop;

public enum Level5 {

    HIGH ,
    LOW,
    MEDIUM,
}

class Runnable63 {

    public static void main(String[] args) {

        for (Level5 myarray : Level5.values()){
            System.out.println(myarray);
        }
    }
}
