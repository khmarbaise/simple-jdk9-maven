package com.corporate.project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main
{
    private static Logger sysLog = LogManager.getLogger(Main.class);
    public static void main( String[] args )
    {
        System.out.println( "Main one from Java 9" );
        if ( args.length > 0 )
        {
            for ( String arg : args )
            {
                System.out.println( " Arg: '" + arg + "'" );
            }
        }
    }
}
