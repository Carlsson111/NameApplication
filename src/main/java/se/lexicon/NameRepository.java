package se.lexicon;
import java.util.Arrays;

public class NameRepository {
    private static String[] names = new String[0];

    public static int getSize() {
        return names.length;
    }


    public static void setNames(String[] newNames) {
        names = newNames;
    }


    public static void clear() {
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
            if (name.split(" ")[0].equalsIgnoreCase(firstName)) {
                count++;
            }
        }
        String[] matches = new String[count];
        int index = 0;
        for (String name : names) {
            if (name.split(" ")[0].equalsIgnoreCase(firstName)) {
                matches[index++] = name;
            }
        }
        return matches;


    }
    public static String[] findByLastName(final String lastName) {
        int count = 0;
        for (String name : names) {
            String[] parts = name.split(" ");
            if (parts.length > 1 && parts[1].equalsIgnoreCase(lastName)) {
                count++;
            }
        }
        String[] matches = new String[count];
        int index = 0;
        for (String name : names) {
            String[] parts = name.split(" ");
            if (parts.length > 1 && parts[1].equalsIgnoreCase(lastName)) {
                matches[index++] = name;
            }
        }
        return matches;
    }

}





