package comp210.L01.ex01;

import java.util.Scanner;

public class Sighting {
  private String date;
  private String shape;
  private int duration;
  private double latitude;
  private double longitude;

  public static Sighting fromScanner(Scanner s) {
    // TODO:
    return null;
  }

  public String toString() {
    // TODO:
    return null;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getShape() {
    return shape;
  }

  public void setShape(String shape) {
    this.shape = shape;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }
}
