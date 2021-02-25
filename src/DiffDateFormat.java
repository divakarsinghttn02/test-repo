import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;



public class DiffDateFormat {
    public static void main(String[] args) {
        Date today = new Date();


        DateFormat d = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
        d.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = d.format(today);
        System.out.println("Date in Indian Timezone (IST) : " + IST);


        d.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String PST = d.format(today);
        System.out.println("Date in PST Timezone : " + PST);

    }

}

