package computation;

public class Calculator {

    public static void main(String[] args) {
        int x= 10;
        int y = 5;
        System.out.println("--------------------------");
        System.out.println("| Działania na " + x + "  i   "+ y + " |");
        System.out.println("--------------------------");
        System.out.println("DODAWANIE:  "+Computation.ADD.perform(x,y));
        System.out.println("MNOŻENIE: "+Computation.MULTIPLY.perform(x,y));
        System.out.println("DZIELENIE: "+Computation.DIVIDE.perform(x,y));
        System.out.println("ODEJMOWANIE: "+ Computation.SUBTRACT.perform(x,y));
    }
}
