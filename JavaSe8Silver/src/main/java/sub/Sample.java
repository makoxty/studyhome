package sub;

public class Sample {

  private int num;
  private String name;
  private String value;

  public Sample(int num, String name) {
    this.num = num;
    this.name = name;
  }

  public Sample() {

  }

  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj instanceof Sample) {
      Sample s = (Sample) obj;
      return s.num == this.num;
    }
    return false;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public int method(int a, int b) {
    return a + b;
  }

}