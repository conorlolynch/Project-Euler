
// solving problem 2 on project euler

// Solution Explanation: Even numbers in the fibonacci series are every 3rd term:  1,1, 2 ,3,5, 8 ...
// We find every index in the series thats a multiple of three that is less than the number range and we add it to the sum of even numbers already kept

public class EvenFibonacciNums{
  public static void main(String[] args){
    System.out.println(sumEvenFibonacciNums(10000));
  }

  public static int sumEvenFibonacciNums(int upperNumber){
    int sum = 0;
    boolean ended = false;
    int n = 2;

    while (!ended){
      int currentEven = findFibonnaciNumber(n);
      if (currentEven >= upperNumber){
        return sum;
      }
      else{
        sum += currentEven;
      }
      n += 3;
    }
    return sum;

  }

  // This method will return the Nth fibonacci number
  public static int findFibonnaciNumber(int numberIndex){
    double a = (1+Math.sqrt(5))/2;
    double b = (1-Math.sqrt(5))/2;
    double aP = Math.pow(a, numberIndex + 1);
    double bP = Math.pow(b, numberIndex + 1);
    return ((int)((1/Math.sqrt(5)) * (aP - bP)));
  }
}
