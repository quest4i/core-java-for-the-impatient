import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;

/**
 * Created on 2016. 9. 1. 오후 10:39.
 *
 * @author quest4i
 */
public class TestDrive {

    public static void main(String[] args) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();

        double x = 0.1;
        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));

        List<String> list = Collections.emptyList();

        System.out.println(list);

    }
}


