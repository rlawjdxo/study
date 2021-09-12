//v0.1
import java.util.Scanner;

public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소스 : 1과 지기자신외에는 나누어 떨어지지 않는 수
       Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int cnt=0;

      for(int k=1; k<=number; k++){
         if(number % k ==0)
           cnt++;
  }

      if(cnt==2)
         System.out.println(number + "은(는) 소수!");
    else
      System.out.println(number + "은(는) 소수가 아닙니다!");
  }
}

//v0.2
import java.util.Scanner;

public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소스 : 1과 지기자신외에는 나누어 떨어지지 않는 수
       Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //int cnt = 0;
        boolean isPrime = true;

        for (int k = 2; k < number; k++) { //반복 횟수 2회감소
            if (number % k == 0)//입력된 수를 k로 나누었을 대 나머지가 0인 경우
                //cnt==; // cnt=cnt+1
                isPrime = false;
        }

       if (isPrime) // isPrime 변수값이 false 유지 되면 true
            System.out.println(number + "은(는) 소수!");
        else
            System.out.println(number + "은(는) 소수가 아닙니다!");
    }
  }

//v0.3
import java.util.Scanner;

public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소스 : 1과 지기자신외에는 나누어 떨어지지 않는 수
       Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

       boolean isPrime = true;

        for (int k = 2; k < number; k++) {
            if (number % k == 0) {

               isPrime = false;
                break;
            }

            System.out.println(k);
        }

       if (isPrime) // isPrime 변수값이 false 유지 되면 true
            System.out.println(number + "은(는) 소수!");
        else
            System.out.println(number + "은(는) 소수가 아닙니다!");
    }
  }


//v0.4
import java.util.Scanner;

public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소스 : 1과 지기자신외에는 나누어 떨어지지 않는 수
       Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

       boolean isPrime = true;

        int k = 2;
        while (k < number;) {
            if (number % k == 0) {

              isPrime = false;
                break;
            }

           //System.out.println(k);
           k++;
        }

       if (isPrime) // isPrime 변수값이 false 유지 되면 true
            System.out.println(number + "은(는) 소수!");
        else
            System.out.println(number + "은(는) 소수가 아닙니다!");
    }
  }

//v0.5
import java.util.Scanner;

public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소스 : 1과 지기자신외에는 나누어 떨어지지 않는 수
       Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

       boolean isPrime = true;

        int k = 2;
        while (k < number;) {
            if (number % k == 0) {

              isPrime = false;
                break;
            }

           //System.out.println(k);
           k++;
        }

      System.out.println(number + ( isPrime ?"은(는) 소수!" : "은(는) 소수가 아닙니다!");
       // if (isPrime) // isPrime 변수값이 false 유지 되면 true
            //System.out.println(number + "은(는) 소수!");
        //else
           // System.out.println(number + "은(는) 소수가 아닙니다!");
    }
  }