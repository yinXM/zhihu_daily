package org.what.word.test;

import org.what.word.api.HttpFormat;
import org.what.word.api.HttpFormatToModel;
import org.what.word.model.LatestModel;

public class Test1 {
    public static void main(String[] args) {
//        HttpFormat format = new HttpFormat();
        HttpFormatToModel format = new HttpFormatToModel();
        try {
            LatestModel model  = (LatestModel) format.HttpTest();
            System.out.println(String.valueOf(model));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
