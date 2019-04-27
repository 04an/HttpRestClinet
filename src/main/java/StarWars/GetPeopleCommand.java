package StarWars;

import com.google.gson.Gson;

public class GetPeopleCommand {

    private final Gson gson = new Gson();
    private final String peopleId;
    private final ExtHttpClient extHttpClient;

    public GetPeopleCommand(String peopleId, ExtHttpClient extHttpClient) {
        this.peopleId = peopleId;
        this.extHttpClient = extHttpClient;
    }

    public Charakter execute(){
        String response = extHttpClient.executeRequest(getUrl());
        Charakter charakter = gson.fromJson(response, Charakter.class);
        return charakter;
    }

    private String getUrl() {
        return String.format(
                "https://swapi.co/api/people/%s/?format=json", peopleId);
    }
}
