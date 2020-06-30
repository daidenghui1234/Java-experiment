package 一.实验2;

public class TwoThreadGuessNumber {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Number number = new Number();
      number.giveNumberThread.start();
      number.guessNumberThread.start();
   }

}
