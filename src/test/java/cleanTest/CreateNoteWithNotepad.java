package cleanTest;

import activity.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class CreateNoteWithNotepad {
    NotepadMainActivity mainScreen = new NotepadMainActivity();
    CreateNoteForm createNoteForm = new CreateNoteForm();
    DeleteNote deleteNoteForm = new DeleteNote();
    ConfirmDeleteNote confirmDeletePopup = new ConfirmDeleteNote();
    ProgressBar progressBar = new ProgressBar();
    String title = "Cato";
    String note="esta es una nota";
    String updateTitle = "CatoUpdate";
    String updateNote = "nota updated";

    @Test
    public void verifyCUDNote(){

        Assertions.assertTrue(progressBar.isProgressBarDisplayed(), "ERROR, the progress bar was not displayed");
        //Create Note
        progressBar.clickProgressBar.click();
        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
        createNoteForm.backArrow.click();

        Assertions.assertTrue(mainScreen.isNoteDisplayed(title),
                "ERROR, the note was not created");

        //Update Note
        mainScreen.clickNoteCreated.click();
        createNoteForm.goIt.click();
        createNoteForm.editButton.click();
        createNoteForm.titleTxtBox.setText(updateTitle);
        createNoteForm.noteTxtBox.setText(updateNote);
        createNoteForm.backArrow.click();

        Assertions.assertTrue(mainScreen.isNoteDisplayed(updateTitle),
                "ERROR, the note was not updated");

        //Delete Note
        mainScreen.clickNoteCreated.click();
        deleteNoteForm.menuButton.click();
        deleteNoteForm.deleteButton.click();
        confirmDeletePopup.deleteButtonConfirm.click();

        Assertions.assertTrue(mainScreen.noTasksAddedMessageIsDisplayed(),
                "ERROR, the note was not deleted");
    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }

}
