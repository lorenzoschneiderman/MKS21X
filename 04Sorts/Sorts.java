public class Sorts{
  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
  public static String name(){
    return "10.Schneiderman.Lorenzo"; 
  }

  public static void main(String[] args) {
    int[] aNew = {2, 3, 4, 6, 8, 5, 7, 1};
    for (int i = 0; i < aNew.length; i++){
      System.out.println(aNew[i]);
    }
    System.out.println("break");
    selectionSort(aNew);
    for (int i = 0; i < aNew.length; i++){
      System.out.println(aNew[i]);
    }
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){

    int sfIndex, lowestSF, store;
    sfIndex = 0;
    for (int i = 0; i < data.length; i++){
      lowestSF = data[i];
      for (int j = i; j < data.length; j++){
        if (data[j] < lowestSF){
          lowestSF = data[j];
          sfIndex = j;
          }
        }
      store = data[i];
      data[i] = lowestSF;
      data[sfIndex] = store;
    }
  }
}

