package org.example.read_from_url;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //method1();
        method2();
    }

    private static void method1() throws IOException {
        File file = new File("src/main/resources/utils/posts.json");


        ObjectMapper mapper = new ObjectMapper();
        List<Posts> posts = mapper.readValue(file, new TypeReference<>() {});

        posts.forEach(System.out::println);
        System.out.println("posts.size() = " + posts.size());
    }

    private static void method2() throws IOException {
        String path = "src/main/resources/utils/posts.json";
        InputStream inputStream = new FileInputStream(path);


        ObjectMapper mapper = new ObjectMapper();
        List<Posts> posts = mapper.readValue(inputStream, new TypeReference<>() {});

        posts.forEach(System.out::println);
        System.out.println("posts.size() = " + posts.size());
    }
}
