package edu.xula.www;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private User testUser;

    @BeforeEach
    void setUp() {
        testUser = new User(900287697);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void transcriptNeedsUpdate() {
    }

    @Test
    void getSemesterFromFilename() {
    }

    @Test
    void getLatestTranscriptSemester() {
    }

    @Test
    void getLatestTranscript() {
    }

    @Test
    void getSemester() {
    }

    @Test
    void getTranscriptFilenames() {
    }

    @Test
    void hasTranscript() {
    }

    @Test
    void userInput() {
        assertEquals(User.class, testUser.getClass());
    }
}