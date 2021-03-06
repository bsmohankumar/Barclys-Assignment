package com.barclays.baggage.util;

import static java.lang.String.format;

/**
* Created on 05/05/2018
* Assertions.java
*
* @author Mohan Kumar BS
*/


public final class Assertions
{
    private Assertions(){
        // do nothing
    }

    public static <T> T checkNotNull( T reference, String errorMessageTemplate, Object... errorMessageArgs ) {
        if ( reference == null ) {
            // If either of these parameters is null, the right thing happens anyway
            throw new NullPointerException( format( errorMessageTemplate, errorMessageArgs ) );
        }
        return reference;
    }
}
