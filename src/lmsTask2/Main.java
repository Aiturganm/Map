package lmsTask2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City(722451, "Bishkek", 120));
        cities.add(new City(722482, "Batken", 49));
        cities.add(new City(722874, "Kerben", 16));
        cities.add(new City(722973, "Astana", 132));
        cities.add(new City(722831, "Samarkand", 92));
        cities.add(new City(722980, "Almaty", 104));
        cities.add(new City(722475, "Osh", 56));
        cities.add(new City(723122, "Moskva", 219));

        Set<City> citySet = new TreeSet<>(Comparator.comparing(City::getCode).reversed());
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getCode()%2==1){
                citySet.add(cities.get(i));
            }
        }
        for (City city : citySet) {
            System.out.println(city);
        }
    }
}
