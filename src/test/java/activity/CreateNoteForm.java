package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class CreateNoteForm {

    public TextBox titleTxtBox= new TextBox(By.id("com.notepadfree.photonotes.voicenotes.checklist:id/notetitle"));
    public TextBox noteTxtBox= new TextBox(By.id("com.notepadfree.photonotes.voicenotes.checklist:id/notenote"));
    public Button backArrow = new Button(By.id("com.notepadfree.photonotes.voicenotes.checklist:id/noteback"));

    //Update
    public Button goIt = new Button(By.id("com.notepadfree.photonotes.voicenotes.checklist:id/got_it_btn"));
    public Button editButton = new Button(By.id("com.notepadfree.photonotes.voicenotes.checklist:id/note_editmode"));

    public CreateNoteForm(){}
}
