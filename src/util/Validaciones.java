package util;

import java.util.regex.Pattern;

/**
 *
 * @author User-PC
 */
public class Validaciones {

    

    public boolean validarCURP(String curp) {
        String regex
                = "[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}"
                + "(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])"
                + "[HM]{1}"
                + "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)"
                + "[B-DF-HJ-NP-TV-Z]{3}"
                + "[0-9A-Z]{1}[0-9]{1}$";
        Pattern patron = Pattern.compile(regex);
        if (!patron.matcher(curp).matches()) {
            return false;
        } else {
            return true;
        }
    }

//    public static void main(String args[]) {
//        Validaciones valid = new Validaciones();
//        String curp = "barl980826hstms08".toUpperCase();
//        System.out.println(curp);
//        System.out.println(valid.validarCURP(curp));
//    }
}
