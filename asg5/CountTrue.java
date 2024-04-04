public class CountTrue {
  public static int countTrue(boolean[] arr) {
    int count = 0;
    for (boolean element : arr) {
      if (element) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    boolean[] myArray = { true, false, false, true, true, false };
    boolean[] mySecondArray = {};
    int trueCount = countTrue(myArray);
    int secondTrueCount = countTrue(mySecondArray);
    System.out.println("Number of true elements in { true, false, false, true, true, false } : " + trueCount);
    System.out.println("Number of true elements in {} : " + secondTrueCount);
  }
}
