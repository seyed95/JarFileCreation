import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileValidator {


    Pattern pat;
    Boolean validity = false;

    public boolean validateMobile(String mobile) {
        if (mobile != null) {
            pat = Pattern.compile("(0/91)?[7-9][0-9]{9}");
            Matcher m = pat.matcher(mobile);
            validity = (m.find() && m.group().equals(mobile));
        }
        return validity;

    }


}
