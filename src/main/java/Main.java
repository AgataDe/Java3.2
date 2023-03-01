public class Main {
    public static void main(String[] args) {

        String[] sensitiveKeys = {"login", "password", "idNumber", "age"};
        Printer.printMapOfProperties(FileHandler.getMapOfProperties(), sensitiveKeys);
    }
}
