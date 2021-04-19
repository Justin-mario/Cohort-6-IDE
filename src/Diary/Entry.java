package Diary;

import java.time.LocalDateTime;

public class Entry {
    private static int lastEntryId;
    private final LocalDateTime entryDateAndTime;
    private  String entryBody;
    private int entryId;

    public Entry(String entryBody){
        this.entryBody = entryBody;
        this.entryDateAndTime = LocalDateTime.now ();
        entryId = ++lastEntryId;
    }
}
