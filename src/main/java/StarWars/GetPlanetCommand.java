package StarWars;

import com.google.gson.Gson;

public class GetPlanetCommand {
    private final Gson gson = new Gson();
    private final String planeteId;
    private final ExtHttpClient extHttpClient;

    public GetPlanetCommand(String planeteId, ExtHttpClient extHttpClient) {
        this.planeteId = planeteId;
        this.extHttpClient = extHttpClient;
    }

    public Planet execute(){
        String response = extHttpClient.executeRequest(getUrl());
        Planet planets = gson.fromJson(response, Planet.class);
        return planets;
    }

    private String getUrl() {
        return String.format(
                "https://swapi.co/api/planets/%s/?format=json", planeteId);
    }
}
