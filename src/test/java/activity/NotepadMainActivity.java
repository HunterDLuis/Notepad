package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class NotepadMainActivity {
    public Button addNoteButton = new Button(By.id("com.notepadfree.photonotes.voicenotes.checklist:id/blank_note"));
    public Button clickNoteCreated = new Button(By.id("com.notepadfree.photonotes.voicenotes.checklist:id/noteparentlayout"));
    public NotepadMainActivity(){}

    public boolean isNoteDisplayed(String title){
        Label note= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return note.isControlDisplayed();
    }

    public void clickNoteCreated(String title){
        Label updateNote = new Label(By.id("//android.widget.TextView[@text='"+title+"']"));
        updateNote.click();
    }

    public boolean noTasksAddedMessageIsDisplayed(){
        Label message = new Label(By.id("com.notepadfree.photonotes.voicenotes.checklist:id/create_note_heading"));
        return message.isControlDisplayed();
    }
}
