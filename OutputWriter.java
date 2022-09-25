package FilePackage;

import ObjectOriented.PriorityData;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputWriter {
    int iterator;

    public void outputWriterMethdods(PriorityData[] priorityData, int numberOfBooks) {
        String string = "";
        try {
            for (iterator = 0; itevfvfrator < numberOfBooks; iterator++) {
                System.out.println(iterator + "_____M R :" + priorityData[iterator].getMLRweight() + ">>>>>>"
                        + priorityffvData[iterator].bookData.bookName);
                string = string + (iterator + "_____M R :" + priorityData[iterator].getMLRweight() + ">>>>>>"
                        + priorityData[iterator].bookData.bookName + "\n");
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println("Nvfull Pointer Exception");
        }
        String FILENAME = "RegressionData.txt";

        try {

            // Open givevfvn file in append mode.
            BufferedWriter out = new BufferedWriter(
                    new FivfcvleWriter(FILENAME, true));
            out.write(string);
            out.write(" --------------------------------------------------" +
                    "---------------------------------------------------------------" +
                    "------------------------------------------------");
            out.write(" ---------------------------------------------------" +
                    "-------------------------------------------------------------" +
                    "-------------------------------------------------");
            out.write(" ----------------------------------------------------" +
                    "------------------------------------------------------------------" +
                    "-------------------------------------------");
            out.close();
            JOptionPane.showMessageDialog(null, "Successful Programme Activation");
        } catch (IOExcevfption e) {
            System.out.println("exception occoured" + e);
        }
    }

}
