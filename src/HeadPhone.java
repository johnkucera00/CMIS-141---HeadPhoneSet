/*
* File: HeadPhone.java
* Author: John Kucera
* Date: February 20, 2019
* Purpose: This simple class allows the user to create an object
* that holds information about a headphone set. The methods will allow
* the user to get and set data in the fields concerning information like
* volume and model traits.
*/

// importing necessary java classes
import java.awt.Color;

public class HeadPhone {

      // Assigning constants
      static final int LOW = 1;
      static final int MEDIUM = 2;
      static final int HIGH = 3;

      // Instance field definitions
      private int volume = MEDIUM;
      private boolean pluggedIn = false;
      private String manufacturer;
      private Color headPhoneColor;
      private String headPhoneModel;

      // No-argument constructor method
      public HeadPhone() {
            volume = MEDIUM;
            pluggedIn = false;
            manufacturer = "Sennheiser";
            headPhoneColor = Color.BLACK;
            headPhoneModel = "HD 300";
      } // end of method

      // Constructor method
      public HeadPhone(int volume, boolean pluggedIn, String manufacturer, Color headPhoneColor, String headPhoneModel) {
            this.volume = volume;
            this.pluggedIn = pluggedIn;
            this.manufacturer = manufacturer;
            this.headPhoneColor = headPhoneColor;
            this.headPhoneModel = headPhoneModel;
      } // end of method

      // Setter methods
      public void setVolume(int volume) {
            this.volume = volume;
      } // end of method

      public void setPluggedIn(boolean pluggedIn) {
            this.pluggedIn = pluggedIn;
      } // end of method

      public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
      } // end of method

      public void setHeadPhoneColor(Color headPhoneColor) {
            this.headPhoneColor = headPhoneColor;
      } // end of method

      public void setHeadPhoneModel(String headPhoneModel) {
            this.headPhoneModel = headPhoneModel;
      } // end of method

      // Getter methods
      public int getVolume() {
            return volume;
      } // end of method

      public boolean getPluggedIn() {
            return pluggedIn;
      } // end of method

      public String getManufacturer() {
            return manufacturer;
      } // end of method

      public Color getHeadPhoneColor() {
            return headPhoneColor;
      } // end of method

      public String getHeadPhoneModel() {
            return headPhoneModel;
      } // end of method

      // toString() method
      public String toString() {
            return "toString(): [volume=" + String.valueOf(volume)
            + ", pluggedIn=" + String.valueOf(pluggedIn) + ", manufacturer="
            + String.valueOf(manufacturer) + ", headPhoneColor="
            + String.valueOf(headPhoneColor) + ", headPhoneModel="
            + String.valueOf(headPhoneModel) + "]";
      } // end of method

      // changeVolume() method
      public void changeVolume(int volume) {
            setVolume(volume);
      } // end of method
} // end of class
