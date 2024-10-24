package se.lexicon;
import java.util.Arrays;

public class NameRepository {
    private static String[] names = new String[0];

    public static int getSize() { // Will get the Total numbers of names
        return names.length;
    }


    public static void setNames(String[] newNames) {
        names = newNames;
    }


    public static void clear() {  // Cleans up everything and resets to 0
        names = new String[0];
    }


    public static String[] findAll() {
        return Arrays.copyOf(names, names.length);

    }
    public static String find(final String fullName){
        for (String name : names){
            if (name.equals(fullName)){
                return name;
            }
        }
        return null;
    }
    public static boolean add(final String fullName) {
        if (find(fullName) != null) {
            return false;
        }
        names = Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = fullName;
        return true;

        }
    public static String[] findByFirstName(final String firstName) {
        int count = 0;
        for (String name : names) {
            if (name.split(" ")[0].equalsIgnoreCase(firstName)) { // adds Everything before first blank space
                count++;
            }
        }
        String[] matches = new String[count];
        int index = 0;
        for (String name : names) {
            if (name.split(" ")[0].equalsIgnoreCase(firstName)) { // adds Everything before first blank space
                matches[index++] = name;  // Looking for matching names
            }
        }
        return matches;


    }
    public static String[] findByLastName(final String lastName) {
        int count = 0;
        for (String name : names) {
            String[] parts = name.split(" ", 2); // 2 is in case someone has a Space  in there Last name
            if (parts.length > 1 && parts[1].equalsIgnoreCase(lastName)) { // Looking for Blank space then adds the rest
                count++;
            }
        }
        String[] matches = new String[count];
        int index = 0;
        for (String name : names) {
            String[] parts = name.split(" ", 2 ); // 2 is in case someone has a Space  in there Last name
            if (parts.length > 1 && parts[1].equalsIgnoreCase(lastName)) { // Looking for Blank space then adds the rest
                matches[index++] = name;
            }
        }
        return matches;
    }
    public static boolean update(final String original, final String updatedName){
        if (find(updatedName) != null){ // Looking for if the new name already is in the system
            return false;
        }

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(original)) { //Looking for the original name in the array
                names[i] = updatedName; // Changes the name in the array
                return true;
            }

        }
        return false;

    }

}





