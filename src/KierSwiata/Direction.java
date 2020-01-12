package KierSwiata;

public enum Direction {
    NORTH("N","Północ","North"),
    NORTHandWEST("NW","Północny Zachód","North-West"),
    NORTHandEAST("NE","Północny Wschód", "North East"),
    SOUTH("S","Południe","South"),
    SOUTHandWEST("SW","Południowy Zachód", "Soutch West"),
    SOUTHandEAST("SE","Południowy Wschód"," Soutch East"),
    EAST("E","Wschód","EAST"),
    WEST("W","Zachów","WEST");

    private String shortName;
    private String nazwaPL;
    private String nazwaEN;

    Direction(String shortName, String nazwaPL, String nazwaEN) {
        this.shortName = shortName;
        this.nazwaPL = nazwaPL;
        this.nazwaEN = nazwaEN;
    }

    public String getShortName() {
        return shortName;
    }

    public String getNazwaPL() {
        return nazwaPL;
    }

    public String getNazwaEN() {
        return nazwaEN;
    }
}
