package org.what.word.comfilct;

import java.io.IOException;

public class MainTest {

    public static void main(String[] args) {
       QueryTest queryTest = new QueryTest();
        try {
            queryTest.test();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
