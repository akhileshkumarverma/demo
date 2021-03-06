package com.coveros.training.authentication.domainobjects;

public enum PasswordResultEnums {
    TOO_SHORT,
    TOO_LONG,  // ironic, I know.  But if it's too long we're open to DOS attacks.  It takes too long to process extremely long passwords.
    EMPTY_PASSWORD,
    INSUFFICIENT_ENTROPY, // as measured by a tool.  See implementation where this is used.
    SUCCESS,
    NULL // used to represent the initial state when initializing variables, so we don't have to use null.
}
