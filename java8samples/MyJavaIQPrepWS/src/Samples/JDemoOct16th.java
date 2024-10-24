package Samples;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class JDemoOct16th {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myResults = new ArrayList<ArrayList<Integer>>();
        int a = 10;
        int b = 100;
        ArrayList<Integer> currList2 = new ArrayList<>();
        currList2.add(a);
        currList2.add(b);
        myResults.add(currList2);

        currList2.clear();
        currList2.add(a);
        currList2.add(b);
        myResults.add(currList2);
        //System.out.println(myResults);

        int[] arr = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        int counter = arr.length;
        ArrayList<ArrayList<Integer>> resultsArr = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> currList = new ArrayList<Integer>();
        //System.out.println("input arr length is ==> "+counter);
        Set<Integer> myUniqList = new HashSet<>();
        for (int currElem : arr) {
            myUniqList.add(currElem);
        }
        System.out.println("printing set ==> "+myUniqList);
        for (int currElem : myUniqList) {
            for (int innerCurrElem : arr) {
                if ((innerCurrElem != currElem) && (innerCurrElem + currElem == 0)) {
                    System.out.println("comparing => " + innerCurrElem + " and " + currElem);
                    currList.clear();
                    currList.add(innerCurrElem);
                    currList.add(currElem);
                    System.out.println("before adding to result List ==> " + currList + ", already present ??? " + (resultsArr.contains(currList)));
                    //Collections.sort(currList);
                    //resultsArr.removeAll(currList);
//                    if () {
                    for(ArrayList<Integer> currResultsArr : resultsArr){
                        if(currResultsArr.contains(currList)){
                            break;
                        }
                    }
                    System.out.println("adding to results list ==> " + currList);
                    resultsArr.add(currList);
//                    }
                }
            }
        }
        for (ArrayList<Integer> x : resultsArr) {
            System.out.println("results ==> " + x);
        }

    }
}
