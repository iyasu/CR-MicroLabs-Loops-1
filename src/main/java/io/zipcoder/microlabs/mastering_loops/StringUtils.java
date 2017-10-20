package io.zipcoder.microlabs.mastering_loops;

/**
 * Created by iyasuwatts on 10/20/17.
 */
public class StringUtils {
        public static String padLeft(String s, int n) {
            return String.format("%1$" + n + "s", s);
        }
}
