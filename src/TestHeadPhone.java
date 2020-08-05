/*
* File: TestHeadPhone.java
* Author: John Kucera
* Date: February 20, 2019
* Purpose: This test class demonstrates the functions of the HeadPhone class.
*/

// import of necessary java classes
import java.awt.Color;

public class TestHeadPhone {
      public static void main(String[] args) {

            System.out.println("Headphone Set #1 (DEFAULT):\n");

            // Construct HeadPhone #1
            HeadPhone headPhone1 = new HeadPhone();
            System.out.println("getVolume(): " + headPhone1.getVolume());
            System.out.println("getPluggedIn(): " + headPhone1.getPluggedIn());
            System.out.println("getManufacturer(): " + headPhone1.getManufacturer());
            System.out.println("getHeadPhoneColor(): " + headPhone1.getHeadPhoneColor());
            System.out.println("getHeadPhoneModel(): " + headPhone1.getHeadPhoneModel());
            System.out.println("\n" + headPhone1.toString());
            headPhone1.changeVolume(3);
            System.out.println("\ngetVolume() after changeVolume(3): " + headPhone1.getVolume());

            System.out.println("\n\nHeadphone Set #2:\n");

            // Construct HeadPhone #2
            HeadPhone headPhone2 = new HeadPhone(1, true, "JVC", Color.RED, "Riptidz");
            System.out.println("getVolume(): " + headPhone2.getVolume());
            System.out.println("getPluggedIn(): " + headPhone2.getPluggedIn());
            System.out.println("getManufacturer(): " + headPhone2.getManufacturer());
            System.out.println("getHeadPhoneColor(): " + headPhone2.getHeadPhoneColor());
            System.out.println("getHeadPhoneModel(): " + headPhone2.getHeadPhoneModel());
            System.out.println("\n" + headPhone2.toString());
            headPhone2.changeVolume(2);
            System.out.println("\ngetVolume() after changeVolume(2): " + headPhone2.getVolume());

            System.out.println("\n\nHeadphone Set #3:\n");

            // Construct HeadPhone #3
            HeadPhone headPhone3 = new HeadPhone();
            headPhone3.setVolume(3);
            headPhone3.setPluggedIn(false);
            headPhone3.setManufacturer("Sony");
            headPhone3.setHeadPhoneColor(Color.BLUE);
            headPhone3.setHeadPhoneModel("BLK ZX");
            System.out.println("getVolume(): " + headPhone3.getVolume());
            System.out.println("getPluggedIn(): " + headPhone3.getPluggedIn());
            System.out.println("getManufacturer(): " + headPhone3.getManufacturer());
            System.out.println("getHeadPhoneColor(): " + headPhone3.getHeadPhoneColor());
            System.out.println("getHeadPhoneModel(): " + headPhone3.getHeadPhoneModel());
            System.out.println("\n" + headPhone3.toString());
            headPhone3.changeVolume(1);
            System.out.println("\ngetVolume() after changeVolume(1): " + headPhone3.getVolume());

      } // end of main method
} // end of class
