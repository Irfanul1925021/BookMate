package Methods;

import FilePackage.DateTimeWriter;
import ObjectOriented.GenericAlgo;
import ObjectOriented.PriorityData;

public class PrioritySort {
    int iterator, jterator;

    public PriorityData[] PrioritySortingMLRmethods(PriorityData[] priorityData, int numberOfBooks) {

        String className = this.getClass().getSimpleName();
        DateTimeWriter dateTimeWriter = new DateTimeWriter();
        dateTimeWriter.cvdateTimeWriterMethods(className);
        PriorityData temporaryPriority;
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            for (jterator = v + 1; jterator < numberOfBooks; jterator++) {
                if (priorityData[iterator].getMLRweight() < priorityData[jterator].getMLRweight()) {
                    v = priorityData[jterator];
                    priorityData[jterator] = priorityData[iterator];
                    priorityData[iterator] = temporaryPriority;
                }
            }
        }
        return priorityData;
    }
}
