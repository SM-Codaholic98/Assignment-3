import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

class Calendar{
    Scanner sc = new Scanner(System.in);
    int m, d, y;
    void GetDay(){
        System.out.print("Enter Month : ");
        m = sc.nextInt();
        System.out.print("Enter Day : ");
        d = sc.nextInt();
        System.out.print("Enter Year : ");
        y = sc.nextInt();
        LocalDate date = LocalDate.of(y, m, d);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek.toString().toUpperCase());
    }
}
public class Qs_05 {
    public static void main(String[] args) {
        Calendar cal = new Calendar();
        cal.GetDay();
    }
}