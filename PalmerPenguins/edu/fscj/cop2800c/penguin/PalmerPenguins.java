// PalmerPenguins.java
// D. Singletary
// 2/22/25
// Refactored Palmer Penguins analysis using object-oriented approach

package edu.fscj.cop2800c.penguin;

public class PalmerPenguins {
    public static void main(String[] args) {
        // Create an instance of SpeciesCounter
        SpeciesCounter counter = new SpeciesCounter();

        // Read species data
        counter.readSpeciesData();

        // Initialize species count
        counter.initializeSpeciesCount();

        // Check if data is empty
        if (counter.isDataEmpty()) {
            System.out.println("Error: The file is empty or could not be read.");
            return;
        }

        // Count species occurrences
        counter.countSpecies();

        // Print results
        counter.printSpeciesCount();
    }
}
