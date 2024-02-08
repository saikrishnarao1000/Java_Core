package LamdaFunctions;

public class StringToIntegerConverter {
    public int convertAndPrint(String input) {
        try {
            int result = convertStringToInt(input);
            System.out.println("Conversion successful: " + result);
            return result;
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        return 0;
    }

    public int convertStringToInt(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }
}
