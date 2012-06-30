package com.adaptionsoft.games.trivia.runner;

import org.apache.commons.io.FileUtils;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

import static junit.framework.Assert.assertEquals;

public class GoldenMasterTest {

    @Ignore
    @Test
    public void run_test() throws Exception {

        File testFile= new File("/home/xalo/proj/gnorsilva/code_retreats/trivia/java/test.out");
        PrintStream printStream = new PrintStream(testFile);
        System.setOut(printStream);

        for (int i = 0; i < 100; i++) {
            GameRunner.main(new String[]{i + ""});
        }

        String testFileContents = FileUtils.readFileToString(testFile);

        File goldenMaster = new File("/home/xalo/proj/gnorsilva/code_retreats/trivia/java/golden_master.out");
        String goldenMasterContents = FileUtils.readFileToString(goldenMaster);
        assertEquals(goldenMasterContents, testFileContents);
    }
}
