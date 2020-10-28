

import java.awt.*;
import java.util.Date;

public class Learning {

    public static void main(String[] args) {
	   int age = 30;
	   int herAge = age + 23;
	   int viewCount = 123_456_789; //can add underscores to act as commas
	   long likes = 3_123_456_789L; //add the L or get error
        float price = 10.99F; //add F for in float
        char letter = 'A';//one char gets single quotes
        String phrase = "Hello friend";
        Date now = new Date();
        System.out.println(now);


	   System.out.println(age);
	   System.out.println(herAge);

	   byte x = 1;//primitive so y and x are diffrent. changing x does not affect y
	   byte y = x;
	   x =2;

        Point point1 = new Point(1,1); //here we have point stored at the address of the reference
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        System.out.println(y);
    }
}
