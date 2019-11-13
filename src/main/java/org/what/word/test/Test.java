package org.what.word.test;

import org.what.word.api.HttpTest;

public class Test {
    public static void main(String[] args) {
        HttpTest application = new HttpTest();
        try {
            application.HttpTest();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        MathOperation a = (int w, int b) -> w+b;
    }
}
