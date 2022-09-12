package Othello;

import java.util.Scanner;

public class Othello {
    public static void main(String[] args) {

        Board.initialize();
        Board.showBoard();

        // コンソールからの入力を受け付ける
        Scanner s = new Scanner(System.in);

        // ゲーム実行中フラグがtrueのあいだループする
        while (Board.game) {

            System.out.print("駒をおくx座標を入力してください:");
            int x = s.nextInt();

            System.out.print("駒をおくy座標を入力してください:");
            int y = s.nextInt();

            Board.setStone(x, y);

        }

        s.close();
    }

}
