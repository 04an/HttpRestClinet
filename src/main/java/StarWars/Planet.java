package StarWars;
import com.google.gson.annotations.SerializedName;

public class Planet {

    private String name;
    @SerializedName("rotarion_period")
    private int rotationPeriod;
    @SerializedName("orbital_period")
    private int orbitalPeriod;
    private int diameter;
    private String climate;
    private String grafity;
    private String terrain;
    @SerializedName("surface_water")
    private int surfaceWater;
    private int population;

    public String getName() {
        return name;
    }

    public Planet setName(String name) {
        this.name = name;
        return this;
    }

    public int getRotationPeriod() {
        return rotationPeriod;
    }

    public Planet setRotationPeriod(int rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
        return this;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Planet setOrbitalPeriod(int orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
        return this;
    }

    public int getDiameter() {
        return diameter;
    }

    public Planet setDiameter(int diameter) {
        this.diameter = diameter;
        return this;
    }

    public String getClimate() {
        return climate;
    }

    public Planet setClimate(String climate) {
        this.climate = climate;
        return this;
    }

    public String getGrafity() {
        return grafity;
    }

    public Planet setGrafity(String grafity) {
        this.grafity = grafity;
        return this;
    }

    public String getTerrain() {
        return terrain;
    }

    public Planet setTerrain(String terrain) {
        this.terrain = terrain;
        return this;
    }

    public int getSurfaceWater() {
        return surfaceWater;
    }

    public Planet setSurfaceWater(int surfaceWater) {
        this.surfaceWater = surfaceWater;
        return this;
    }

    public int getPopulation() {
        return population;
    }

    public Planet setPopulation(int population) {
        this.population = population;
        return this;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", rotationPeriod=" + rotationPeriod +
                ", orbitalPeriod=" + orbitalPeriod +
                ", diameter=" + diameter +
                ", climate='" + climate + '\'' +
                ", grafity='" + grafity + '\'' +
                ", terrain='" + terrain + '\'' +
                ", surfaceWater=" + surfaceWater +
                ", pupulation=" + population +
                '}';
    }
}
