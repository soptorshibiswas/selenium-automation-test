package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EmailBuilder {
	public static String build() {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        String email = "mail_"+timeStamp+"_id@qatest.com";
        return email;
    }
}
