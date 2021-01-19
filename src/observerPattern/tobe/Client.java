package observerPattern.tobe;

public class Client {
    public static void main(String[] args) {

        ScoreRecord scoreRecord = new ScoreRecord();

        // 3개까지의 점수만 출력함.
        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);

        // 최대값, 최소값만 출력함.
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.attach(dataSheetView);
        scoreRecord.attach(minMaxView);

        for(int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("Adding " + score);
            scoreRecord.addScore(score);
        }

    }
}
