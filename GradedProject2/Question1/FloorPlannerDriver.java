package GradedProject2.Question1;

import java.util.HashMap;

//Driver class
public class FloorPlannerDriver {

    //Driver method
    public static void main(String args[]) {

        //declare HashMap and take input from user
        HashMap<Integer, Integer> FP= UserInput.getFloorPlan();
        int floorcounter = 0;

        //sort the input in descending order by value
        FP = MapSorter.SortMap(FP);

        //Print the final answer
        System.out.println("The order of construction is as follows:");
        try {
            for (int floor = 0; floor < FP.size(); floor++) {
                System.out.println("Day: " + (floor + 1));
                for (; (floor + 1) >= (int) FP.keySet().toArray()[floorcounter]; floorcounter++) {
                    System.out.print(FP.get((int) FP.keySet().toArray()[floorcounter]) + "  ");
                }
                System.out.println();
            }
        }

        //the exit condition is when the array index out of bounds is triggered, therefore we place a catch block to tackle this.
        catch (Exception e) {
            System.out.println("\nBuilding completed");
        }
    }
}


