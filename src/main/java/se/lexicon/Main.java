package se.lexicon;

import java.util.Arrays;

import static se.lexicon.NameRepository.*;

public class Main {
    public static void main(String[] args) {
        setNames(new String[]{"Eric Svensson", "Jane Smith", "Eric Ericsson", "Harold Ericsson"});
        System.out.println("Number of elements in the array: " + getSize());

        System.out.println("All names: " + String.join(", ", findAll()));

        System.out.println("Find 'Eric Svensson': " + find("Eric Svensson"));
        System.out.println("Find 'Alice Johnson': " + find("Alice Johnson"));

        System.out.println("Add 'Alice Johnson': " + add("Alice Johnson"));
        System.out.println("Add 'John Doe' again: " + add("John Doe"));
        System.out.println("Add 'John Doe' again: " + add("John Doe"));


        System.out.println("All names after additions: " + String.join(", ", findAll()));

        String[] results = findByFirstName("Eric");
        System.out.println("Names with first name 'Eric': " + Arrays.toString(results));

        clear();
        System.out.println("Number of elements after clearing: " + getSize());

    }
}



