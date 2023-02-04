import java.lang.reflect.Array;
import java.util.Arrays;

public class varArgs {

  public static void main(String[] args) {
    vArgs(1, 2, 3, 4, 5, 5);
  }

  static void vArgs(int... space) {
    System.out.println(Arrays.toString(space));
  }
}
