package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
     String[] seasonsArray={"winter","spring","summer","autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
     int[] generateNumbers=new int[length];
     int x=1;
     for(int i=0;i<length;i++){
      generateNumbers[i]=x;
      x++;} 
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
     int x=0;
     int sum=0;
     for(int i=0;i<arr.length;i++){
      x=arr[i];
      sum+=x;}
     System.out.println(sum);
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
     int index=-1;
     for(int i=0;i<arr.length;i++){
      if(arr[i]==number){
       index=i;
       break;}   
     }
     System.out.println(index);
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
     String[] reverseArray=new String[arr.length];
     for(int i=0;i<arr.length;i++){
      reverseArray[i]=arr[arr.length-1-i];} 
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
     int x=0;
     for(int i=0;i<arr.length;i++){
      if(arr[i]>0){
       x++;}
     }
     int[] positive=new int[x];
     int j=0;
     for(int i=0;i<arr.length;i++){
      if(arr[i]>0){
       positive[j]=arr[i];
       j++;} 
     } 
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
     for(int i=0;i<arr.length;i++){
      int m=i;
      for(int j=i;j<arr.length;j++){
       if(arr[m].length>arr[j].length)
        m=j;}
      int[] t=arr[m];
      arr[m]=arr[i];
      arr[i]=t;
      for(int x=0;x<arr[i].length;x++){
       int z=x;
       for(int y=x;y<arr[i].length;y++){
        if(arr[i][z]>arr[i][y])
         z=y;}
       int temp=arr[i][z];
       arr[i][z]=arr[i][x];
       arr[i][x]=temp;}
      } 
    }
}
