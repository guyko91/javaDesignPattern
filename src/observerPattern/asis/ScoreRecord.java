package observerPattern.asis;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private List<Integer> scores = new ArrayList<>();
    private DataSheetView dataSheetView;

    // 데이터 변경을 위한 메서드 set~
    public void setDataSheetView(DataSheetView dataSheetView) {
        this.dataSheetView = dataSheetView;
    }

    public void addScore(int score) {
        scores.add(score);
        dataSheetView.update();
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }
}
