import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSample {
  public static void main(String[] args){
    List<String> hand = new ArrayList<String>();
    hand.add("oyayubi");
    hand.add("hitosashiyubi");
    hand.add("nakayubi");
    hand.set(0, "kusuriyubi");
    hand.set(1, "nakayubi");
    hand.add(0, "koyubi");
    hand.add(4, "magoyubi");
    hand.remove(4);

    for (String yubi: hand){
      System.out.println(yubi);
    }
  }
}
