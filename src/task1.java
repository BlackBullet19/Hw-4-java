public class task1 {
    /*Implement the method that takes int[][] array and row index and checks
     if the average of the elements in the row is greater than 0*/
  public static void main(String[] args) {
        int[][] array = new int[][]{ // declaring array
                {0, 0, 0, 0, 0},
                {6, 7, 8, 9, 10},
                {6, 7, 8, 9, 10, 3, 4, 6}
        };
        int rowIndex=1; // declaring row number
        //rowSum(array, rowIndex);
        rowAverage(rowSum(array, rowIndex), array,rowIndex); // calling for both methods
    }
    public static long rowSum(int[][] array, int rowIndex){ // this method gives sum from all numbers from chosen row
        long rowSum=0;
        if(rowIndex< array.length && rowIndex>=0){ // here im checking if the index number fits array
            for (int i = 0; i < array[rowIndex].length; i++) { // loop to sum numbers from chosen row
                rowSum=rowSum+array[rowIndex][i];
            }
        } else {
            System.out.println("Invalid row index!"); // if index number isn't right, system will tell it
        }

        return rowSum;
    }
    public static void rowAverage(long rowSum,int[][] array, int rowIndex){ // method checks if average from sum of numbers
      // in chosen row is greater than 0 and prints the answer
      if(rowSum/array[rowIndex].length!=0){
          System.out.println("Average of the elements in the row " +rowIndex+" is greater than 0");
      } else {
          System.out.println("Average of the elements in the row " +rowIndex+" is 0");
      }
    }
}
