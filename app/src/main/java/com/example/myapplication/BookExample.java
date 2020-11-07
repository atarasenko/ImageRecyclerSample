package com.example.myapplication;

import android.util.Log;

import com.google.gson.Gson;

public class BookExample {


    String json = "[\n" +
            "  {\n" +
            "    \"title\": \"Thinking in Java (4th ed.)\",\n" +
            "    \"authorName\": \"Eckel, Bruce\",\n" +
            "    \"yearReleased\": 2006,\n" +
            "    \"bookGenre\": \"NON_FICTION\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"The Ultimate Hitchhiker\\u0027s Guide to the Galaxy\",\n" +
            "    \"authorName\": \"Adams, Douglas\",\n" +
            "    \"yearReleased\": 1979,\n" +
            "    \"bookGenre\": \"FICTION_COMEDY\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"title\": \"The Hobbit\",\n" +
            "    \"authorName\": \"Tolkien, J.R.R.\",\n" +
            "    \"yearReleased\": 1937,\n" +
            "    \"bookGenre\": \"FICTION_FANTASY\"\n" +
            "  }\n" +
            "]\n";

    void load(){
        try{
            Gson gson = new Gson();
            Book[] books = gson.fromJson(json,  Book[].class);
            Log.i("TAG","success");
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    class Book{
        String title;
        String authorName;
        String yearReleased;
        String bookGenre;
    }

}
