import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandamNumber {
    static final String GU = "グー";
    static final String CHOKI = "チョキ";
    static final String PA = "パー";
    static final String[] hands = {GU, CHOKI, PA};
    static int i = 1;
    static boolean isDraw = true;


  public static void main(String[] args) {

    List<Player> playerList = new ArrayList<Player>();
    for (int i = 1; i < 11; i++) {
      playerList.add(Player.createMemberId(i));
    }
    while (isDraw) {
      jyanken(playerList);
    }

    for (Player player : playerList) {
      System.out.println("player" + player.memberId + "の手は" + player.hand);
    }
  }

  private static void jyanken(List<Player> playerList) {
    int guCount = 0;
    int paCount = 0;
    int chokiCount = 0;

    System.out.println(i + "回目の勝負です。");
    i ++;
    for (Player player : playerList) {
      Random r = new Random();
      player.hand = hands[r.nextInt(3)];
      if (player.hand.equals(GU)) {
        guCount++;
      } else if (player.hand.equals(CHOKI)) {
        chokiCount++;
      } else if (player.hand.equals(PA)) {
        paCount++;
      }
      System.out.println("player" + player.memberId + "の手は" + player.hand);
    }

    if (guCount > 0 && chokiCount > 0 && paCount > 0) {
      System.out.println("引き分け");
    } else if (guCount == playerList.size() || chokiCount == playerList.size() || paCount == playerList.size()) {
      System.out.println("引き分け");
    } else if (paCount == 0) {
      System.out.println(GU + "のかちー");
      isDraw = false;
    } else if (guCount == 0) {
      System.out.println(CHOKI + "のかちー");
      isDraw = false;
    } else if (chokiCount == 0) {
      System.out.println(PA + "のかちー");
      isDraw = false;
    }
  }
}
