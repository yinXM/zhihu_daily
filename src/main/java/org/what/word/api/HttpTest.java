package org.what.word.api;


import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;

public class HttpTest {
   public void HttpTest() throws Exception{

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
//       URI uri = new URI("https://news-at.zhihu.com/api/4/news/latest");
       HttpGet get = new HttpGet("https://news-at.zhihu.com/api/4/news/latest");
        try {
           response = httpClient.execute(get);

           if (response.getStatusLine().getStatusCode() == 200){
               HttpEntity entity = response.getEntity();
               String content = entity.toString();

               String cotent = EntityUtils.toString(entity, "UTF-8");

               FileUtils.writeStringToFile(new File("D:\\wan\\zhihu.html"),cotent);
               System.out.println("内容长度"+cotent.length());

           }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(response != null){
                response.close();
            }
            httpClient.close();
        }
    }
}

