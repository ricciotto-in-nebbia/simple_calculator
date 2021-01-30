import Service.LineParserService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.Task;

public class CalculatorApp {

  public static void main(String[] args) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    try {
      String inputLine = bufferedReader.readLine();
      LineParserService lineParserService = new LineParserService();
      Task task = lineParserService.parseLine(inputLine);
      double result = doWork(task);
      System.out.println(result);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static double doWork(Task task) {
    double result;
    switch (task.getAction()) {
      case ADDITION:
        result = addition(task.getA(), task.getB());
        break;
      case SUBTRACTION:
        result = subtraction(task.getA(), task.getB());
        break;
      case DIVISION:
        result = division(task.getA(), task.getB());
        break;
      case MULTIPLICATION:
        result = multiplication(task.getA(), task.getB());
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + task.getAction());
    }
    return result;
  }

  /**
   * Cложение.
   */
  public static double addition(double a, double b) {
    return a + b;
  }

  /**
   * Вычетание.
   */
  public static double subtraction(double a, double b) {
    return a - b;
  }

  /**
   * Деление.
   */
  public static double division(double a, double b) {
    return a / b;
  }

  /**
   * Умножение.
   */
  public static double multiplication(double a, double b) {
    return a * b;
  }

}