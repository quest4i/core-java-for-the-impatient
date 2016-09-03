import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created on 2016. 9. 1. 오후 10:39.
 *
 * @author quest4i
 */
public class TestDrive {

    public static void main(String[] args) {


        BigInteger n = BigInteger.valueOf(8765433432234L);
        BigInteger k = new BigInteger("9328934932432");
        BigInteger r = BigInteger.valueOf(5).multiply(n.add(k));

        System.out.println(r);

        System.out.println(2 - 1.1);
        System.out.println(BigDecimal.valueOf(2, 0).subtract(BigDecimal.valueOf(11, 1)));

        int n2 = 42;
        String str = Integer.toString(n2);
        System.out.println("String str : " + str);
        str = Integer.toString(n2, 2);
        System.out.println("String str : " + str);
        n2 = Integer.parseInt(str);
        System.out.println("String str : " + str);
        n2 = Integer.parseInt(str, 2);
        System.out.println("n2 : " + n2);


        str = "이것은 한글 문자열입니다.";
        char ch = str.charAt(5);
        System.out.println("char ch : " + ch);

        int codePoint = str.codePointAt(str.offsetByCodePoints(0, 5));
        System.out.println("codePoint : " + codePoint);
        int length = str.codePointCount(0, str.length());
        System.out.println("codepoint count: " + length);
        System.out.println("length() : " + str.length());
        str.codePoints().forEach(System.out::println);

        System.out.println();
        ArrayList<String> friends = new ArrayList<>(Arrays.asList("Peter", "Paul", "Mary"));
        Collections.sort(friends);
//        Collections.fill(friends, "");

        System.out.println(friends);

    }
}
