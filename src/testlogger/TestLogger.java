/*
 * Copyright (c)2014
 */

package testlogger;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Va Y.
 */
public class TestLogger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
        Logger logger = Logger.getLogger(TestLogger.class.getName());
        
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        //logger.addHandler(new ConsoleHandler());
        logger.setLevel(Level.INFO);
        
        
        
        logger.log(Level.INFO, "Log 1");
        logger.log(Level.INFO, "Log 2");
        logger.log(Level.INFO, "Log 3");
        }
        catch (Exception ex)
                {}
        
    }
    
}
