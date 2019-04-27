

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRestClient {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://swapi.co/api/people/1/?format=json");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.addRequestProperty("User-Agent", "Mozilla/5.0");
        int status = con.getResponseCode();
        System.out.println(status);
        readResponse(con);
        con.disconnect();
    }

    private static void readResponse(HttpURLConnection con) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader((InputStream) con.getContent()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        System.out.println(content);


        Gson gson = new Gson();
        People people = gson.fromJson(content.toString(), People.class);
        System.out.println("Result:\n" + people);


    }

}