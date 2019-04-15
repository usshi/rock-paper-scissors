import java.util.Random;

public class Player {
  static final String GU = "グー";
  static final String CHOKI = "チョキ";
  static final String PA = "パー";
  static final String[] hands = {GU, CHOKI, PA};

  int memberId;
  String hand;

  public static Player createMemberId (int memberId) {
    Player player = new Player();
    player.memberId = memberId;
    System.out.println("player" + player.memberId + "が作成されました");
    return player;
  }
}
