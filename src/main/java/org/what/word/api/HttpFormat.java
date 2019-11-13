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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpFormat {
    public Object HttpTest() throws Exception{
        CloseableHttpClient client = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        HttpGet get = new HttpGet("https://news-at.zhihu.com/api/4/news/latest");
        Map map = new HashMap();
        try {
            response = client.execute(get);

            if (response.getStatusLine().getStatusCode() == 200){
                HttpEntity entity = response.getEntity();
                String cotent = EntityUtils.toString(entity, "UTF-8");
                Gson gson = new Gson();
//                gson.fromJson(cotent,)
//                System.out.println("****"+gson.toJson(cotent));
//                Map<String,Object> map = new HashMap<String,Object>();
//                map = gson.fromJson(cotent, Map.class);
                map = gson.fromJson(cotent, Map.class);

                String  stories = String.valueOf(map.get("stories"));
                JsonElement stories1 = gson.toJsonTree(map.get("stories"));
                List<Map<String,Object>> list = gson.fromJson(stories1, ArrayList.class);
                for ( Map map1:list) {
                    System.out.println(String.valueOf(map1));
                }
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
        return map;
    }
}
