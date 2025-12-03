package uk.ac.cam.aa2743.Section7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileSorter {

    // AI used for file reading
    public static List<Pair> readPairsFromFile(String filename) {
        List<Pair> pairs = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) {
                    continue;
                }
                String[] parts = line.split(",", 2);
                if (parts.length != 2) {
                    System.err.println("Skipping malformed line (expected 2 parts): " + line);
                    continue;
                }
                try {
                    int num1 = Integer.parseInt(parts[0].trim());
                    int num2 = Integer.parseInt(parts[1].trim());
                    pairs.add(new Pair(num1, num2));
                } catch (NumberFormatException e) {
                    System.err.println("Skipping malformed line (invalid number format): " + line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading file: " + filename, e);
        }
        return pairs;
    }

    public static void run() {
        List<Pair> pairs = readPairsFromFile("numPairs.txt");
        Collections.sort(pairs);

        for (Pair pair : pairs) {
            System.out.println(pair.getString());
        }
    }
}

class Pair implements Comparable<Pair> {
    int c1;
    int c2;

    public Pair(int c1, int c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compareTo(Pair other) {
        int first = Integer.compare(this.c1, other.c1);
        if (first != 0) {
            return first;
        } else {
            return Integer.compare(this.c2, other.c2);
        }
    }

    public String getString() {
        return c1 + ", " + c2;
    }
}