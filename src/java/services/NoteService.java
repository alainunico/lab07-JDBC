package services;

import dataaccess.UserDB;
import java.util.List;
import models.User;

public class NoteService {
    public User get(int id) throws Exception {
        UserDB noteDB = new UserDB();
        User note = noteDB.get(id);
        return note;
    }
    
    public List<User> getAll(String email) throws Exception {
        UserDB noteDB = new UserDB();
        List<User> notes = noteDB.getAll(email);
        return notes;
    }
    
    public void insert(String title, String contents, String owner) throws Exception {
        User note = new User(0, title, contents, owner);
        UserDB noteDB = new UserDB();
        noteDB.insert(note);
    }
    
    public void update(int noteId, String title, String contents, String owner) throws Exception {
        User note = new User(noteId, title, contents, owner);
        UserDB noteDB = new UserDB();
        noteDB.update(note);
    }
    
    public void delete(int noteId) throws Exception {
        User note = new User();
        note.setNoteId(noteId);
        UserDB noteDB = new UserDB();
        noteDB.delete(note);
    }
}
