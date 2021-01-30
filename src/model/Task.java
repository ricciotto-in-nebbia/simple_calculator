package model;

public class Task {

  private double a;
  private double b;
  private Action action;

  public Task(double a, double b, Action action) {
    this.a = a;
    this.b = b;
    this.action = action;
  }

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  public Action getAction() {
    return action;
  }

  public void setAction(Action action) {
    this.action = action;
  }
}
