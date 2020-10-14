package practiceExceptionsTask;

public class Candidate {

    private String name;
    private int age;
    private String englishlevel;
    private int height;
    private boolean countryResident;
    private boolean tattoosOrpiercings;

    public Candidate(String name, int age, String englishlevel, int height,
                     boolean countryResident, boolean tattoosOrpiercings) {
        this.name = name;
        this.age = age;
        this.englishlevel = englishlevel;
        this.height = height;
        this.countryResident = countryResident;
        this.tattoosOrpiercings = tattoosOrpiercings;

    }

    public Candidate() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEnglishlevel() {
        return englishlevel;
    }

    public void setEnglishlevel(String englishlevel) {
        this.englishlevel = englishlevel;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean getCountryResident() {
        return countryResident;
    }

    public void setCountryResident(boolean countryResident) {
        this.countryResident = countryResident;
    }

    public boolean getTattoosOrpiercings() {
        return tattoosOrpiercings;
    }

    public void setTattoosOrpiercings(boolean tattoosOrpiercings) {
        this.tattoosOrpiercings = tattoosOrpiercings;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", englishlevel='" + englishlevel + '\'' +
                ", height=" + height +
                ", countryResident='" + countryResident + '\'' +
                ", tattoosOrpiercings='" + tattoosOrpiercings + '\'' +
                '}';
    }
}