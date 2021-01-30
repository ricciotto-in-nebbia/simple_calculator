package Service;

import model.Action;
import model.Task;

public class LineParserService {

  public Task parseLine(String line) {
    String[] split = line.split(" ");

    double a = Double.parseDouble(split[0]);
    double b = Double.parseDouble(split[2]);
    Action action;

    switch (split[1]) {
      case "+":
        action = Action.ADDITION;
        break;
      case "-":
        action = Action.SUBTRACTION;
        break;
      case "/":
        action = Action.DIVISION;
        break;
      case "*":
        action = Action.MULTIPLICATION;
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + split[1]);
    }

    return new Task(a, b, action);
  }

}
