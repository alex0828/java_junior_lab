package com.example.demo.constant;

public class VerifyRegexConst {

    public static final String PATTERN_USER_SEQ = "^\\d+$";
    public static final String PATTERN_USER_CODE = "^\\w{5,30}$";
    public static final String PATTERN_PCODE = "^[A-F0-9]{256}$";
    public static final String PATTERN_ROLE = "^ROLE_[A-Z0-9]{1,30}$";
}
