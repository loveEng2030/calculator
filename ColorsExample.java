public class ColorsExample {
    // أكواد الألوان
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        System.out.println(RED + "النص ده لونه أحمر" + RESET);
        System.out.println(GREEN + "النص ده لونه أخضر" + RESET);
        System.out.println(BLUE + "النص ده لونه أزرق" + RESET);
        System.out.println(YELLOW + "النص ده لونه أصفر" + RESET);
        System.out.println(PURPLE + "النص ده لونه بنفسجي" + RESET);
        System.out.println(CYAN + "النص ده لونه سماوي" + RESET);
    }
}
