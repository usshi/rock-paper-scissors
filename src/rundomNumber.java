import java.util.Random;

public class rundomNumber {
    static final String GU = "グー";
    static final String CHOKI = "チョキ";
    static final String PA = "パー";
  public static void main(String[] args) {

    String[] hands = {GU, CHOKI, PA};

    for (int i = 1; i < 2; i++) {
      //playerをオブジェクトにする
      Random r = new Random();
      String player1 = hands[r.nextInt(3)];
      String player2 = hands[r.nextInt(3)];
      String player3 = hands[r.nextInt(3)];

      System.out.println(i + "回目の勝負です");
      System.out.println("player1とplayer2でじゃんけんをします。");
      System.out.println("player1の手" + player1);
      System.out.println("player2の手" + player2);


      //プレイヤーの人数をnにする
      //n人の名前はhtml(コンソールから入力でも可)

      //じゃんけんクラスを作る
      if (player1.equals(GU) && player2.equals(CHOKI)){
        System.out.println("player1のかちー");
      } else if (player1.equals(CHOKI) && player2.equals(PA)) {
        System.out.println("player1のかちー");
      } else if (player1.equals(PA) && player2.equals(GU)) {
        System.out.println("player1のかちー");
      } else if (player1.equals(player2)) {
        System.out.println("ひきわけ");
      } else {
        System.out.println("player2のかちー");
      }
    }
  }
}
