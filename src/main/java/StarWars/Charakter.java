package StarWars;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Charakter {



    private String name;
    private int height;
    private String mass;
    @SerializedName("hair_color")
    private String hairColor;
    @SerializedName("skin_color")
    private String skinColor;
    @SerializedName("eye_color")
    private String eyeColor;
    @SerializedName("birth_year")
    private String birthYear;
    private String gender;

    public String getName() {
        return name;
    }

    public Charakter setName(String name) {
        this.name = name;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Charakter setHeight(int height) {
        this.height = height;
        return this;
    }

    public String getMass() {
        return mass;
    }

    public Charakter setMass(String mass) {
        this.mass = mass;
        return this;
    }

    public String getHairColor() {
        return hairColor;
    }

    public Charakter setHairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public Charakter setSkinColor(String skinColor) {
        this.skinColor = skinColor;
        return this;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public Charakter setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        return this;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public Charakter setBirthYear(String birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Charakter setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public Charakter setHomeworld(String homeworld) {
        this.homeworld = homeworld;
        return this;
    }

    private String homeworld;

    @Override
    public String toString() {
        return "Charakter{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", mass='" + mass + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", gender='" + gender + '\'' +
                ", homeworld='" + homeworld + '\'' +
                '}';
    }
}
