package enums;

public enum Formatter {
    CALM {
        public String format(String message) {
            return " Wiadomośc" + message;
        }

    },

    NERVOUS {
        public String format(String message) {
            return " STOP!!! UWAGA!!! Wiadomość: " + message + " !!!";

        }

    };
    public abstract String format(String message);
}
