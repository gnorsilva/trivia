package com.adaptionsoft.games.trivia.runner;

import org.junit.Test;

import java.io.*;

public class GameRunnerTest {

    @Test
    public void testName() throws Exception {
        for (int i = 0; i < 1000; i++) {
            File goldenMaster = new File("/home/xalo/proj/gnorsilva/code_retreats/trivia/java/golden_masters/" + i + ".out");
            PrintStream printStream = new PrintStream(goldenMaster);
            System.setOut(printStream);
            GameRunner.main(new String[]{i + ""});
        }
    }
}
