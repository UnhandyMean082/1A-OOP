package uk.ac.cam.aa2743.Section4;

public class Section4Run {
    public static void run() {
        System.out.println("--- Running Section 4 Code ---\n");

        DefaultAccess.get();
        System.out.println();

        ConsChain.create();
        System.out.println();

        TestShadowing.test();
        System.out.println();

        OOPSortedLinkedList sorted = new OOPSortedLinkedList();
        for (int i : new int[] {5, 3, 1, 2, 4}) {
            sorted.addElement(i);
        }
        StringBuilder out = new StringBuilder();
        while (sorted.getLength() != 0) {
            out.append(sorted.removeFromHead()).append(", ");
        }
        System.out.println("Sorted test: " + out.substring(0, out.length() - 2) + "\n");

        OOPLazySortedLinkedList lazySorted = new OOPLazySortedLinkedList();
        for (int i : new int[] {5, 3, 1, 2, 4}) {
            lazySorted.addToHead(i);
        }
        out = new StringBuilder();
        while (lazySorted.getLength() != 0) {
            out.append(lazySorted.removeFromHead()).append(", ");
        }
        System.out.println("Lazy sorted test: " + out.substring(0, out.length() - 2) + "\n");
    }
}
