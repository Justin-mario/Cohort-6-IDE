package Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryUserTest {
    User atinuke;
    Diary relationshipDiary;
    @BeforeEach
    void beforeEachTest(){
        relationshipDiary = new Diary();
        atinuke = new User("Joy", relationshipDiary);
    }
    @Test
    void userHasADiary(){
        assertNotNull(atinuke.getDiary());
    }

    @Test
    void userCanWriteOnDiary(){
        atinuke.createEntry("Today I Was Heartbroken, I bought ice-cream and chicken");
    }
}
