package Diary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {
    @Test
    void entryCanBeAdded() {
        Diary diary = new Diary ();
        diary.addEntry ( "hello" );

        assertEquals ( 1, diary.getTotalNumberOfEntry () );
    }
}
