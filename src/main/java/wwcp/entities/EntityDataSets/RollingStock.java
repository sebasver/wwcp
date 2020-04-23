package wwcp.entities.EntityDataSets;

public class RollingStock {
    public static String era = "wwcp.era";
    public static String nick = "wwcp.nick";
    public static String type = "wwcp.type";
    public static String aditional = "wwcp.aditional";

    //DBpza
    public static Transport.Rollingstock DBpza() {
        return new Transport.Rollingstock("Dobbelstock 4th generation", "Germany", "1997-", "",
                "", type, " Passenger", 47.5f, 140f, false, true, 0);
    }

    //Donderbus 1st class todo unfinished
    public static Transport.Rollingstock Donderbus1() {
        return new Transport.Rollingstock("Donnerbüchse2ndclass", "Germany", "1921-1931", "",
                "", type, " Passenger", 19.6f, 120f, false, true, 0);
    }

    //Donderbus 2nd class todo unfinished
    public static Transport.Rollingstock Donderbus2() {
        return new Transport.Rollingstock("Donnerbüchse3rdclass", "Europe", "1921-1931", "",
                "", type, " Passenger", 19.6f, 120f, false, true, 0);
    }

    //Donderbus 3rd class todo unfinished
    public static Transport.Rollingstock Donderbus3() {
        return new Transport.Rollingstock("Donnerbüchse4thclass", "Europe", "1921-1931", "",
                "", type, " Passenger", 19.6f, 120f, false, true, 0);
    }

    //Eurofima with Compartments
    public static Transport.Rollingstock EurofimaCompartment() {
        return new Transport.Rollingstock("EurofimaCompartments", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Rows
    public static Transport.Rollingstock EurofimaRows() {
        return new Transport.Rollingstock("EurofimaOpenSeating", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Sleeperbeds
    public static Transport.Rollingstock EurofimaSleeper() {
        return new Transport.Rollingstock("EurofimaSleeper", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //GWR Third
    public static Transport.Rollingstock GWRThirdOpen() {
        return new Transport.Rollingstock("GWRBrunel3rdClass", "United Kingdom", "1838-1854", "",
                "", type, " Passenger Carriage", 9.5f, 0f, false, true, 0);
    }

    //GWR Third
    public static Transport.Rollingstock GWRThirdOpenChristmas() {
        return new Transport.Rollingstock("GWRBrunel3rdClassChristmas", "United Kingdom", "1838-1854", "",
                "", type, " Passenger Carriage", 9.5f, 0f, false, true, 0);
    }

    //OFF52
    public static Transport.Rollingstock OFF52() {
        return new Transport.Rollingstock("OFF52withbeetles", "Germany", "1954-1980", aditional,
                " Laae 540", type, " Freight Cars", 25.4f, 0, false, true, 0);
    }

    //Rheingold 1st Kitchen
    public static Transport.Rollingstock RheingoldKitchen1Christmas() {
        return new Transport.Rollingstock("SA4uk28Christmas", "Germany", "1928-1939", aditional,
                " Rheingold 1st class dinnercar Christmas", type, " Passenger Dinner", 56.6f, 0f, false, true, 0);
    }

    //Rheingold 1st Salon
    public static Transport.Rollingstock RheingoldSalon1Christmas() {
        return new Transport.Rollingstock("SA4u28Christmas", "Germany", "1928-1939", aditional,
                " Rheingold 1st class saloncar Christmas", type, " Passenger", 51.9f, 0f, false, true, 0);
    }

    //Rheingold 2nd Kitchen
    public static Transport.Rollingstock RheingoldKitchen2Christmas() {
        return new Transport.Rollingstock("SB4uk28Christmas", "Germany", "1928-1939", aditional,
                " Rheingold 2nd class dinnercar Christmas", type, " Passenger Dinner", 55.5f, 0f, false, true, 0);
    }

    //Rheingold 2nd Salon
    public static Transport.Rollingstock RheingoldSalon2Christmas() {
        return new Transport.Rollingstock("SB4u28Christmas", "Germany", "1928-1939", aditional,
                " Rheingold 2nd class saloncar Christmas", type, " Passenger", 52.8f, 0f, false, true, 0);
    }

    //Rheingold 1st Kitchen
    public static Transport.Rollingstock RheingoldKitchen1() {
        return new Transport.Rollingstock("SA4uk28", "Germany", "1928-1939", aditional,
                " Rheingold 1st class dinnercar", type, " Passenger Dinner", 56.6f, 0f, false, true, 0);
    }

    //Rheingold 1st Salon
    public static Transport.Rollingstock RheingoldSalon1() {
        return new Transport.Rollingstock("SA4u28", "Germany", "1928-1939", aditional,
                " Rheingold 1st class saloncar", type, " Passenger", 51.9f, 0f, false, true, 0);
    }

    //Rheingold 2nd Kitchen
    public static Transport.Rollingstock RheingoldKitchen2() {
        return new Transport.Rollingstock("SB4uk28", "Germany", "1928-1939", aditional,
                " Rheingold 2nd class dinnercar", type, " Passenger Dinner", 55.5f, 0f, false, true, 0);
    }

    //Rheingold 2nd Salon
    public static Transport.Rollingstock RheingoldSalon2() {
        return new Transport.Rollingstock("SB4u28", "Germany", "1928-1939", aditional,
                " Rheingold 2nd class saloncar", type, " Passenger", 52.8f, 0f, false, true, 0);
    }

    //Rheingold Baggagef
    public static Transport.Rollingstock RheingoldBaggage() {
        return new Transport.Rollingstock("SPw4u28", "Germany", "1928-1939", aditional,
                " Rheingold baggagecar", type, " Passenger Baggage", 41.2f, 0f, false, true, 0);
    }

    //Sggnss 80 Load 1
    public static Transport.Rollingstock Sggnss80Load1() {
        return new Transport.Rollingstock("SGNSS 80 Load 1", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0);
    }

    //Sggnss 80 Load 2
    public static Transport.Rollingstock Sggnss80Load2() {
        return new Transport.Rollingstock("SGNSS 80 Load 2", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0);
    }

    //Sggnss 80 Load 3
    public static Transport.TankCars Sggnss80Load3() {
        return new Transport.TankCars("SGNSS 80 Load 3", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0, 60000);
    }

    //Sggnss 80 Load 4
    public static Transport.TankCars Sggnss80Load4() {
        return new Transport.TankCars("SGNSS 80 Load 4", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0, 60000);
    }

    //UK 6 Plank "6-Plankopenwagon"
    public static Transport.Rollingstock UKOpenWagon() {
        return new Transport.Rollingstock("UKOpenwagon", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }
}
