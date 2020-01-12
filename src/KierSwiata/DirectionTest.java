package KierSwiata;

public class DirectionTest {
    public static void main(String[] args) {
        System.out.println(Direction.NORTH.getNazwaPL());
        System.out.println(Direction.NORTH.getNazwaEN());
        System.out.println(Direction.NORTH.getShortName());

        System.out.println(Direction.NORTHandEAST.getNazwaPL());
        System.out.println(Direction.NORTHandEAST.getNazwaEN());
        System.out.println(Direction.NORTHandEAST.getShortName());
    }
}
