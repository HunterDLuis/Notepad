package activity;
import appiumControl.Button;
import org.openqa.selenium.By;

public class DeleteNote {
    public Button menuButton = new Button(By.id("com.notepadfree.photonotes.voicenotes.checklist:id/note_more"));
    public Button deleteButton = new Button(By.id("com.notepadfree.photonotes.voicenotes.checklist:id/textView25"));
}
