package StarWars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExtHttpClientWrapper implements ExtHttpClient {
    private  static final String DEFAULT_REQUEST_METHOD = "GET";
    private  static final String DEFAULT_REQUEST_PROPERTY_AGENT = "User-Agent";
    private  static final String DEFAULT_REQUEST_PROPERTY_BROWSE = "Mozilla/5.0";

    @Override
    public String executeRequest(String httpUrl) {
        String content = "";
        try {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(DEFAULT_REQUEST_METHOD);
            connection.addRequestProperty(DEFAULT_REQUEST_PROPERTY_AGENT,DEFAULT_REQUEST_PROPERTY_BROWSE );
            content = readResponse(connection);
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    private String readResponse(HttpURLConnection con) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader((InputStream) con.getContent()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        return content.toString();
    }
}
