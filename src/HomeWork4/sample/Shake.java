package HomeWork4.sample;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Shake {
    private TranslateTransition tt;

    public Shake(Node node) {
        tt = new TranslateTransition(Duration.millis(6000), node);
        tt.setFromX(0f);
        tt.setByX(500f);
        tt.setCycleCount(100);
        tt.setAutoReverse(true);
    }

    public void playAnim() {
        tt.playFromStart();
    }

    public void stopAnim() {
        tt.stop();
    }
}