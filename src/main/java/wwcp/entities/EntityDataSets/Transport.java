package wwcp.entities.EntityDataSets;

public class Transport {

    public static String era = "wwcp.era";
    public static String nick = "wwcp.nick";
    public static String type = "wwcp.type";
    public static String aditional = "wwcp.aditional";

    /**
     * Backspeed has to be known
     */
    public static class LocomotiveWithBackspeed {
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

        public LocomotiveWithBackspeed(String Name, String Country, String Year, String Fuel, String AditionalTextTitle, String AditionalText, String AditionalText2Title, String AditionalText2,
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
    public static class LocomotiveNoBackspeed {
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

        public LocomotiveNoBackspeed(String Name, String Country, String Year, String Fuel, String AditionalTextTitle, String AditionalText, String AditionalText2Title, String AditionalText2,
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
    public static class Rollingstock {
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

        public Rollingstock(String Name, String Country, String Year, String AditionalTextTitle, String AditionalText, String AditionalText2Title,
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
    public static class TankCars {
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

        public TankCars(String Name, String Country, String Year, String AditionalTextTitle, String AditionalText, String AditionalText2Title,
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

    //BR01
    public static Transport.LocomotiveWithBackspeed DBBR01() {
        return new Transport.LocomotiveWithBackspeed("DBBR01", "Germany", "1945-1973", "Steam",
                "", "", type, " Passenger Locomotive",
                39566f, 2240f, 108.9f, 130f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DBBR01NeuKessel() {
        return new Transport.LocomotiveWithBackspeed("DBBR01NeuKessel", "Germany", "1957-1973", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2330f, 111.1f, 130f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DBBR01NeuKesselOil() {
        return new Transport.LocomotiveWithBackspeed("DBBR01NeuKesselOil", "Germany", "1957-1973", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                33721f, 1330f, 111.1f, 130f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DBBR01_10Streamlined() {
        return new Transport.LocomotiveWithBackspeed("DBBR01_10Streamlined", "Germany", "1945-1953", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 150f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DBBR01Umbau() {
        return new Transport.LocomotiveWithBackspeed("DBBR01Umbau", "Germany", "1950-1968", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2450f, 111.2f, 130f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DBBR012() {
        return new Transport.LocomotiveWithBackspeed("DBBR01_10", "Germany", "1945-1953", "Steam",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 140f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DBBR012Oil() {
        return new Transport.LocomotiveWithBackspeed("DBBR01_10Oil", "Germany", "1945-1953", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 140f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DBBR012NeuKessel() {
        return new Transport.LocomotiveWithBackspeed("DBBR01_10NeuKessel", "Germany", "1953-1975", "Steam",
                "", "", type, " Passenger Locomotive",
                35070f, 2350f, 110.8f, 140f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DBBR012NeuKesselOil() {
        return new Transport.LocomotiveWithBackspeed("DBBR01_10NeuKesselOil", "Germany", "1953-1975", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                35070f, 2740f, 111.6f, 140f, 50f, false, true, 0);
    }

    //DR BR01's
    public static Transport.LocomotiveWithBackspeed DRBR01() {
        return new Transport.LocomotiveWithBackspeed("DRBR01", "Germany", "1945-1982", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2240f, 108.9f, 130f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DRBR01_5() {
        return new Transport.LocomotiveWithBackspeed("DRBR01_5", "Germany", "1961-1991", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2500f, 111f, 130f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DRBR01_5SD() {
        return new Transport.LocomotiveWithBackspeed("DRBR01_5SD", "Germany", "1961-1991", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2500f, 111f, 130f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DRBR01_5Oil() {
        return new Transport.LocomotiveWithBackspeed("DRBR01_5Oil", "Germany", "1961-1991", "Steam (Oil)",
                "", "", type, " Passenger Locomotive",
                33721f, 2500f, 111f, 130f, 50f, false, true, 0);
    }

    //DRG BR01's
    public static Transport.LocomotiveWithBackspeed DRGBR01() {
        return new Transport.LocomotiveWithBackspeed("DRGBR01", "Germany", "1926-1945", "Steam",
                "", "", type, " Passenger Locomotive",
                33721f, 2210f, 108.9f, 130f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DRGBR01_850mm() {
        return new Transport.LocomotiveWithBackspeed("DRGBR01(850mm)", "Germany", "1926-1945", "Steam",
                "", "", type, " Passenger Locomotive",
                39566f, 2210f, 108.9f, 130f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DRGBR01_10Streamlined() {
        return new Transport.LocomotiveWithBackspeed("DRGBR01_10Streamlined", "Germany", "1937-1945", "Steam",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 150f, 50f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DRGBR01_10UnStreamlined() {
        return new Transport.LocomotiveWithBackspeed("DRGBR01_10UnStreamlined", "Germany", "1937-1945", "Steam",
                "", "", type, " Passenger Locomotive",
                35070f, 2120f, 114.3f, 140f, 50f, false, true, 0);
    }

    //BR01 Witte Christmas
    public static Transport.LocomotiveWithBackspeed DRBR01WitteChristmas() {
        return new Transport.LocomotiveWithBackspeed("ChristmasBR01Witte", "Germany", "1926-1982", "Steam",
                "", "", type, " Passenger Locomotive",
                0.0f, 2210f, 108.9f, 130f, 50f, false, true, 0);
    }

    //BR 798 / VT 98
    public static Transport.LocomotiveNoBackspeed BR798() {
        return new Transport.LocomotiveNoBackspeed("VT98", "Germany", "1953-2000", "Diesel",
                nick, " VT 98", type, " Passenger Railbus",
                0f, 299.12f, 18.9f, 90f, false, true, 0);
    }

    //BR 798 / VT 98
    public static Transport.LocomotiveNoBackspeed BR798Ads() {
        return new Transport.LocomotiveNoBackspeed("BR798Advertising", "Germany", "1953-2000", "Diesel",
                nick, " VT 98", type, " Passenger Railbus",
                0f, 299.12f, 18.9f, 90f, false, true, 0);
    }

    //Class 37
    public static Transport.LocomotiveNoBackspeed Class37() {
        return new Transport.LocomotiveNoBackspeed("Class37", "United Kingdom", "1960-", "Diesel",
                nick, " Tractors", type, " Universal Locomotive",
                55000f, 1750f, 102f, 140f, false, true, 0);
    }

    //CR C812 "CRClass812"
    public static Transport.LocomotiveNoBackspeed CR812() {
        return new Transport.LocomotiveNoBackspeed("Class812", "United Kingdom", "1899-1963", "Steam",
                nick, " Jumbos", type, " Universal Locomotive",
                20170f, 0f, 46.38f, 88.51f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed ES64U2() {
        return new Transport.LocomotiveNoBackspeed("ES64U2", "Europe", "2000-", "Electric",
                nick, " Taurus", type, " Universal Locomotive",
                67000.0f, 8600.0f, 86.0f, 230f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed ES64U4() {
        return new Transport.LocomotiveNoBackspeed("ES64U4", "Europe", "2005-", "Electric",
                nick, " Taurus", type, " Universal Locomotive",
                67000.0f, 8600.0f, 87.0f, 230f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed ES64U4Record() {
        return new Transport.LocomotiveNoBackspeed("ES64U4", "Europe", "2006-", "Electric",
                nick, " World Speed Record Taurus", type, " Universal Locomotive",
                67000.0f, 8600.0f, 87.0f, 357f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed ES64F4() {
        return new Transport.LocomotiveNoBackspeed("ES64F4", "Europe", "2003-", "Electric",
                "", "", type, " Freight Locomotive",
                67000.0f, 8600.0f, 87.0f, 140f, false, true, 0);
    }

    //F7A
    public static Transport.LocomotiveNoBackspeed F7A() {
        return new Transport.LocomotiveNoBackspeed("F7A", "America", "1949-Present", "Diesel",
                nick, "", type, " Freight Locomotive",
                40000f, 1500f, 123.7f, 105f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed FP7A() {
        return new Transport.LocomotiveNoBackspeed("FP7A", "America", "1949-Present", "Diesel",
                nick, "", type, " Freight Locomotive",
                40000f, 1500f, 123.7f, 105f, false, true, 0);
    }

    //F7B
    public static Transport.TankCars F7B() {
        return new Transport.TankCars("F7B", "America", "1949-Present", "",
                "", type, " B-Unit", 114f, 105f, false, true, 0, 60000);
    }

    //CR C812 Tender "Mcintosh3000Gallon"
    public static Transport.TankCars Mcintosh3000Galon() {
        return new Transport.TankCars("Class812Tender", "United_Kingdom", "1899-1963", "",
                "", type, " Tender", 19.5f, 0f, false, true, 0, 300000);
    }

    //CR C812 Tender "Mcintosh3000Gallon"
    public static Transport.TankCars MakeshiftTender() {
        return new Transport.TankCars("MakeshiftTender", "United_Kingdom", "1899-1963", "",
                "", type, " Tender", 19.5f, 0f, false, true, 0, 300000);
    }

    //GE AC4400 CW
    public static Transport.LocomotiveNoBackspeed GEAC4400CW() {
        return new Transport.LocomotiveNoBackspeed("GEAC4400CW", "America", "1993-", "Diesel",
                "", "", type, " Freight Locomotive",
                145000f, 4400f, 193f, 112f, false, true, 0);
    }

    //GP7
    public static Transport.LocomotiveNoBackspeed GP7() {
        return new Transport.LocomotiveNoBackspeed("GP7", "America", "1949-Present", "Diesel",
                nick, "", type, " Freight Locomotive",
                40000f, 1500f, 123f, 105f, false, true, 0);
    }

    //GWR 9400
    public static Transport.LocomotiveNoBackspeed GWR9400() {
        return new Transport.LocomotiveNoBackspeed("GWR9400Class", "United Kingdom", "1947-1965", "Steam",
                "", "", type, " Shunting Locomotive",
                22515f, 0f, 56.2f, 72f, false, true, 0);
    }

    //KoF III 1
    public static Transport.LocomotiveNoBackspeed KoFIII1() {
        return new Transport.LocomotiveNoBackspeed("KoFIII1", "Germany", "1959-", "Diesel",
                nick, " Klein Lokomotive", type, " Shunting Locomotive",
                18726.58f, 240f, 22f, 30f, false, true, 0);
    }

    //KoF III 2
    public static Transport.LocomotiveNoBackspeed KoFIII2() {
        return new Transport.LocomotiveNoBackspeed("KoFIII2", "Germany", "1959-", "Diesel",
                nick, " Klein Lokomotive", type, " Shunting Locomotive",
                18726.58f, 240f, 22f, 30f, false, true, 0);
    }

    //MZ Class I
    public static Transport.LocomotiveNoBackspeed MZI() {
        return new Transport.LocomotiveNoBackspeed("MZI", "Denmark", "1967-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //MZ Class I 1967
    public static Transport.LocomotiveNoBackspeed MZI1967() {
        return new Transport.LocomotiveNoBackspeed("MZI1967", "Denmark", "1967-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);

    }

    //MZ Class II
    public static Transport.LocomotiveNoBackspeed MZII() {
        return new Transport.LocomotiveNoBackspeed("MZII", "Denmark", "1970-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //MZ Class II 1970
    public static Transport.LocomotiveNoBackspeed MZII1970() {
        return new Transport.LocomotiveNoBackspeed("MZII1970", "Denmark", "1970-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //MZ Class III
    public static Transport.LocomotiveNoBackspeed MZIII() {
        return new Transport.LocomotiveNoBackspeed("MZIII", "Denmark", "1972-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3854f, 121.2f, 165f, false, true, 0);
    }

    //MZ Class IV
    public static Transport.LocomotiveNoBackspeed MZIV() {
        return new Transport.LocomotiveNoBackspeed("MZIV", "Denmark", "1977-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3854f, 123f, 165f, false, true, 0);
    }

    //MZ Class Australia
    public static Transport.LocomotiveNoBackspeed MZAustralia() {
        return new Transport.LocomotiveNoBackspeed("MZIII", "Australia", "1972-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3854f, 121.2f, 105f, false, true, 0);
    }


    //NE 81 / BR626
    public static Transport.LocomotiveNoBackspeed NE81() {
        return new Transport.LocomotiveNoBackspeed("BR626", "Germany", "1981-1995", "Diesel",
                aditional, " BR 626", type, " Passenger Railbus",
                0f, 679.81f, 46.0f, 100f, false, true, 0);
    }

    //Sentinel 100 HP
    public static Transport.LocomotiveNoBackspeed Sentinel100HP() {
        return new Transport.LocomotiveNoBackspeed("Sentinel100HP", "United Kingdom", "1931-1955", "Steam",
                "", "", type, " Shunting Locomotive",
                8870f, 100f, 19.3f, 33.8f, false, true, 0);
    }

    //Sentinel 100 HP
    public static Transport.LocomotiveNoBackspeed Sentinel100HPChristmas() {
        return new Transport.LocomotiveNoBackspeed("Sentinel100HPChristmas", "United Kingdom", "1931-1955", "Steam",
                "", "", type, " Shunting Locomotive",
                8870f, 100f, 19.3f, 33.8f, false, true, 0);
    }

    //todo fix these stats
    public static Transport.LocomotiveNoBackspeed Modular_0_4_0() {
        return new Transport.LocomotiveNoBackspeed("Modular040", "United Kingdom", "1931-1955", "Steam",
                "", "", type, " Shunting Locomotive",
                8870f, 100f, 19.3f, 33.8f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Transport.Rollingstock T26() {
        return new Transport.Rollingstock("T26", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender
    public static Transport.Rollingstock T32() {
        return new Transport.Rollingstock("T32", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Transport.Rollingstock T34() {
        return new Transport.Rollingstock("T34", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Transport.Rollingstock T34AditionalOil() {
        return new Transport.Rollingstock("T34 Aditional Oil", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Transport.Rollingstock T34Oil() {
        return new Transport.Rollingstock("T34 Oil", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Transport.Rollingstock T34Streamlined() {
        return new Transport.Rollingstock("T34 Streamline", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Transport.Rollingstock T34StreamlinedDRG() {
        return new Transport.Rollingstock("T34 StreamlineDRG", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Transport.Rollingstock T37() {
        return new Transport.Rollingstock("T37", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Transport.Rollingstock T37DRG() {
        return new Transport.Rollingstock("T37DRG", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Transport.Rollingstock T38() {
        return new Transport.Rollingstock("T38", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Tender todo fix these stats
    public static Transport.Rollingstock T38Oil() {
        return new Transport.Rollingstock("T38Oil", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    //T32 Christmas Tender
    public static Transport.Rollingstock T32TenderChristmas() {
        return new Transport.Rollingstock("T322'2'Christmas", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
    }

    /**
     * Traxx Program
     */
    //F140 MS2E
    public static Transport.LocomotiveNoBackspeed F140MS2E() {
        return new Transport.LocomotiveNoBackspeed("F140MS2E", "Europe", "2006-", "Electric",
                "", "", type, " Freight Locomotive",
                67442.68f, 7613.88f, 85.0f, 140f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed BR145() {
        return new Transport.LocomotiveNoBackspeed("BR145", "Europe", "1997-", "Electric",
                "", "", type, " Universal Locomotive",
                67442.68f, 5710.41f, 80.0f, 140f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed BR146() {
        return new Transport.LocomotiveNoBackspeed("BR146_0", "Europe", "1997-", "Electric",
                "", "", type, " Passenger Locomotive",
                67442.68f, 5710.41f, 82.0f, 160f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed F140AC1() {
        return new Transport.LocomotiveNoBackspeed("F140AC1", "Europe", "1999-", "Electric",
                "", "", type, " Freight Locomotive",
                67000f, 7500f, 84.0f, 140f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed P140AC1() {
        return new Transport.LocomotiveNoBackspeed("P140AC1", "Europe", "1999-", "Electric",
                "", "", type, " Passenger Locomotive",
                67000, 7500f, 84.0f, 140f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed P160AC1() {
        return new Transport.LocomotiveNoBackspeed("P160AC1", "Europe", "1999-", "Electric",
                "", "", type, " Passenger Locomotive",
                67000f, 7500f, 84.0f, 160f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed F140AC2() {
        return new Transport.LocomotiveNoBackspeed("F140AC2", "Europe", "2004-", "Electric",
                "", "", type, " Freight Locomotive",
                67000f, 7500f, 84.0f, 140f, false, true, 0);
    }

    //SSB Re 484 / F 140MS2
    public static Transport.LocomotiveNoBackspeed F140MS2() {
        return new Transport.LocomotiveNoBackspeed("F140MS2E", "Switzerland", "2004-", "Electric",
                aditional, " SSB Re 484", type, " Freight Locomotive",
                67000f, 7500f, 85.0f, 140f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed F140DC2() {
        return new Transport.LocomotiveNoBackspeed("F140DC2", "Europe", "2006-", "Electric",
                "", "", type, " Freight Locomotive",
                67000f, 7500f, 81.0f, 140f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed F140DE() {
        return new Transport.LocomotiveNoBackspeed("F140DE", "Europe", "2006-", "Diesel",
                "", "", type, " Passenger Locomotive",
                61000f, 3000f, 80.0f, 140f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed P160DE() {
        return new Transport.LocomotiveNoBackspeed("P160DE", "Europe", "2006-", "Diesel",
                "", "", type, " Passenger Locomotive",
                61000f, 3000f, 80.0f, 160f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed P160DEME() {
        return new Transport.LocomotiveNoBackspeed("P160DEME", "Europe", "2012-", "Diesel-Multi-Engine",
                "", "", type, " Passenger Locomotive",
                6744.26f, 3061.86f, 81.0f, 160f, false, true, 0);
    }

    /**
     * end of traxx program.
     */


    //Wehrmachtslokomotive WR 360 C 14 / V36
    public static Transport.LocomotiveNoBackspeed WR360C14() {
        return new Transport.LocomotiveNoBackspeed("WehrmachtslokomotiveWR360C14", "Germany", "1937-1950", "Diesel",
                aditional, " DB V36, DB BR236, DR BR103", type, " Shunting Locomotive",
                31473.3f, 360.3f, 43.0f, 60f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed WR360C14Kanzel() {
        return new Transport.LocomotiveNoBackspeed("WehrmachtslokomotiveWR360C14Kanzel", "Germany", "1937-1950", "Diesel",
                aditional, " DB V36, DB BR236, DR BR103", type, " Shunting Locomotive",
                31473.3f, 360.3f, 43.0f, 60f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed WR360C14Electric() {
        return new Transport.LocomotiveNoBackspeed("WehrmachtslokomotiveWR360C14Electric", "Germany", "1937-1950", "Electric",
                aditional, " DB V36, DB BR236, DR BR103", type, " Shunting Locomotive",
                31473.3f, 360.3f, 43.0f, 60f, false, true, 0);
    }

    //DBpza //todo unfinished
    public static Transport.Rollingstock ACF_60Seat() {
        return new Transport.Rollingstock("ACF_60Seat", "Germany", "1997-", "",
                "", type, " Passenger", 47.5f, 140f, false, true, 0);
    }

    //DBpza //todo unfinished
    public static Transport.Rollingstock GWR_Toad20() {
        return new Transport.Rollingstock("GWRToad20", "Germany", "1997-", "",
                "", type, " Passenger", 47.5f, 140f, false, true, 0);
    }

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

    //Ealos-x 053
    public static Transport.Rollingstock EalosX() {
        return new Transport.Rollingstock("Ealos-X", "Europe", "1996-", "",
                "", type, "Freight Loose", 24.3f, 120f, false, true, 0);
    }

    //Eurofima with Compartments
    public static Transport.Rollingstock Amfleet1() {
        return new Transport.Rollingstock("Amfleet1", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Compartments
    public static Transport.Rollingstock EurofimaCompartment1() {
        return new Transport.Rollingstock("EurofimaCompartments1", "Europe", "1977-", "",
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

    //UK Windcutter
    public static Transport.Rollingstock UKOpenWagon2() {
        return new Transport.Rollingstock("UK Windcutter", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }

    //UK Van
    public static Transport.Rollingstock UKVan() {
        return new Transport.Rollingstock("UKVan", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 12f, 0f, false, true, 0);
    }

    //UK Flatbed
    public static Transport.Rollingstock UKFlatbed() {
        return new Transport.Rollingstock("UKFlatbed", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }
    //todo fix stats
    public static Transport.Rollingstock Chaldron() {
        return new Transport.Rollingstock("Chaldron", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }

    //UK Tanker
    public static Transport.TankCars UKTanker() {
        return new Transport.TankCars("UKTanker", "United Kingdom", "1930-1959", "",
                "", type, " Tank wagon", 12f, 0f, false, true, 0,  9000);
    }

    //Zacns 95
    public static Transport.TankCars Zacns95() {
        return new Transport.TankCars("Zacns 95", "Europe", "2006-", "",
                "", type, " Tank wagon", 24.4f, 120f, false, true, 0, 60000);
    }

    //60' Hi Cube Plate F Boxcar
    public static Transport.Rollingstock Hi_Cube_Plate_F_Boxcar() {
        return new Transport.Rollingstock("60' Hi Cube Plate F Boxcar", "America", "?", "",
                "", type, " Boxcar", 80.9f, 120f, false, true, 0);
    }

    //40ft Boxcar
    public static Transport.Rollingstock Fortyfoot_Boxcar() {
        return new Transport.Rollingstock("40ft Boxcar", "America", "?", "",
                "", type, " Boxcar", 48f, 120f, false, true, 0);
    }

    public static Transport.Rollingstock GSC_Flatcar() {
        return new Transport.Rollingstock("GSCFlatcar", "America", "1956", "",
                "", type, " Flatcar", 75f, 0f, false, true, 0);
    }

    public static Transport.Rollingstock Flatcar_89ft() {
        return new Transport.Rollingstock("89ftFlatCar", "America", "1956", "",
                "", type, " Flatcar", 75f, 0f, false, true, 0);
    }

    public static Transport.Rollingstock Autorack_89ft_BiLevel() {
        return new Transport.Rollingstock("89ftBiLevelAutoRack", "America", "1956", "",
                "", type, " Autorack", 75f, 0f, false, true, 0);
    }

    public static Transport.Rollingstock GSC_FlatcarBulkhead() {
        return new Transport.Rollingstock("GSCFlatcarBulkhead", "America", "1956", "",
                "", type, " Flatcar", 75f, 0f, false, true, 0);
    }

    public static Transport.Rollingstock GSC_FlatcarBulkheadLate() {
        return new Transport.Rollingstock("GSCFlatcarBulkheadLate", "America", "1956", "",
                "", type, " Flatcar", 75f, 0f, false, true, 0);
    }

    //Habbiins_14
    public static Transport.Rollingstock Habbiins_14() {
        return new Transport.Rollingstock("Habbiins_14", "Europe", "1990s", "",
                "", type, " Boxcar", 26f, 120f, false, true, 0);
    }

    //Habbiins_17
    public static Transport.Rollingstock Habbiins_17() {
        return new Transport.Rollingstock("Habbiins_17", "Europe", "1990s", "",
                "", type, " Boxcar", 26f, 120f, false, true, 0);
    }

    //Hbbins
    public static Transport.Rollingstock Hbbins() {
        return new Transport.Rollingstock("Hbbins", "Europe", "1990s", "",
                "", type, " Boxcar", 15f, 120f, false, true, 0);
    }

    //Hbbillns
    public static Transport.Rollingstock Hbbillns() {
        return new Transport.Rollingstock("Hbbillns", "Europe", "1990s", "",
                "", type, " Boxcar", 15f, 120f, false, true, 0);
    }

    //Sggnss 60 3 TATEU
    public static Transport.TankCars Sgnss60Load1() {
        return new Transport.TankCars("SGNSS 60 3 TATEU", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0, 60000);
    }

    //Sggnss 60 2 TATEU
    public static Transport.TankCars Sgnss60Load2() {
        return new Transport.TankCars("SGNSS 60 2 TATEU", "Europe", "2006-", "",
                "", type, " Freight Container", 21.5f, 120f, false, true, 0, 60000);
    }

    //todo fix these stats once advent is over.
    public static Transport.TankCars ACF_Single_Dome_Tankcar() {
        return new Transport.TankCars("ACF_Single_Dome", "America", "1930-1959", "",
                "", type, " Tank wagon", 12f, 0f, false, true, 0,  9000);
    }

    //todo fix these stats once advent is over.
    public static Transport.TankCars DSBCarE() {
        return new Transport.TankCars("DBSE", "Denmark", "1930-1959", "",
                "", type, " Freight loose", 12f, 0f, false, true, 0,  9000);
    }
}


