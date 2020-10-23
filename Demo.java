public class Demo{
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for (int j = i; j <= n; j++){
      System.out.print(i);
    }
    System.out.println();
    }
  }
  public static String arrToString(int[] arr){
    String stringer = "{";
    if (arr.length == 0){return "{}";}
    for (int i = 0; i < arr.length - 1; i++){
      stringer = stringer + arr[i] + ", ";
    }
    return stringer + arr[arr.length - 1] + "}";
  }
  public static String arrayDeepToString(int[][]arr){
  String outcome = "{";
  for(int i = 0; i < arr.length; i++){
    outcome = outcome + arrToString(arr[i]);
  }
   return outcome + "}";
  }
  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] array = new int [rows][cols];
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        array[i][j] = (int)(Math.round(Math.random() * maxValue));
      }
    }
    return array;
  }
  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][]array = new int [rows][];
    for(int i = 0; i < rows; i++){
      int c = (int)(Math.round(Math.random() * maxValue));
      array[i] = new int[c];
      for(int j = 0; j < c; j++){
        array[i][j] = (int)(Math.round(Math.random() * maxValue));
      }
    }
    return array;
  }
  public static void main(String[]args){
   if(args.length == 0){printLoop(5);}
    else {
      int input = Integer.parseInt(args[0]);
     printLoop(input);
     // tests for new methods
     //System.out.println(arrayDeepToString(create2DArray(3,4,4)));
     //System.out.println(arrayDeepToString(create2DArrayRandomized(3,4,5)));
  }
  }
  }
