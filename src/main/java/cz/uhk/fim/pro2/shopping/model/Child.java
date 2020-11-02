package cz.uhk.fim.pro2.shopping.model;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 * Modelova trida predstavujici Dite (prodavany/kupovany subjekt)
 */
public class Child {
    private String personalId;
    private String displayName;
    private double price;
    private Date birthDate;
    private GenderType gender;
    private boolean virginity;
    private double weight;
    private boolean race;
    private String nationality;
    private int skinTone;
    private int eyeColor;
    private int hairColor;

    public Child() {
    }

    public Child(String personalId, String displayName, double price, Date birthDate, GenderType gender, boolean virginity, double weight, boolean race, String nationality, int skinTone, int eyeColor, int hairColor) {
        this.personalId = personalId;
        this.displayName = displayName;
        this.price = price;
        this.birthDate = birthDate;
        this.gender = gender;
        this.virginity = virginity;
        this.weight = weight;
        this.race = race;
        this.nationality = nationality;
        this.skinTone = skinTone;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.birthDate);
        return Year.now().getValue() - calendar.get(Calendar.YEAR);
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public boolean isVirginity() {
        return virginity;
    }

    public void setVirginity(boolean virginity) {
        this.virginity = virginity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isRace() {
        return race;
    }

    public void setRace(boolean race) {
        this.race = race;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getSkinTone() {
        return skinTone;
    }

    public void setSkinTone(int skinTone) {
        this.skinTone = skinTone;
    }

    public int getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(int eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getHairColor() {
        return hairColor;
    }

    public void setHairColor(int hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Child{" +
                "personalId='" + personalId + '\'' +
                ", displayName='" + displayName + '\'' +
                ", price=" + price +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", virginity=" + virginity +
                ", weight=" + weight +
                ", race=" + race +
                ", nationality='" + nationality + '\'' +
                ", skinTone=" + skinTone +
                ", eyeColor=" + eyeColor +
                ", hairColor=" + hairColor +
                '}';
    }
}
