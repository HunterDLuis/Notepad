package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class ProgressBar {
    public Button clickProgressBar = new Button(By.id("com.notepadfree.photonotes.voicenotes.checklist:id/progressBar"));

    public ProgressBar(){}

    public boolean isProgressBarDisplayed(){
        Button progressBar = new Button(By.id("com.notepadfree.photonotes.voicenotes.checklist:id/progressBar"));
        return progressBar.isControlDisplayed();
    }
}
