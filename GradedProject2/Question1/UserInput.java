package GradedProject2.Question1;

import java.util.HashMap;
import java.util.Scanner;

class UserInput {
    static HashMap<Integer, Integer> getFloorPlan() {
        //take floor count input
        System.out.println("Enter the number of floors:");
        HashMap<Integer, Integer> FP = new HashMap<Integer, Integer>();
        Scanner uip = new Scanner(System.in);
        int floorCount = uip.nextInt();

        //take each floor size
        for (int counter=0;counter<floorCount;counter++) {
            int flr = counter+1;
            System.out.println("Enter the floor size given on day :"+flr);
            FP.put(flr,uip.nextInt());
        }

        //return full hashmap
        return FP;
    }
}