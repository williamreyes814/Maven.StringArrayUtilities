package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {


    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }


    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array [array.length -1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {


        return array [array.length -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
    boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if( array[i].equals(value)){
                result = true;}
        }
        return result;

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int count = 0;
        String[] answer = new String[array.length];
        for (int i = array.length - 1 ; i >= 0; i--){
            answer[count] = array[i];
            count++;



        }
        return answer;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int j = array.length - 1;
        for (int i = 0; i <array.length ; i++) {

            if(!array[i].equals(array[j])){

               return false;
            }
            j--;
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        for(int i = 0; i < array.length; i++);
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(String thisString : array){

            if(value.equals(thisString)) counter++;
        }
        
        
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        //String[] str_array = {valueToRemove};

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));// Creating an array list since we cannot
                                                                            //  change the size of a regular array. We also copied the content of old array to the new array list
        list.remove(valueToRemove);//Here we are removing the value that the problem wants removed
        String[] newArray = new String[list.size()];//Now we are making a new String array and making it the size of the array list without the value that was removed
        newArray = list.toArray(newArray);// Here we are now copying the the content of the array list to new String array

        return newArray;// return new String array
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> nondups = new ArrayList<>();
        nondups.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if(!array[i].equals(array[i-1])) nondups.add(array[i]);

        }
        String[] stringArray = nondups.toArray(new String[nondups.size()]);

        return stringArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        for(int i = 1; i<array.length; i++){

            if(array[i] == array[i-1]){


            }

        }
        return null;
    }


}
