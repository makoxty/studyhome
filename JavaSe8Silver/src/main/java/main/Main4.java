package main;

public class Main4 {

  public String main4() {
  StringBuilder sb = new StringBuilder();
  sb.append(true);
  sb.append(10);
  sb.append('a');
  sb.append("bcdef", 1, 3);

  char[] array = {'h', 'e', 'l', 'l', 'o'};
  sb.append(array);

  return sb.toString();
  }

}
