package ss19_String_Relugar.thuc_hanh.Validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static Pattern pattern ;
    private Matcher matcher ;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public ValidateAccount(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}


