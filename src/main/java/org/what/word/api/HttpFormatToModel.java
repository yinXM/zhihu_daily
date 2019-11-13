package org.what.word.api;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.what.word.model.LatestModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpFormatToModel {


    public Object HttpTest() throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        HttpGet get = new HttpGet("https://news-at.zhihu.com/api/4/news/latest");
        LatestModel model = new LatestModel();
        try {
            response = client.execute(get);

            if (response.getStatusLine().getStatusCode() == 200){
                HttpEntity entity = response.getEntity();
                String cotent = EntityUtils.toString(entity, "UTF-8");

                Gson gson = new Gson();
//                LatestModel model  = gson.fromJson(cotent, new TypeToken<LatestModel>(){}.getType());
                 model  = gson.fromJson(cotent, LatestModel.class);
            }
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }finally {
            if(response != null){
                response.close();
            }
            client.close();
        }
        return model;
    }
}
