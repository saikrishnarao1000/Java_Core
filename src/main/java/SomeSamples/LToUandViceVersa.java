package SomeSamples;

public class LToUandViceVersa {
    public String ltouandViceVersa(String input){
        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            char currentChar = characters[i];
            if (Character.isUpperCase(currentChar)) {
                characters[i] = Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                characters[i] = Character.toUpperCase(currentChar);
            }
        }
        return new String(characters);
    }
}
