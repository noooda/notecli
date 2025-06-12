package io.github.noooda.notecli.application.usecases;

// import io.github.noooda.notecli.domain.repositories.NoteRepository;

public class GetNote {
    // final private NoteRepository noteRepository;

    public GetNote() {
    }

    public String[] GetAllNoteNames() {
        // this.noteRepository.getAll();
        String[] AllNoteNames = {"note1.txt", "note2.txt", "note3.txt"};
        return AllNoteNames;
    }
}
