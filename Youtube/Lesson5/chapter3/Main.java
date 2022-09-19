package Youtube.Lesson5.chapter3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        WriteFile wf = new WriteFile();
        try {
            wf.write();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("終了処理");
        }

    }

}
