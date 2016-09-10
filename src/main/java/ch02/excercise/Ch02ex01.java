package ch02.excercise;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created on 2016. 9. 10. 오전 1:53.
 *
 * 1. 달력 출력 프로그램을 수정해서 일요일부터 한 주를 시작하게 하라.
 * 또한 끝에 줄 넘김을 한 번만 출력하게 만든다.
 *
 * @author samyeong-gu
 */
public class Ch02ex01 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now().withDayOfMonth(1);
        int  month = date.getMonthValue();
        if (args.length >= 2) {
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = LocalDate.of(year, month, 1);
        }


        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        DayOfWeek weekday = date.getDayOfWeek();
        DayOfWeek startDay = DayOfWeek.SUNDAY;
        while (startDay != weekday) {
            System.out.print("    ");
            startDay = startDay.plus(1);
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY)
                System.out.println();
        }
        if (date.getDayOfWeek() != DayOfWeek.SUNDAY)
            System.out.println();
    }
}
