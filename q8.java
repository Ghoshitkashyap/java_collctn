import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class q8 {
    public static void main(String[] args) {
        Date date =new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mmm-yyyy");
        String StringDate=dateFormat.format(date);
        System.out.println("today date and time \"30-may-2021\"");
        System.out.println("\n\t"+StringDate);

    }
}
