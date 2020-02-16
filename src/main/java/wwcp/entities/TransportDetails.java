package wwcp.entities;

public class TransportDetails {

    public static String era = "wwcp.era";
    public static String nick = "wwcp.nick";
    public static String type = "wwcp.type";
    public static String aditional = "wwcp.aditional";

    /**
     * Backspeed has to be known
     */
    public static class EntityData1 {
        public String name;
        public String country;
        public String year;
        public String fuel;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public int rows;
        public float tractive_effort;
        public float metric_horsepower;
        public float weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public EntityData1(String Name, String Country, String Year, String Fuel, String AditionalTextTitle, String AditionalText, String AditionalText2Title, String AditionalText2,
                           float TractiveEffort, float MetricHorsepower, float WeightinTons, float TopSpeed, float BackTopSpeed, boolean Fictional, boolean Reinforced, int MaxRows) {
            name = Name;
            country = Country;
            year = Year;
            fuel = Fuel;
            additionalTextTitle = AditionalTextTitle;
            additionalText = AditionalText;
            additionalTextTitle2 = AditionalText2Title;
            additionalText2 = AditionalText2;
            tractive_effort = TractiveEffort;
            weightinKGs = (WeightinTons * 100);
            topSpeed = TopSpeed;
            metric_horsepower = MetricHorsepower;
            backTopSpeed = BackTopSpeed;
            fictional = Fictional;
            reinforced = Reinforced;
            rows = MaxRows;
        }


    }

    /**
     * This is for Trains with no defined backspeed, Backspeed simply equals Topspeed
     */
    public static class EntityData2 {
        public String name;
        public String country;
        public String year;
        public String fuel;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public int rows;
        public float tractive_effort;
        public float metric_horsepower;
        public float weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public EntityData2(String Name, String Country, String Year, String Fuel, String AditionalTextTitle, String AditionalText, String AditionalText2Title, String AditionalText2,
                           float TractiveEffort, float MetricHorsepower, float WeightinTons, float TopSpeed, boolean Fictional, boolean Reinforced, int MaxRows) {
            name = Name;
            country = Country;
            year = Year;
            fuel = Fuel;
            additionalTextTitle = AditionalTextTitle;
            additionalText = AditionalText;
            additionalTextTitle2 = AditionalText2Title;
            additionalText2 = AditionalText2;
            tractive_effort = TractiveEffort;
            weightinKGs = (WeightinTons * 100);
            topSpeed = TopSpeed;
            metric_horsepower = MetricHorsepower;
            backTopSpeed = TopSpeed;
            reinforced = Reinforced;
            fictional = Fictional;
            rows = MaxRows;
        }


    }

    /**
     * This is for rolingstock with a defined topspeed or with no topspeed "0"
     */
    public static class EntityData3 {
        public String name;
        public String country;
        public String year;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public int rows;
        public float weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public EntityData3(String Name, String Country, String Year, String AditionalTextTitle, String AditionalText, String AditionalText2Title,
                           String AditionalText2, float WeightinTons, float TopSpeed, boolean Fictional, boolean Reinforced, int MaxRows) {
            name = Name;
            country = Country;
            year = Year;
            additionalTextTitle = AditionalTextTitle;
            additionalText = AditionalText;
            additionalTextTitle2 = AditionalText2Title;
            additionalText2 = AditionalText2;
            weightinKGs = (WeightinTons * 100);
            topSpeed = TopSpeed;
            fictional = Fictional;
            backTopSpeed = TopSpeed;
            reinforced = Reinforced;
            rows = MaxRows;
        }
    }

    /**
     * this is for tank cars
     */
    public static class EntityData4 {
        public String name;
        public String country;
        public String year;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public int rows;
        public int tankcapacity;
        public float weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public EntityData4(String Name, String Country, String Year, String AditionalTextTitle, String AditionalText, String AditionalText2Title,
                           String AditionalText2, float WeightinTons, float TopSpeed, boolean Fictional, boolean Reinforced, int MaxRows, int Capacity) {
            name = Name;
            country = Country;
            year = Year;
            additionalTextTitle = AditionalTextTitle;
            additionalText = AditionalText;
            additionalTextTitle2 = AditionalText2Title;
            additionalText2 = AditionalText2;
            weightinKGs = (WeightinTons * 100);
            topSpeed = TopSpeed;
            fictional = Fictional;
            backTopSpeed = TopSpeed;
            reinforced = Reinforced;
            rows = MaxRows;
            tankcapacity = Capacity;
        }
    }
//todo add in all Traxx locomotive Types

    /**
     * A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
     */

    //BR01
    public static EntityData1 DBBR01() {
        return new EntityData1("DBBR01", "Germany", "1945-1973", "Steam",
                "", "", type, " Passenger Locomotive",
                39566f, 2240f, 108.9f, 130f, 50f, false, true, 0);
    }

    public static EntityData1 DBBR01NeuKessel() {
        return new EntityData1("DBBR01NeuKessel", "Germany", "1957-1973", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2330f, 111.1f, 130f, 50f, false, true, 0);
    }

    public static EntityData1 DBBR01NeuKesselOil() {
        return new EntityData1("DBBR01NeuKesselOil", "Germany", "1957-1973", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                33721f, 1330f, 111.1f, 130f, 50f, false, true, 0);
    }

    public static EntityData1 DBBR01_10Streamlined() {
        return new EntityData1("DBBR01_10Streamlined", "Germany", "1945-1953", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 150f, 50f, false, true, 0);
    }

    public static EntityData1 DBBR01Umbau() {
        return new EntityData1("DBBR01Umbau", "Germany", "1950-1968", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2450f, 111.2f, 130f, 50f, false, true, 0);
    }

    public static EntityData1 DBBR012() {
        return new EntityData1("DBBR01_10", "Germany", "1945-1953", "Steam",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 140f, 50f, false, true, 0);
    }

    public static EntityData1 DBBR012Oil() {
        return new EntityData1("DBBR01_10Oil", "Germany", "1945-1953", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 140f, 50f, false, true, 0);
    }

    public static EntityData1 DBBR012NeuKessel() {
        return new EntityData1("DBBR01_10NeuKessel", "Germany", "1953-1975", "Steam",
                "", "", type, " Passenger Locomotive",
                35070f, 2350f, 110.8f, 140f, 50f, false, true, 0);
    }

    public static EntityData1 DBBR012NeuKesselOil() {
        return new EntityData1("DBBR01_10NeuKesselOil", "Germany", "1953-1975", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                35070f, 2740f, 111.6f, 140f, 50f, false, true, 0);
    }

    //DR BR01's
    public static EntityData1 DRBR01() {
        return new EntityData1("DRBR01", "Germany", "1945-1982", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2240f, 108.9f, 130f, 50f, false, true, 0);
    }

    public static EntityData1 DRBR01_5() {
        return new EntityData1("DRBR01_5", "Germany", "1961-1991", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2500f, 111f, 130f, 50f, false, true, 0);
    }

    public static EntityData1 DRBR01_5SD() {
        return new EntityData1("DRBR01_5SD", "Germany", "1961-1991", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2500f, 111f, 130f, 50f, false, true, 0);
    }

    public static EntityData1 DRBR01_5Oil() {
        return new EntityData1("DRBR01_5Oil", "Germany", "1961-1991", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                33721f, 2500f, 111f, 130f, 50f, false, true, 0);
    }

    //DRG BR01's
    public static EntityData1 DRGBR01() {
        return new EntityData1("DRGBR01", "Germany", "1926-1945", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2210f, 108.9f, 130f, 50f, false, true, 0);
    }

    public static EntityData1 DRGBR01_850mm() {
        return new EntityData1("DRGBR01(850mm)", "Germany", "1926-1945", "Steam",
                "", "", type, " Passenger Locomotive",
                39566f, 2210f, 108.9f, 130f, 50f, false, true, 0);
    }

    public static EntityData1 DRGBR01_10Streamlined() {
        return new EntityData1("DRGBR01_10Streamlined", "Germany", "1937-1945", "Steam",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 150f, 50f, false, true, 0);
    }

    public static EntityData1 DRGBR01_10UnStreamlined() {
        return new EntityData1("DRGBR01_10UnStreamlined", "Germany", "1937-1945", "Steam",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 140f, 50f, false, true, 0);
    }

    //BR01 Witte Christmas
    public static EntityData1 DRBR01WitteChristmas() {
        return new EntityData1("ChristmasBR01Witte", "Germany", "1926-1982", "Steam",
                "", "", type, " Passenger Locomotive",
                0.0f, 2210f, 108.9f, 130f, 50f, false, true, 0);
    }

    //BR 798 / VT 98
    public static EntityData2 BR798() {
        return new EntityData2("VT98", "Germany", "1953-2000", "Diesel",
                nick, " VT 98", type, " Passenger Railbus",
                0f, 299.12f, 18.9f, 90f, false, true, 0);
    }

    //BR 798 / VT 98
    public static EntityData2 BR798Ads() {
        return new EntityData2("BR798Advertising", "Germany", "1953-2000", "Diesel",
                nick, " VT 98", type, " Passenger Railbus",
                0f, 299.12f, 18.9f, 90f, false, true, 0);
    }

    //Class 37
    public static EntityData2 Class37() {
        return new EntityData2("Class37", "United Kingdom", "1960-", "Diesel",
                nick, " Tractors", type, " Universal Locomotive",
                55000f, 1750f, 102f, 140f, false, true, 0);
    }

    //CR 812 "CRClass812"
    public static EntityData2 CR812() {
        return new EntityData2("Class812", "United Kingdom", "1899-1963", "Steam",
                nick, " Jumbos", type, " Universal Locomotive",
                20170f, 0f, 46.38f, 88.51f, false, true, 0);
    }

    //CR 812 Tender "Mcintosh3000Gallon"
    public static EntityData4 Mcintosh3000Galon() {
        return new EntityData4("Class812Tender", "United_Kingdom", "1899-1963", "",
                "", type, " Tender", 19.5f, 0f, false, true, 0, 300000);
    }


    //GE AC4400 CW
    public static EntityData2 GEAC4400CW() {
        return new EntityData2("GEAC4400CW", "America", "1993-", "Diesel",
                "", "", type, " Freight Locomotive",
                145000f, 4400f, 193f, 112f, false, true, 0);
    }

    //GWR 9400
    public static EntityData2 GWR9400() {
        return new EntityData2("GWR9400Class", "United Kingdom", "1947-1965", "Steam",
                "", "", type, " Shunting Locomotive",
                22515f, 0f, 56.2f, 72f, false, true, 0);
    }

    //KoF III 1
    public static EntityData2 KoFIII1() {
        return new EntityData2("KoFIII1", "Germany", "1959-", "Diesel",
                nick, " Klein Lokomotive", type, " Shunting Locomotive",
                18726.58f, 240f, 22f, 30f, false, true, 0);
    }

    //KoF III 2
    public static EntityData2 KoFIII2() {
        return new EntityData2("KoFIII2", "Germany", "1959-", "Diesel",
                nick, " Klein Lokomotive", type, " Shunting Locomotive",
                18726.58f, 240f, 22f, 30f, false, true, 0);
    }

    //MZ Class I
    public static EntityData2 MZI() {
        return new EntityData2("MZI", "Denmark", "1967-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //MZ Class II
    public static EntityData2 MZII() {
        return new EntityData2("MZII", "Denmark", "1970-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //MZ Class III
    public static EntityData2 MZIII() {
        return new EntityData2("MZIII", "Denmark", "1972-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3854f, 121.2f, 165f, false, true, 0);
    }

    //MZ Class IV
    public static EntityData2 MZIV() {
        return new EntityData2("MZIV", "Denmark", "1977-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3854f, 123f, 165f, false, true, 0);
    }

    //MZ Class Australia
    public static EntityData2 MZAustralia() {
        return new EntityData2("MZIII", "Australia", "1972-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3854f, 121.2f, 105f, false, true, 0);
    }


    //NE 81 / BR626
    public static EntityData2 NE81() {
        return new EntityData2("BR626", "Germany", "1981-1995", "Diesel",
                aditional, " BR 626", type, " Passenger Railbus",
                0f, 679.81f, 46.0f, 100f, false, true, 0);
    }

    //Sentinel 100 HP
    public static EntityData2 Sentinel100HP() {
        return new EntityData2("Sentinel100HP", "United Kingdom", "1931-1955", "Steam",
                "", "", type, " Shunting Locomotive",
                8870f, 100f, 19.3f, 33.8f, false, true, 0);
    }

    //Sentinel 100 HP
    public static EntityData2 Sentinel100HPChristmas() {
        return new EntityData2("Sentinel100HPChristmas", "United Kingdom", "1931-1955", "Steam",
                "", "", type, " Shunting Locomotive",
                8870f, 100f, 19.3f, 33.8f, false, true, 0);
    }


    //T32 Tender todo fix these stats
    public static EntityData3 T26() {
        return new EntityData3("T26", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender
    public static EntityData3 T32() {
        return new EntityData3("T32", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static EntityData3 T34() {
        return new EntityData3("T34", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static EntityData3 T34AditionalOil() {
        return new EntityData3("T34 Aditional Oil", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static EntityData3 T34Oil() {
        return new EntityData3("T34 Oil", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static EntityData3 T34Streamlined() {
        return new EntityData3("T34 Streamline", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static EntityData3 T34StreamlinedDRG() {
        return new EntityData3("T34 StreamlineDRG", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static EntityData3 T37() {
        return new EntityData3("T37", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static EntityData3 T37DRG() {
        return new EntityData3("T37DRG", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static EntityData3 T38() {
        return new EntityData3("T38", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static EntityData3 T38Oil() {
        return new EntityData3("T38Oil", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Christmas Tender
    public static EntityData3 T32TenderChristmas() {
        return new EntityData3("T322'2'Christmas", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    /**Traxx Program*/
    //F140 MS2E
    public static EntityData2 F140MS2E() {
        return new EntityData2("F140MS2E", "Europe", "2006-", "Electric",
                "", "", type, " Freight Locomotive",
                67442.68f, 7613.88f, 85.0f, 140f, false, true, 0);
    }

    public static EntityData2 BR145() {
        return new EntityData2("BR145", "Europe", "1997-", "Electric",
                "", "", type, " Universal Locomotive",
                67442.68f, 5710.41f, 80.0f, 140f, false, true, 0);
    }

    public static EntityData2 BR146() {
        return new EntityData2("BR146_0", "Europe", "1997-", "Electric",
                "", "", type, " Passenger Locomotive",
                67442.68f, 5710.41f, 82.0f, 160f, false, true, 0);
    }

    public static EntityData2 F140AC1() {
        return new EntityData2("F140AC1", "Europe", "1999-", "Electric",
                "", "", type, " Freight Locomotive",
                67000f, 7500f, 84.0f, 140f, false, true, 0);
    }

    public static EntityData2 P140AC1() {
        return new EntityData2("P140AC1", "Europe", "1999-", "Electric",
                "", "", type, " Passenger Locomotive",
                67000, 7500f, 84.0f, 140f, false, true, 0);
    }

    public static EntityData2 P160AC1() {
        return new EntityData2("P160AC1", "Europe", "1999-", "Electric",
                "", "", type, " Passenger Locomotive",
                67000f, 7500f, 84.0f, 160f, false, true, 0);
    }

    public static EntityData2 F140AC2() {
        return new EntityData2("F140AC2", "Europe", "2004-", "Electric",
                "", "", type, " Freight Locomotive",
                67000f, 7500f, 84.0f, 140f, false, true, 0);
    }
    //SSB Re 484 / F 140MS2
    public static EntityData2 F140MS2() {
        return new EntityData2("F140MS2", "Switzerland", "2004-", "Electric",
                aditional, " SSB Re 484", type, " Freight Locomotive",
                67000f, 7500f, 85.0f, 140f, false, true, 0);
    }

    public static EntityData2 F140DC2() {
        return new EntityData2("F140DC2", "Europe", "2006-", "Electric",
                "", "", type, " Freight Locomotive",
                67000f, 7500f, 81.0f, 140f, false, true, 0);
    }

    public static EntityData2 F140DE() {
        return new EntityData2("F140DE", "Europe", "2006-", "Diesel",
                "", "", type, " Passenger Locomotive",
                61000f, 3000f, 80.0f, 140f, false, true, 0);
    }

    public static EntityData2 P160DE() {
        return new EntityData2("P160DE", "Europe", "2006-", "Diesel",
                "", "", type, " Passenger Locomotive",
                61000f, 3000f, 80.0f, 160f, false, true, 0);
    }

    public static EntityData2 P160DEME() {
        return new EntityData2("P160DEME", "Europe", "2012-", "Diesel-Multi-Engine",
                "", "", type, " Passenger Locomotive",
                6744.26f, 3061.86f, 81.0f, 160f, false, true, 0);
    }
    /**end of traxx program.*/

    public static EntityData2 ES64U2() {
        return new EntityData2("ES64U2", "Europe", "1999-", "Electric",
                "", "", type, " Universal Locomotive",
                56202.23f, 8701.57f, 86.0f, 230f, false, true, 0);
    }

    public static EntityData2 ES64U4() {
        return new EntityData2("ES64U4", "Europe", "2005-", "Electric",
                "", "", type, " Universal Locomotive",
                67442.68f, 8701.57f, 87.0f, 357f, false, true, 0);
    }

    public static EntityData2 ES64F4() {
        return new EntityData2("ES64F4", "Europe", "2003-", "Electric",
                "", "", type, " Freight Locomotive",
                67442.68f, 8701.57f, 87.0f, 140f, false, true, 0);
    }

    //Wehrmachtslokomotive WR 360 C 14 / V36
    public static EntityData2 WR360C14() {
        return new EntityData2("WehrmachtslokomotiveWR360C14", "Germany", "1937-1950", "Diesel",
                aditional, " DB V36, DB BR236, DR BR103", type, " Shunting Locomotive",
                31473.3f, 360.3f, 43.0f, 60f, false, true, 0);
    }


    /**Rolling stock Declaration*/
    /**
     * A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
     */
    //DBpza
    public static EntityData3 DBpza() {
        return new EntityData3("Dobbelstock 4th generation", "Germany", "1997-", "",
                "", type, " Passenger", 47.5f, 140f, false, true, 0);
    }

    //Donderbus 1st class todo unfinished
    public static EntityData3 Donderbus1() {
        return new EntityData3("Donnerbüchse2ndclass", "Germany", "1921-1931", "",
                "", type, " Passenger", 19.6f, 120f, false, true, 0);
    }

    //Donderbus 2nd class todo unfinished
    public static EntityData3 Donderbus2() {
        return new EntityData3("Donnerbüchse3rdclass", "Europe", "1921-1931", "",
                "", type, " Passenger", 19.6f, 120f, false, true, 0);
    }

    //Donderbus 3rd class todo unfinished
    public static EntityData3 Donderbus3() {
        return new EntityData3("Donnerbüchse4thclass", "Europe", "1921-1931", "",
                "", type, " Passenger", 19.6f, 120f, false, true, 0);
    }

    //Eurofima with Compartments
    public static EntityData3 EurofimaCompartment() {
        return new EntityData3("EurofimaCompartments", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Rows
    public static EntityData3 EurofimaRows() {
        return new EntityData3("EurofimaOpenSeating", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Sleeperbeds
    public static EntityData3 EurofimaSleeper() {
        return new EntityData3("EurofimaSleeper", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //GWR Third
    public static EntityData3 GWRThirdOpen() {
        return new EntityData3("GWRBrunel3rdClass", "United Kingdom", "1838-1854", "",
                "", type, " Passenger Carriage", 9.5f, 0f, false, true, 0);
    }

    //GWR Third
    public static EntityData3 GWRThirdOpenChristmas() {
        return new EntityData3("GWRBrunel3rdClassChristmas", "United Kingdom", "1838-1854", "",
                "", type, " Passenger Carriage", 9.5f, 0f, false, true, 0);
    }

    //OFF52
    public static EntityData3 OFF52() {
        return new EntityData3("OFF52withbeetles", "Germany", "1954-1980", aditional,
                " Laae 540", type, " Freight Cars", 25.4f, 0, false, true, 0);
    }

    //Rheingold 1st Kitchen
    public static EntityData3 RheingoldKitchen1Christmas() {
        return new EntityData3("SA4uk28Christmas", "Germany", "1928-1939", aditional,
                " Rheingold 1st class dinnercar Christmas", type, " Passenger Dinner", 56.6f, 0f, false, true, 0);
    }

    //Rheingold 1st Salon
    public static EntityData3 RheingoldSalon1Christmas() {
        return new EntityData3("SA4u28Christmas", "Germany", "1928-1939", aditional,
                " Rheingold 1st class saloncar Christmas", type, " Passenger", 51.9f, 0f, false, true, 0);
    }

    //Rheingold 2nd Kitchen
    public static EntityData3 RheingoldKitchen2Christmas() {
        return new EntityData3("SB4uk28Christmas", "Germany", "1928-1939", aditional,
                " Rheingold 2nd class dinnercar Christmas", type, " Passenger Dinner", 55.5f, 0f, false, true, 0);
    }

    //Rheingold 2nd Salon
    public static EntityData3 RheingoldSalon2Christmas() {
        return new EntityData3("SB4u28Christmas", "Germany", "1928-1939", aditional,
                " Rheingold 2nd class saloncar Christmas", type, " Passenger", 52.8f, 0f, false, true, 0);
    }

    //Rheingold 1st Kitchen
    public static EntityData3 RheingoldKitchen1() {
        return new EntityData3("SA4uk28", "Germany", "1928-1939", aditional,
                " Rheingold 1st class dinnercar", type, " Passenger Dinner", 56.6f, 0f, false, true, 0);
    }

    //Rheingold 1st Salon
    public static EntityData3 RheingoldSalon1() {
        return new EntityData3("SA4u28", "Germany", "1928-1939", aditional,
                " Rheingold 1st class saloncar", type, " Passenger", 51.9f, 0f, false, true, 0);
    }

    //Rheingold 2nd Kitchen
    public static EntityData3 RheingoldKitchen2() {
        return new EntityData3("SB4uk28", "Germany", "1928-1939", aditional,
                " Rheingold 2nd class dinnercar", type, " Passenger Dinner", 55.5f, 0f, false, true, 0);
    }

    //Rheingold 2nd Salon
    public static EntityData3 RheingoldSalon2() {
        return new EntityData3("SB4u28", "Germany", "1928-1939", aditional,
                " Rheingold 2nd class saloncar", type, " Passenger", 52.8f, 0f, false, true, 0);
    }

    //Rheingold Baggagef
    public static EntityData3 RheingoldBaggage() {
        return new EntityData3("SPw4u28", "Germany", "1928-1939", aditional,
                " Rheingold baggagecar", type, " Passenger Baggage", 41.2f, 0f, false, true, 0);
    }

    //Sggnss 80 Load 1
    public static EntityData3 Sggnss80Load1() {
        return new EntityData3("SGNSS 80 Load 1", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0);
    }

    //Sggnss 80 Load 2
    public static EntityData3 Sggnss80Load2() {
        return new EntityData3("SGNSS 80 Load 2", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0);
    }

    //Sggnss 80 Load 3
    public static EntityData4 Sggnss80Load3() {
        return new EntityData4("SGNSS 80 Load 3", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0, 60000);
    }

    //Sggnss 80 Load 4
    public static EntityData4 Sggnss80Load4() {
        return new EntityData4("SGNSS 80 Load 4", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0, 60000);
    }

    //UK 6 Plank "6-Plankopenwagon"
    public static EntityData3 UKOpenWagon() {
        return new EntityData3("UKOpenwagon", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }


}
