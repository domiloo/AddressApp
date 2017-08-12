package ch.makery.address.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Created by Dominik on 12.08.2017.
 */
public class DateUtil {
    private static final String DATE_PATTERN = "dd.MM.yyyy";

    private static final DateTimeFormatter DATE_FORMATER = DateTimeFormatter.ofPattern(DATE_PATTERN);

    public static String format(LocalDate date) {
        if (date == null) {
            return null;
        } else {
            return DATE_FORMATER.format(date);
        }

    }

    public static LocalDate parse(String dateString) {
        try {
            return DATE_FORMATER.parse(dateString, LocalDate::from);

        } catch (DateTimeParseException e){
            return null;
        }
    }

    public static boolean validDate(String dateString) {
        return DateUtil.parse(dateString) != null;
    }
}
