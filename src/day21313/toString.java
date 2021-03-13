package day21313;

import java.util.Calendar;

public class toString {
    public static void main(String[] args) {

       Calendar cal = Calendar.getInstance();
       cal.set(2021,2,13);
       cal.add(Calendar.DATE,48);
       cal.add(Calendar.DATE,-7);
       cal.set(Calendar.DAY_OF_WEEK,5);
        System.out.println(cal.getTime());

    }
}
