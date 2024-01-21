import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Destinations> destinations = new ArrayList<>();
        List<Destinations> popularDestinations = new ArrayList<>();
        List<Destinations> lessvisitatedDestinations = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("destinations.csv"))) {
            String line;
            reader.readLine();
            while((line= reader.readLine())!=null){
                String[] parts=line.split(",");
                int id=Integer.parseInt(parts[0].trim());
                String name=parts[1].trim();
                String country=parts[2].trim();
                String type=parts[3].trim();
                int yearOpened=Integer.parseInt(parts[4].trim());
                int visitorCount=Integer.parseInt(parts[5].trim());
                double entryFee=Double.parseDouble(parts[6].trim());
                double rating=Double.parseDouble(parts[7].trim());

                Destinations destination= new Destinations(id,name,country,type,yearOpened,visitorCount,entryFee,rating);
                destinations.add(destination);
                if(visitorCount>100){
                    popularDestinations.add(destination);
                } else {
                    lessvisitatedDestinations.add(destination);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    System.out.println("Popular Destinations Open After 1800:");
    for(Destinations destinations: popularDestinations){
        if(destinations.getYearOpened()>1800){
            System.out.println(destination.toString());
        }
    }
}