package com.opstty;

import com.opstty.job.WordCount;
import org.apache.hadoop.util.ProgramDriver;
import com.opstty.job.DDistricts;
import com.opstty.job.MaxHeightSpecies;
import com.opstty.job.TreeSpecies;
import com.opstty.job.TreeSpeciesCount;
import com.opstty.job.TreesSortedByHeight;


public class AppDriver {
    public static void main(String argv[]) {
        int exitCode = -1;
        ProgramDriver programDriver = new ProgramDriver();

        try {
            programDriver.addClass("wordcount", WordCount.class,
                    "A map/reduce program that counts the words in the input files.");

            programDriver.addClass("distinctDistricts", DDistricts.class,
                    "A map/reduce program that returns the distinct districts with trees in the Remarkable Trees of Paris dataset.");

            programDriver.addClass("treeSpecies", TreeSpecies.class,
                    "A map/reduce program that returns the distinct tree species in the Remarkable Trees of Paris dataset.");

            programDriver.addClass("treeSpeciesCount", TreeSpeciesCount.class,
                    "A map/reduce program that returns the distinct tree species (and the number of trees for each one) in the Remarkable Trees of Paris dataset.");

            programDriver.addClass("maxHeightSpecies", MaxHeightSpecies.class,
                    "A map/reduce program that returns the highest height of trees per species in the Remarkable Trees of Paris dataset.");

            programDriver.addClass("treesSortedByHeight", TreesSortedByHeight.class,
                    "A map/reduce program that returns all the trees in the Remarkable Trees of Paris dataset, sorted by height.");

            exitCode = programDriver.run(argv);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.exit(exitCode);
    }
}
