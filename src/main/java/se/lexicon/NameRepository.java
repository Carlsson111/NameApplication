package se.lexicon;
import java.util.Arrays;

public class NameRepository {
    private static String[] names = {};
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
        return names.clone();
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



    }
