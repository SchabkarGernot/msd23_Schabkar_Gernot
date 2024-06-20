package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.error("Main function starts");
        Calculator calc = new Calculator();
        System.out.println("Gernot Schabkar");
        logger.info("end is near!");

    }
}
