package StarWars;


import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class SampleRequestMain {

    public static void main(String[] args) {
        List<Charakter> charakters = new ArrayList<>();
        ExtHttpClient extHttpClient = new ExtHttpClientWrapper();
        GetPeopleCommand getPeopleCommand1 =
                new GetPeopleCommand("1", extHttpClient);
        System.out.println(getPeopleCommand1.execute().getName() + " is : " + getPeopleCommand1.execute().getHeight());
        charakters.add(getPeopleCommand1.execute());
        GetPeopleCommand getPeopleCommand2 =
                new GetPeopleCommand("2", extHttpClient);
        System.out.println(getPeopleCommand2.execute().getName() + "is : " + getPeopleCommand2.execute().getHeight());
        charakters.add(getPeopleCommand2.execute());
        GetPeopleCommand getPeopleCommand3 =
                new GetPeopleCommand("3", extHttpClient);
        System.out.println(getPeopleCommand3.execute().getName() + " is : " + getPeopleCommand3.execute().getHeight());
        charakters.add(getPeopleCommand3.execute());

        double heightSum = 0.0;

        for (Charakter charakter : charakters) {
            heightSum += charakter.getHeight();
        }

        double averageHeight = heightSum / charakters.size();

        System.out.printf("Average height all characters: %.2f.\n", averageHeight);


        List<Planet> planets = new ArrayList<>();
        GetPlanetCommand getPlanetCommand1 = new GetPlanetCommand("1", extHttpClient);
        System.out.println(getPlanetCommand1.execute().getName() + " population is :" + getPlanetCommand1.execute().getPopulation());
        planets.add(getPlanetCommand1.execute());

        GetPlanetCommand getPlanetCommand2 = new GetPlanetCommand("2", extHttpClient);
        System.out.println(getPlanetCommand2.execute().getName() + " population is :" + getPlanetCommand2.execute().getPopulation());
        planets.add(getPlanetCommand2.execute());

        int populatioinSum = 0;

        for (Planet planet : planets) {
            populatioinSum += planet.getPopulation();
        }
        int averagePopulation = populatioinSum/ planets.size();
        System.out.println("Avarage population all planets : " + averagePopulation);
    }
}

        /*       Podstawowe rozwiazanoie
         String response1 = extHttpClient.executeRequest(
                "https://swapi.co/api/people/1/?format=json");
        String response2 = extHttpClient.executeRequest(
                "https://swapi.co/api/people/2/?format=json");
        System.out.println("Response 1: " + response1);
        System.out.println("Response 2: " + response2);
        Gson gson = new Gson();
        People people = gson.fromJson(response1, People.class);
        People people1 = gson.fromJson(response2, People.class);
        System.out.println("Deserialize: " + people);
        System.out.println("Deserialize: " + people1);*/



       /* ExtHttpClient extHttpClient = new ExtHttpClientWrapper();
        String response1 = extHttpClient.executeRequest(
                "https://swapi.co/api/people/1/?format=json");
        String response2 = extHttpClient.executeRequest(
                "https://swapi.co/api/people/2/?format=json");
        String response3 = extHttpClient.executeRequest(
                "https://swapi.co/api/people/3/?format=json");

        Gson gson = new Gson();
        Charakter charakter1 = gson.fromJson(response1.toString(), Charakter.class);
        System.out.println(charakter1.getName()+" has height : " + charakter1.getHeight());
        Charakter charakter2 = gson.fromJson(response2.toString(), Charakter.class);
        System.out.println(charakter2.getName()+ " has height :  " + charakter2.getHeight());
        Charakter charakter3 = gson.fromJson(response3.toString(), Charakter.class);
        System.out.println(charakter3.getName()+" has height : " + charakter3.getHeight());

        List<Charakter> charakters = new ArrayList<>();
        charakters.add(charakter1);
        charakters.add(charakter2);
        charakters.add(charakter3);


        int averageHieght = (charakter1.getHeight() + charakter2.getHeight() + charakter3.getHeight()) / 3;
        System.out.println("Average charakters hieght in Stars Wars is : " + averageHieght + "cm");

    }*/

    /*   wiarian ulepszony
     public static void main(String[] args) throws IOException {

        List<People> charactersList = new ArrayList<>();

        ExtHttpClient extHttpClient = new ExtHttpClientWrapper();

        for (int i = 1; i <= 5; i++) {
            String characterUrl = String.format(("https://swapi.co/api/people/%d/?format=json"), i);
            charactersList.add(extHttpClient.executeRequest(characterUrl));
            System.out.printf("Height of %s: %d\n", charactersList.get(i -1).getName(), charactersList.get(i-1).getHeight());
        }

        var heightSum = 0.0;

        for (People people : charactersList) {
            heightSum += people.getHeight();
        }

        double averageHeight = heightSum / charactersList.size();

        System.out.printf("Average height all characters: %.2f.", averageHeight);
    }
}*/

