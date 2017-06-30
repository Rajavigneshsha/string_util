package com.discernnetwork.jenkins_stringutil.util;

public class StringUtil {

    public static boolean isValidString(String stringValue) {
        boolean isValid = false;
        if ((stringValue != null) && (!(stringValue.trim().isEmpty())) && (!("null".equalsIgnoreCase(stringValue)))) {
            isValid = true;
        }
        return isValid;
    }

}
