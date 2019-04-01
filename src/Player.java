import java.util.Random;

public class Player {
  static final String GU = "グー";
  static final String CHOKI = "チョキ";
  static final String PA = "パー";

  int memberId;
  String hand;

  public static void create (int memberId) {
    String[] hands = {GU, CHOKI, PA};
    Random r = new Random();
    Player player = new Player();
    player.memberId = memberId;
    player.hand = hands[r.nextInt(3)];
    System.out.println("player" + player.memberId + "が作成されました");
    System.out.println("player" + player.memberId + "のhandは" + player.hand);
  }
}
