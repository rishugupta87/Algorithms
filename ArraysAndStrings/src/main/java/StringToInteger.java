import org.apache.commons.lang.StringUtils;

/**
 * Created by rg029761 on 10/7/16.
 */
public class StringToInteger {

    public static int convert(final String s) {

        if(StringUtils.isBlank(s)) { //handles null, empty,spaces
            throw new NumberFormatException("Invalid input string:" + s);
        }

        int sign = s.charAt(0) == '-' ? -1:1;
        int i = sign == -1 ? 1:0;

        double res = 0;
        while(i < s.length()) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                res = res*10 + Character.getNumericValue(c);
            } else {
                throw new NumberFormatException("Invalid inoput string" + s);
            }
            i++;
        }

        return (int) res * sign;
    }
}
