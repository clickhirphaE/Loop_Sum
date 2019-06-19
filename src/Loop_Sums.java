

/*The following program should allow the users to input 10 integers
and output the total. Please finish it.*/
    import java.util.Scanner;
    public class Loop_Sums {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

            int num, total = 0;
              for(int i=0;i<10;i++) {
                  // Loop should start here
                  num = keyboard.nextInt();
                  total += num;
                  // Loop should end here
              }
            System.out.println("The total of all 10 numbers is " + total);

        }

    }

