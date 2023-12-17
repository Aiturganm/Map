package lmsTask2;

public class City {
    private int code;
    private String name;
    private int educationPlace;

    public City() {
    }

    public City(int code, String name, int educationPlace) {
        this.code = code;
        this.name = name;
        this.educationPlace = educationPlace;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEducationPlace() {
        return educationPlace;
    }

    public void setEducationPlace(int educationPlace) {
        this.educationPlace = educationPlace;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", educationPlace=" + educationPlace +
                '}';
    }
}
