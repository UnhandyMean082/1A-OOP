// Run by calling the following command: java -cp target/classes uk.ac.cam.aa2743.Main [section number]
package uk.ac.cam.aa2743;

import uk.ac.cam.aa2743.Section4.Section4Run;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Specify a section to run.");
            return;
        }

        String sectionToRun = args[0];

        switch (sectionToRun) {
            case "4":
                Section4Run.run();
                break;
            case "7":
                Section7Run.run();
                break;
            // Add other cases for "5", "6", etc.
            default:
                System.out.println("Unknown section: " + sectionToRun);
        }
    }
}