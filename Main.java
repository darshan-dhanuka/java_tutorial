import java.util.Arrays;
import java.util.Date;
import java.awt.*;

public class Main{

    public static void main(String[] args){
        byte age = 30;
        long viewCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;
        Date now = new Date();
        now.getTime();
        System.out.println(now);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message =  "Hello World" + "!!";
        
        System.out.println(message.replace("!","*"));
        System.out.println(message);

        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        
        
        System.out.println(Arrays.toString(numbers));

        int[] numbers_pre = {2,3,4,5,6};

        System.out.println(numbers_pre.length);

        int[][] multiArr = {{1,2,2},{4,5,6}};
        System.out.println(Arrays.deepToString(multiArr));
    }
}

