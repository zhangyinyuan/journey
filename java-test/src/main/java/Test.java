import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        String createTime = "2019-02-25";
        Calendar calendar = Calendar.getInstance();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
            calendar.setTime(simpleDateFormat.parse(createTime));
            calendar.add(Calendar.DATE, -1);
            createTime = simpleDateFormat.format(calendar.getTime());
            System.out.println(createTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
