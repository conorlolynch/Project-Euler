
// Solving problem 1 on project euler

public class MultiplesThreeFive{
  public static void main(String[] args){
    System.out.println(sumMultiplesThreeFive(10));
  }

  public static int sumMultiplesThreeFive(int upperRange){
    int divisibleByThree = (upperRange-1)/3;
    int divisibleByFive = (upperRange-1)/5;
    int divisibleByFifteen = (upperRange-1)/15;

    int multiplesOfThree = (3 * (divisibleByThree) * (divisibleByThree + 1))/2;
    int multiplesOfFive = (5 * (divisibleByFive) * (divisibleByFive + 1))/2;
    int multiplesOfFifteen = (15 * (divisibleByFifteen) * (divisibleByFifteen + 1))/2;

    return (multiplesOfThree + multiplesOfFive - multiplesOfFifteen);
  }
}
