package org.what.word;

import org.apache.http.client.methods.HttpGet;

public class NewZhiHu {
    public void getApi(){
        try {
            HttpGet get = new HttpGet("https://news-at.zhihu.com/api/4/news/latest");
        }catch (Exception e){

        }
    }
}
