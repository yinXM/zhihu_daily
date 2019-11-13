package org.what.word.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HttpOrion {
    public static void teJson(){
        try{
            InputStream in = new FileInputStream("orion.json");
            InputStreamReader reader = new InputStreamReader(in);
            JsonReader jsonReader = new JsonReader(reader);

            Gson gson = new Gson();

        }catch (Exception e){

        }

    }

    public static void main(String[] args) {

    }
}
