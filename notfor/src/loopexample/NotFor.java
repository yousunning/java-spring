package loopexample;

public class NotFor
{
   public static int sum(int num)
   {
      if (num == 0)
         return 0;
      else
         return num + sum(--num);
   }
   
   public static void main(String[] args)
   {
      // 재귀함수를 이용한 1부터 10까지의 합
      System.out.println("합: " + sum(10));
   }
}