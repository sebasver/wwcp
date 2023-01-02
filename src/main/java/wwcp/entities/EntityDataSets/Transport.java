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

    //BR50
    public static Transport.LocomotiveWithBackspeed DBBR50() {
        return new Transport.LocomotiveWithBackspeed("DBBR50", "Germany", "1939-1987", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1625f, 86.9f, 80f, 80f, false, true, 0);
    }

    public static Transport.LocomotiveWithBackspeed DBBR50_40() {
        return new Transport.LocomotiveWithBackspeed("DBBR50_40", "Germany", "1954-1967", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1520f, 90.6f, 80f, 80f, false, true, 0);
    }//noted in KN Tractive effort.

    public static Transport.LocomotiveWithBackspeed DRBR50() {
        return new Transport.LocomotiveWithBackspeed("DRBR50", "Germany", "1939-1987", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1625f, 86.9f, 80f, 80f, false, true, 0);
    }
    public static Transport.LocomotiveWithBackspeed DRBR50_35() {
        return new Transport.LocomotiveWithBackspeed("DRBR50_35", "Germany", "1956-1989", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1760f, 88.2f, 80f, 80f, false, true, 0);
    }
    public static Transport.LocomotiveWithBackspeed DRBR50_40() {
        return new Transport.LocomotiveWithBackspeed("DRBR50_40", "Germany", "1956-1980", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1760f, 85.9f, 80f, 80f, false, true, 0);
    }
    public static Transport.LocomotiveWithBackspeed DRBR50_50() {
        return new Transport.LocomotiveWithBackspeed("DRBR50_50", "Germany", "1966-1981", "Steam (Oil)",
                "", "", type, " Freight Locomotive",
                48109f, 1760f, 88.2f, 80f, 80f, false, true, 0);
    }
    public static Transport.LocomotiveWithBackspeed DRGBR50() {
        return new Transport.LocomotiveWithBackspeed("DRGBR50", "Germany", "1939-1987", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1625f, 86.9f, 80f, 80f, false, true, 0);
    }
    public static Transport.LocomotiveWithBackspeed DRGBR50Kriegslok() {
        return new Transport.LocomotiveWithBackspeed("DRGBR50kriegslok", "Germany", "1939-1960", "Steam",
                "", "", type, " Freight Locomotive",
                48109f, 1760f, 80.9f, 80f, 80f, false, true, 0);
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

    //todo Stats Steeple
    public static Transport.LocomotiveNoBackspeed SteepleCab() {
        return new Transport.LocomotiveNoBackspeed("SteepleCab", "Switzerland", "1961-1999", "Electric",
                nick, "RABe EC", type, " Passenger Multiple Unit Locomotive",
                18300f, 3100f, 51.8f, 160f, false, true, 0);
    }

    //class 87
    public static Transport.LocomotiveNoBackspeed Class87() {
        return new Transport.LocomotiveNoBackspeed("Class87", "United Kingdom", "1973-Present", "Electric",
                nick, "", type, " Passenger Locomotive",
                58000f, 5000f, 81f, 180f, false, true, 0);
    }


    public static Transport.LocomotiveNoBackspeed TEERAeSteurWagen() {
        return new Transport.LocomotiveNoBackspeed("RaeTEEIISteuer", "Switzerland", "1961-1999", "Electric",
                nick, "RABe EC", type, " Passenger Multiple Unit Locomotive",
                18300f, 3100f, 51.8f, 160f, false, true, 0);
    }

    //todo TEE bar car
    public static Transport.Rollingstock TEESchweizzBarCar() {
        return new Transport.Rollingstock("TEESchweizzBarCar", "Europe", "1977-Present", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed V200() {
        return new Transport.LocomotiveNoBackspeed("V200", "Germany", "1953-Present", "Diesel",
                nick, " Taurus", type, " Universal Locomotive",
                39791f, 2170f, 80.0f, 140f, false, true, 0);
    }

    //Class 37
    public static Transport.LocomotiveNoBackspeed Class37() {
        return new Transport.LocomotiveNoBackspeed("Class37", "United Kingdom", "1960-Present", "Diesel",
                nick, " Tractors", type, " Universal Locomotive",
                55000f, 1750f, 102f, 140f, false, true, 0);
    }

    //CR C812 "CRClass812"
    public static Transport.LocomotiveNoBackspeed CR812() {
        return new Transport.LocomotiveNoBackspeed("Class812", "United Kingdom", "1899-1963", "Steam",
                nick, " Jumbos", type, " Universal Locomotive",
                20170f, 0f, 46.38f, 88.51f, false, true, 0);
    }

    //E44
    public static Transport.LocomotiveNoBackspeed E44DB() {
        return new Transport.LocomotiveNoBackspeed("E44DB", "Germany", "1932-1991", "Electric",
                nick, "", type, " Passenger Locomotive",
                44062.5f, 2528.9f, 78.0f, 90f, false, true, 0);
    }

    //E94
    public static Transport.LocomotiveNoBackspeed E94() {
        return new Transport.LocomotiveNoBackspeed("E94", "Europe", "1940-1995", "Electric",
                nick, " Green Crocodile", type, " Freight Locomotive",
                40000.0f, 4429.0f, 118.5f, 100f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed ES64U2() {
        return new Transport.LocomotiveNoBackspeed("ES64U2", "Europe", "2000-Present", "Electric",
                nick, " Taurus", type, " Universal Locomotive",
                67000.0f, 8600.0f, 86.0f, 230f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed ES64U4() {
        return new Transport.LocomotiveNoBackspeed("ES64U4", "Europe", "2005-Present", "Electric",
                nick, " Taurus", type, " Universal Locomotive",
                67000.0f, 8600.0f, 87.0f, 230f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed ES64U4Record() {
        return new Transport.LocomotiveNoBackspeed("ES64U4", "Europe", "2006-Present", "Electric",
                nick, " World Speed Record Taurus", type, " Universal Locomotive",
                67000.0f, 8600.0f, 87.0f, 357f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed ES64F4() {
        return new Transport.LocomotiveNoBackspeed("ES64F4", "Europe", "2003-Present", "Electric",
                "", "", type, " Freight Locomotive",
                67000.0f, 8600.0f, 87.0f, 140f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed DSBClassEA() {
        return new Transport.LocomotiveNoBackspeed("Class EA", "Denmark, Bulgaria, Romainia", "1984-", "Electric",
                "", "", type, " Universal Locomotive",
                45000.0f, 5030.0f, 84.0f, 175f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed F40ph() {
        return new Transport.LocomotiveNoBackspeed("F40PH", "America", "1949-Present", "Diesel",
                nick, "", type, " Freight Locomotive",
                40000f, 1500f, 123.7f, 105f, false, true, 0);
    }

    //BL2
    public static Transport.LocomotiveNoBackspeed BL2() {
        return new Transport.LocomotiveNoBackspeed("BL2", "America", "1948-Present", "Diesel",
                nick, "", type, " Universal Locomotive",
                56200f, 1500f, 104.32f, 105f, false, true, 0);
    }

    //CPA-16-4
    public static Transport.LocomotiveNoBackspeed CPA164() {
        return new Transport.LocomotiveNoBackspeed("CPA-16-4", "Canada", "1955-1975", "Diesel",
                nick, "", type, " Freight Locomotive",
                50000f, 1600f, 120.7f, 105f, false, true, 0);
    }

    //CFA-16-4
    public static Transport.LocomotiveNoBackspeed CFA164() {
        return new Transport.LocomotiveNoBackspeed("CFA-16-4", "America", "1955-1975", "Diesel",
                nick, "", type, " Freight Locomotive",
                50000f, 1600f, 120.7f, 105f, false, true, 0);
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

    //todo G4200
    public static Transport.TankCars G4200() {
        return new Transport.TankCars("G4200", "United_Kingdom", "1899-1963", "",
                "", type, " Tender", 19.5f, 0f, false, true, 0, 300000);
    }

    //todo vanderbuilt
    public static Transport.TankCars VanderBuilt() {
        return new Transport.TankCars("VanderBuilt", "Canada", "1899-1963", "",
                "", type, " Tender", 19.5f, 0f, false, true, 0, 300000);
    }

    //CR C812 Tender "Mcintosh3000Gallon"
    public static Transport.TankCars MakeshiftTender() {
        return new Transport.TankCars("MakeshiftTender", "United_Kingdom", "1899-1963", "",
                "", type, " Tender", 19.5f, 0f, false, true, 0, 300000);
    }

    //todo U1F
    public static Transport.LocomotiveNoBackspeed U1F() {
        return new Transport.LocomotiveNoBackspeed("U1F", "Canada", "1956-1993", "Diesel",
                "", "", type, " Road Switcher",
                53000f, 1800f, 124f, 80f, false, true, 0);
    }

    //RS3
    public static Transport.LocomotiveNoBackspeed RS3() {
        return new Transport.LocomotiveNoBackspeed("RS3", "America", "1950-Present", "Diesel",
                "", "", type, " Road Switcher",
                61775f, 1600f, 123.6f, 120f, false, true, 0);
    }
    //RS23
    public static Transport.LocomotiveNoBackspeed RS23() {
        return new Transport.LocomotiveNoBackspeed("RS23", "Canada", "1959-Present", "Diesel",
                "", "", type, " Road Switcher",
                53000f, 1000f, 123.3f, 120f, false, true, 0);
    }

    //RS18
    public static Transport.LocomotiveNoBackspeed RS18() {
        return new Transport.LocomotiveNoBackspeed("RS18", "Canada", "1956-1993", "Diesel",
                "", "", type, " Road Switcher",
                53000f, 1800f, 124f, 120f, false, true, 0);
    }

    //Highliner
    public static Transport.LocomotiveNoBackspeed HiglinerLocomotive() {
        return new Transport.LocomotiveNoBackspeed("Highliner Locomotive", "America", "1971-2016", "Electric",
                "", "", type, " Cab Car",
                25000f, 1800f, 70.5f, 130f, false, true, 0);
    }

    //AEM-7
    public static Transport.LocomotiveNoBackspeed AEM7() {
        return new Transport.LocomotiveNoBackspeed("AEM7", "America", "1966-", "Electric",
                "", "", type, " Passenger Locomotive",
                28100f, 7000f, 92f, 125f, false, true, 0);
    }

    //U33B
    public static Transport.LocomotiveNoBackspeed U33B() {
        return new Transport.LocomotiveNoBackspeed("U33B", "America", "1966-2005", "Diesel",
                "", "", type, "Universal locomotive",
                64000f, 3300f, 127.4f, 112.6f, false, true, 0);
    }

    //B30-7a
    public static Transport.LocomotiveNoBackspeed B307a() {
        return new Transport.LocomotiveNoBackspeed("B307a", "America", "1977-Present", "Diesel",
                "", "", type, "Road Switcher",
                63250f, 3000f, 129.4f, 112.6f, false, true, 0);
    }

    //M640 - Note, Incomplete until I find the data
    public static Transport.LocomotiveNoBackspeed M640() {
        return new Transport.LocomotiveNoBackspeed("M640", "Canada", "1972-1992", "Diesel",
                "", "", type, "Mainline Locomotive",
                53000f, 4000f, 200f, 120f, false, true, 0);
    }
    //PA
    public static Transport.LocomotiveNoBackspeed AlcoPA() {
        return new Transport.LocomotiveNoBackspeed("AlcoPA", "America", "1946-1981", "Diesel",
                "", "", type, " Passenger Locomotive",
                51000f, 2000f, 139f, 188f, false, true, 0);
    }

    //PB
    public static Transport.LocomotiveNoBackspeed AlcoPB() {
        return new Transport.LocomotiveNoBackspeed("AlcoPB", "America", "1946-1970", "Diesel",
                "", "", type, " Booster Unit",
                51000f, 2000f, 139f, 188f, false, true, 0);
    }

    //GP50
    public static Transport.LocomotiveNoBackspeed GP50() {
        return new Transport.LocomotiveNoBackspeed("GP50", "America", "1980-", "Diesel",
                "", "", type, "General Purpose Locomotive",
                62400f, 3600f, 125f, 65f, false, true, 0);
    }

    //SD70MAC
    public static Transport.LocomotiveNoBackspeed SD70Mac() {
        return new Transport.LocomotiveNoBackspeed("SD70Mac", "America", "1993-", "Diesel",
                "", "", type, "Special Duty Locomotive",
                145000f, 4400f, 193f, 112f, false, true, 0);
    }

    //SD70ACU
    public static Transport.LocomotiveNoBackspeed SD70ACU() {
        return new Transport.LocomotiveNoBackspeed("SD70ACU", "America", "2015-Present", "Diesel",
                "", "", type, "Special Duty Locomotive",
                155000f, 4500f, 193f, 120.7f, false, true, 0);
    }

    //SD90MAC-H
    public static Transport.LocomotiveNoBackspeed SD90MACH() {
        return new Transport.LocomotiveNoBackspeed("SD90MACH", "America", "1996-2012", "Diesel",
                "", "", type, "Special Duty Locomotive",
                165000f, 6000f, 212f, 120.7f, false, true, 0);
    }

    //SD60MAC
    public static Transport.LocomotiveNoBackspeed SD60Mac() {
        return new Transport.LocomotiveNoBackspeed("SD60Mac", "America", "1993-", "Diesel",
                "", "", type, "Special Duty Locomotive",
                145000f, 4400f, 193f, 112f, false, true, 0);
    }

    //AC4400CW
    public static Transport.LocomotiveNoBackspeed GEAC4400CW() {
        return new Transport.LocomotiveNoBackspeed("AC4400CW", "America", "1993-Present", "Diesel",
                "", "", type, " Mainline Freight Locomotive",
                145000f, 4400f, 193f, 112f, false, true, 0);
    }

    //HS4000
    public static Transport.LocomotiveNoBackspeed HS4000() {
        return new Transport.LocomotiveNoBackspeed("HS4000", "America", "1949-Present", "Diesel",
                nick, "", type, " Freight Locomotive",
                40000f, 1500f, 123f, 105f, false, true, 0);
    }

    //GP7
    public static Transport.LocomotiveNoBackspeed GP7() {
        return new Transport.LocomotiveNoBackspeed("GP7", "America", "1949-Present", "Diesel",
                nick, "", type, " General Purpose Locomotive",
                40000f, 1500f, 123f, 105f, false, true, 0);
    }

    //GP7R RI
    public static Transport.LocomotiveNoBackspeed GP7RRI() {
        return new Transport.LocomotiveNoBackspeed("GP7R RI", "America", "1952-2014", "Diesel",
                nick, "", type, " General Purpose Locomotive",
                40000f, 1500f, 123f, 105f, false, true, 0);
    }

    //GP9R
    public static Transport.LocomotiveNoBackspeed GP9R() {
        return new Transport.LocomotiveNoBackspeed("GP9R", "America", "1992-Present", "Diesel",
                nick, "", type, " General Purpose Locomotive",
                44600f, 1750f, 130f, 105f, false, true, 0);
    }

    //SD7
    public static Transport.LocomotiveNoBackspeed SD7() {
        return new Transport.LocomotiveNoBackspeed("SD7", "America", "1951-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                77250f, 1500f, 154.5f, 105f, false, true, 0);
    }

    //TEBC6
    public static Transport.LocomotiveNoBackspeed TEBC6() {
        return new Transport.LocomotiveNoBackspeed("TEBC6", "America", "1993-Present", "Diesel",
                nick, "", type, " Slug",
                77250f, 1500f, 154.5f, 105f, false, true, 0);
    }

    //SD45-2
    public static Transport.LocomotiveNoBackspeed SD452() {
        return new Transport.LocomotiveNoBackspeed("SD45-2", "America", "1972-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                82100f, 3600f, 184f, 112f, false, true, 0);
    }

    //SD45
    public static Transport.LocomotiveNoBackspeed SD45() {
        return new Transport.LocomotiveNoBackspeed("SD45", "America", "1965-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                82100f, 3600f, 184f, 112f, false, true, 0);
    }

    //SD45X
    public static Transport.LocomotiveNoBackspeed SD45X() {
        return new Transport.LocomotiveNoBackspeed("SD45X", "America", "1971-1980", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                82100f, 4200f, 184f, 112f, false, true, 0);
    }

    //SD40-2 Snoot
    public static Transport.LocomotiveNoBackspeed SD402Snoot() {
        return new Transport.LocomotiveNoBackspeed("SD402Snoot", "America", "1972-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                82100f, 3000f, 184f, 112f, false, true, 0);
    }

    //SD50
    public static Transport.LocomotiveNoBackspeed SD50() {
        return new Transport.LocomotiveNoBackspeed("SD50", "America", "1980-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                82100f, 3500f, 184f, 112f, false, true, 0);
    }

    //SD60
    public static Transport.LocomotiveNoBackspeed SD60() {
        return new Transport.LocomotiveNoBackspeed("SD60", "America", "1984-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                100000f, 3800f, 184f, 112f, false, true, 0);
    }

    //JT26C
    public static Transport.LocomotiveNoBackspeed JT26C() {
        return new Transport.LocomotiveNoBackspeed("JT26C", "Australia", "1984-Present", "Diesel",
                nick, "", type, " Road Diesel",
                82100f, 3000f, 184f, 112f, false, true, 0);
    }

    //SD60M2
    public static Transport.LocomotiveNoBackspeed SD60M2() {
        return new Transport.LocomotiveNoBackspeed("SD60M2", "America", "1991-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                100000f, 3800f, 184f, 112f, false, true, 0);
    }

    //SD70
    public static Transport.LocomotiveNoBackspeed SD70() {
        return new Transport.LocomotiveNoBackspeed("SD70", "America", "1992-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                109000f, 4000f, 197f, 121f, false, true, 0);
    }

    //SD70MP2
    public static Transport.LocomotiveNoBackspeed SD70MP2() {
        return new Transport.LocomotiveNoBackspeed("SD70MP2", "America", "1992-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                109000f, 4000f, 197f, 121f, false, true, 0);
    }

    //SD75M
    public static Transport.LocomotiveNoBackspeed SD75M() {
        return new Transport.LocomotiveNoBackspeed("SD75M", "America", "1994-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                137000f, 4300f, 197f, 121f, false, true, 0);
    }

    //SD38-2
    public static Transport.LocomotiveNoBackspeed SD382() {
        return new Transport.LocomotiveNoBackspeed("SD38-2", "America", "1972-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                82100f, 2000f, 184f, 112f, false, true, 0);
    }

    //SD40-2W
    public static Transport.LocomotiveNoBackspeed SD402W() {
        return new Transport.LocomotiveNoBackspeed("SD40-2W", "Canada", "1972-Present", "Diesel",
                nick, "", type, " Special Duty Locomotive",
                82100f, 3000f, 184f, 112f, false, true, 0);
    }

    //GP40-2LW
    public static Transport.LocomotiveNoBackspeed GP402LW() {
        return new Transport.LocomotiveNoBackspeed("GP40-2LW", "Canada", "1972-Present", "Diesel",
                nick, "", type, " General Purpose Locomotive",
                54700f, 3000f, 125f, 112f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed GP7HighHood() {
        return new Transport.LocomotiveNoBackspeed("GP7HighHood", "America", "1949-Present", "Diesel",
                nick, "", type, " Freight Locomotive",
                40000f, 1500f, 123f, 105f, false, true, 0);
    }
    //todo j38
    public static Transport.LocomotiveNoBackspeed J38() {
        return new Transport.LocomotiveNoBackspeed("J38", "United Kingdom", "1947-1965", "Steam",
                "", "", type, " Shunting Locomotive",
                22515f, 0f, 56.2f, 72f, false, true, 0);
    }

    //todo j39
    public static Transport.LocomotiveNoBackspeed J39() {
        return new Transport.LocomotiveNoBackspeed("J39", "United Kingdom", "1947-1965", "Steam",
                "", "", type, " Shunting Locomotive",
                22515f, 0f, 56.2f, 72f, false, true, 0);
    }

    //GWR 5700
    public static Transport.LocomotiveNoBackspeed GWR57() {
        return new Transport.LocomotiveNoBackspeed("GWR57", "United Kingdom", "1947-1965", "Steam",
                "", "", type, " Shunting Locomotive",
                22515f, 0f, 56.2f, 72f, false, true, 0);
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



    //DSB FII todo fix this entry
    public static Transport.LocomotiveNoBackspeed DSBFII() {
        return new Transport.LocomotiveNoBackspeed("DSBFII", "Denmark", "1967-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //DSB FII todo fix this entry
    public static Transport.LocomotiveNoBackspeed DSBFIII() {
        return new Transport.LocomotiveNoBackspeed("DSBFIII", "Denmark", "1967-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //DSB FII todo fix this entry
    public static Transport.LocomotiveNoBackspeed DSBSII() {
        return new Transport.LocomotiveNoBackspeed("DSBSII", "Denmark", "1967-", "Diesel",
                nick, " Cake Tins", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //B&O Caboose
    public static Transport.Rollingstock BOCaboose() {
        return new Transport.Rollingstock("B&O Caboose", "America", "1965-1990", "",
                "", type, " Bay Window Caboose", 33.7f, 200f, false, true, 0);
    }
    //CP Metal Van
    public static Transport.Rollingstock CPMetalVan() {
        return new Transport.Rollingstock("CPMetalVan", "Canada", "1968-", "",
                "", type, " Van", 38f, 200f, false, true, 0);
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

    //MZ Class III 1972
    public static Transport.LocomotiveNoBackspeed MZIII1972() {
        return new Transport.LocomotiveNoBackspeed("MZIII1972", "Denmark", "1972-", "Diesel",
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

    //Class Me
    public static Transport.LocomotiveNoBackspeed ClassME() {
        return new Transport.LocomotiveNoBackspeed("ClassME", "Denmark", "1981-", "Diesel",
                nick, "", type, " Universal Locomotive",
                88000f, 3253f, 116.5f, 143f, false, true, 0);
    }

    //Class MK
    public static Transport.LocomotiveNoBackspeed ClassMK() {
        return new Transport.LocomotiveNoBackspeed("ClassMK", "Denmark", "1996-", "Diesel",
                nick, "Duplo Block", type, " Shunting Locomotive",
                130f, 530f, 40f, 60f, false, true, 0);
    }

    //Class MH
    public static Transport.LocomotiveNoBackspeed ClassMH() {
        return new Transport.LocomotiveNoBackspeed("ClassMH", "Denmark", "1960-2001", "Diesel",
                nick, "", type, " Shunting Locomotive",
                130f, 440f, 40.5f, 60f, false, true, 0);
    }

    //V160 215 - 218
    public static Transport.LocomotiveNoBackspeed V160() {
        return new Transport.LocomotiveNoBackspeed("V160", "Germany", "1968-2022", "Diesel",
                nick, "", type, " Universal Locomotive",
                40000f, 2470f, 79f, 140f, false, true, 0);
    }

    //NE 81 / BR626
    public static Transport.LocomotiveNoBackspeed BRClass121() {
        return new Transport.LocomotiveNoBackspeed("BRClass121", "Germany", "1981-1995", "Diesel",
                aditional, " BR 626", type, " Passenger Railbus",
                0f, 679.81f, 46.0f, 100f, false, true, 0);
    }


    //NE 81 / BR626
    public static Transport.LocomotiveNoBackspeed NE81() {
        return new Transport.LocomotiveNoBackspeed("BR626", "Germany", "1981-1995", "Diesel",
                aditional, " BR 626", type, " Passenger Railbus",
                0f, 679.81f, 46.0f, 100f, false, true, 0);
    }

    //HLD55
    public static Transport.LocomotiveNoBackspeed HLD55() {
        return new Transport.LocomotiveNoBackspeed("HLD55", "Belgium, Luxembourg, Denmark, Germany, Sweden", "1961-", "Diesel",
                nick, "", type, " Universal Locomotive",
                77000f, 1951f, 110f, 120f, false, true, 0);
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
    public static Transport.Rollingstock KabinTenderT26() {
        return new Transport.Rollingstock("KabinTenderT26", "Germany", "1926-1982", "",
                "", type, " Tender", 17.5f, 0f, false, true, 0);
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

    //X10a
    public static Transport.LocomotiveNoBackspeed X10a() {
        return new Transport.LocomotiveNoBackspeed("X10A", "Europe", "2012-", "Diesel-Multi-Engine",
                "", "", type, " Passenger Locomotive",
                32452.73f, 3061.86f, 81.0f, 160f, false, true, 0);
    }

    //todo right stats
    public static Transport.LocomotiveNoBackspeed WWCPShopShunter() {
        return new Transport.LocomotiveNoBackspeed("WWCPShopShunter", "Europe", "2012-", "Diesel",
                "", "", type, " Shunter Locomotive",
                6744.26f, 75f, 15.0f, 30f, true, true, 0);
    }

    //todo right stats
    public static Transport.LocomotiveNoBackspeed WWCPStandard0_6_2T() {
        return new Transport.LocomotiveNoBackspeed("WWCPStandard0_6_2T", "Europe", "2012-", "Diesel",
                "", "", type, " Shunter Locomotive",
                6744.26f, 75f, 15.0f, 30f, true, true, 0);
    }

    //todo right stats
    public static Transport.LocomotiveNoBackspeed UnknownOne() {
        return new Transport.LocomotiveNoBackspeed("ClassMH", "Europe", "2012-", "Diesel-Multi-Engine",
                "", "", type, " Passenger Locomotive",
                6744.26f, 3061.86f, 81.0f, 160f, false, true, 0);
    }

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

    //todo correct these values
    public static Transport.LocomotiveNoBackspeed Series4000() {
        return new Transport.LocomotiveNoBackspeed("Series4000", "Germany", "1937-1950", "Electric",
                aditional, " DB V36, DB BR236, DR BR103", type, " Shunting Locomotive",
                31473.3f, 360.3f, 43.0f, 60f, false, true, 0);
    }

    //ACF 60 Seat
    public static Transport.Rollingstock ACF_60Seat() {
        return new Transport.Rollingstock("ACF_60Seat", "Germany", "1997-", "",
                "", type, " Passenger", 47.5f, 140f, false, true, 0);
    }

    //GWR Toad 20
    public static Transport.Rollingstock GWR_Toad20() {
        return new Transport.Rollingstock("GWRToad20", "United Kingdom", "1997-", "",
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

    //Amfleet 1
    public static Transport.Rollingstock Amfleet1() {
        return new Transport.Rollingstock("Amfleet1", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Compartments
    public static Transport.Rollingstock EurofimaCompartment1() {
        return new Transport.Rollingstock("EurofimaCompartments1", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Compartments
    public static Transport.Rollingstock EurofimaCompartment1_2() {
        return new Transport.Rollingstock("EurofimaCompartments1_2", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //Eurofima with Compartments
    public static Transport.Rollingstock EurofimaCompartment2() {
        return new Transport.Rollingstock("EurofimaCompartments2", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //todo Eurofima
    public static Transport.Rollingstock EurofimaPresidentiale() {
        return new Transport.Rollingstock("EurofimaPresidentiale", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //todo Eurofima
    public static Transport.Rollingstock EurofimaAssemblingBase() {
        return new Transport.Rollingstock("EurofimaAssemblingBase", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //todo Eurofima
    public static Transport.Rollingstock EurofimaInteriorFitting() {
        return new Transport.Rollingstock("EurofimaInteriorFitting", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //todo Eurofima
    public static Transport.Rollingstock EurofimaFlatConstruction() {
        return new Transport.Rollingstock("EurofimaFlatConstruction", "Europe", "1977-", "",
                "", type, " Passenger", 45f, 200f, false, true, 0);
    }

    //todo Eurofima
    public static Transport.Rollingstock EurofimaGettingPaint() {
        return new Transport.Rollingstock("EurofimaGettingPaint", "Europe", "1977-", "",
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

    //Paintstand
    public static Transport.Rollingstock PaintStand() {
        return new Transport.Rollingstock("PaintStand", "Europe", "1977-", "",
                "", type, " Workshop Equipment", 0.2f, 10f, false, true, 0);
    }

    //APO_BFS
    public static Transport.Rollingstock APO_BFS() {
        return new Transport.Rollingstock("APO BFs", "Denmark", "1981-1995", "",
                "Control Coach", type, " Passenger", 54f, 160f, false, true, 0);
    }

    //APO_BFM todo unfinished
    public static Transport.Rollingstock APO_BFM() {
        return new Transport.Rollingstock("APO BFm", "Denmark", "1981-1995", "",
                "", type, " Passenger", 54f, 160f, false, true, 0);
    }

    //APO_AFM todo unfinished
    public static Transport.Rollingstock APO_AFM() {
        return new Transport.Rollingstock("APO AFm", "Denmark", "1981-1995", "",
                "", type, " Passenger", 54f, 160f, false, true, 0);
    }

    //APO_CFM todo unfinished
    public static Transport.Rollingstock APO_CFM() {
        return new Transport.Rollingstock("APO CFm", "Denmark", "1981-1995", "",
                "", type, " Passenger", 54f, 160f, false, true, 0);
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

    //UK Cattlewagen todo right stats
    public static Transport.Rollingstock UKCattlewagen() {
        return new Transport.Rollingstock("UK Cattlewagen", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }

    //UK GasWagen todo right stats
    public static Transport.Rollingstock UKGasWagon() {
        return new Transport.Rollingstock("UKGasWagon", "United Kingdom", "1930-1959", "",
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
    //Chaldron
    public static Transport.Rollingstock Chaldron() {
        return new Transport.Rollingstock("Chaldron", "United Kingdom", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }

    //UK Tanker
    public static Transport.TankCars UKTanker() {
        return new Transport.TankCars("UKTanker", "United Kingdom", "1930-1959", "",
                "", type, " Tank wagon", 12f, 0f, false, true, 0,  9000);
    }

    //DSB ZE Tanker todo right stats
    public static Transport.Rollingstock DSBZETanker() {
        return new Transport.Rollingstock("DSBZETanker", "Denmark", "1930-1959", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
    }

    //DSB735Tanker todo right stats
    public static Transport.Rollingstock DSB735Tanker() {
        return new Transport.Rollingstock("DSB735Tanker", "Denmark", "1990-2000s", "",
                "", type, " Freight Loose", 10f, 0f, false, true, 0);
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

    //todo 40ft aar check stats
    public static Transport.Rollingstock AAR40ft() {
        return new Transport.Rollingstock("40ft AAR Boxcar", "America", "?", "",
                "", type, " Boxcar", 48f, 120f, false, true, 0);
    }

    //40ft Boxcar
    public static Transport.Rollingstock Fortyfoot_Boxcar() {
        return new Transport.Rollingstock("40ft Boxcar", "America", "?", "",
                "", type, " Boxcar", 48f, 120f, false, true, 0);
    }

    //2 Bay Concrete Hopper
    public static Transport.Rollingstock Bay2ConcreteHopper() {
        return new Transport.Rollingstock("Bay2ConcreteHopper", "America", "?", "",
                "", type, " Hopper", 48f, 120f, false, true, 0);
    }

    //40ft Boxcar
    public static Transport.Rollingstock GN40HomebuiltBoxcar() {
        return new Transport.Rollingstock("GN40HomebuiltBoxcar", "America", "?", "",
                "", type, " Boxcar", 48f, 120f, false, true, 0);
    }

    //40ft CP Mechanical Plug Door Refrigerated Boxcar
    public static Transport.Rollingstock CP_Mechanical_Reefer_40ft() {
        return new Transport.Rollingstock("CP 40ft Mechanical Refrigerator", "Canada", "?", "",
                "", type, " Reefer", 48f, 120f, false, true, 0);
    }

    //40ft Boxcar - CP Plug Slide Boxcar
    public static Transport.Rollingstock CP_PlugSlide() {
        return new Transport.Rollingstock("40ft CP PlugSlide Boxcar", "Canada", "~1970-2000", "",
                "", type, " Boxcar", 48f, 120f, false, true, 0);
    }
    //40ft Boxcar - CP Plugdoor Boxcar
    public static Transport.Rollingstock CP_Plugdoor() {
        return new Transport.Rollingstock("40ft CP Plugdoor Boxcar", "Canada", "~1970-2000", "",
                "", type, " Boxcar", 48f, 120f, false, true, 0);
    }

    //40ft Boxcar - CP Minibox
    public static Transport.Rollingstock CP_Minibox() {
        return new Transport.Rollingstock("40ft CP Minibox", "Canada", "1929-1983", "",
                "", type, " Boxcar", 36f, 120f, false, true, 0);
    }

    //GCS Flatcar
    public static Transport.Rollingstock GSC_Flatcar() {
        return new Transport.Rollingstock("GSCFlatcar", "America", "1956", "",
                "", type, " Flatcar", 75f, 120f, false, true, 0);
    }

    //PRR Gla Hopper
    public static Transport.Rollingstock PRR_Gla_Hopper() {
        return new Transport.Rollingstock("PRR Gla Hopper", "America", "1956", "",
                "", type, " Hopper", 75f, 120f, false, true, 0);
    }

    //89ft Flatcar
    public static Transport.Rollingstock Flatcar_89ft() {
        return new Transport.Rollingstock("89ftFlatCar", "America", "1956", "",
                "", type, " Flatcar", 75f, 0f, false, true, 0);
    }

    //Roadrailer53Dryvan
    public static Transport.Rollingstock Roadrailer53Dryvan() {
        return new Transport.Rollingstock("Roadrailer53Dryvan", "America", "1986-Present", "",
                "", type, " Roadrailer", 3f, 120f, false, true, 0);
    }

    //Thrall 61'6 Bulkhead
    public static Transport.Rollingstock Thrall616Bulkhead() {
        return new Transport.Rollingstock("Thrall616Bulkhead", "America", "1986-Present", "",
                "", type, " Bulkhead Flatcar", 3f, 120f, false, true, 0);
    }

    //Thrall 61'6 Boeing Flatcar
    public static Transport.Rollingstock Thrall616BoeingFlatcar() {
        return new Transport.Rollingstock("Thrall616BoeingFlatcar", "America", "1986-Present", "",
                "", type, " Flatcar", 3f, 120f, false, true, 0);
    }

    //Gunderson 59'6 Woodchip
    public static Transport.Rollingstock Gunderson596Woodchip() {
        return new Transport.Rollingstock("Gunderson596Woodchip", "America", "1986-Present", "",
                "", type, " Gondola", 3f, 120f, false, true, 0);
    }

    //NSC 53' Wellcar
    public static Transport.Rollingstock NSC53Wellcar() {
        return new Transport.Rollingstock("NSC53Wellcar", "America", "1990-Present", "",
                "", type, " Wellcar", 20f, 120f, false, true, 0);
    }

    //HiCube86QuadDoor
    public static Transport.Rollingstock HiCube86QuadDoor() {
        return new Transport.Rollingstock("HiCube86QuadDoor", "America", "1969-Present", "",
                "", type, " Boxcar", 38f, 0f, false, true, 0);
    }

    //89ft Autorack BiLvel
    public static Transport.Rollingstock Autorack_89ft_BiLevel() {
        return new Transport.Rollingstock("89ftBiLevelAutoRack", "America", "1956", "",
                "", type, " Autorack", 75f, 0f, false, true, 0);
    }

    //GCS Flatcar Bulkhead Early
    public static Transport.Rollingstock GSC_FlatcarBulkhead() {
        return new Transport.Rollingstock("GSCFlatcarBulkhead", "America", "1956", "",
                "", type, " Flatcar", 75f, 0f, false, true, 0);
    }

    //GCS Flatcar Bulkhead Late
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

    //Habiins_12
    public static Transport.Rollingstock Habiins_12() {
        return new Transport.Rollingstock("Habiins_12", "Europe", "2000s", "",
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

    //ACF Single Dome Tankcar
    public static Transport.TankCars ACF_Single_Dome_Tankcar() {
        return new Transport.TankCars("ACF_Single_Dome", "America", "1930-1959", "",
                "", type, " Tank wagon", 12f, 0f, false, true, 0,  9000);
    }

    //DSB E Open Wagon
    public static Transport.TankCars DSBCarE() {
        return new Transport.TankCars("DSBE", "Denmark", "1960-1990", "",
                "", type, " Freight loose", 12f, 0f, false, true, 0,  9000);
    }

    //GS Van
    public static Transport.TankCars GSVan() {
        return new Transport.TankCars("GS", "Denmark", "1960-1990", "",
                "", type, " Freight loose", 12f, 0f, false, true, 0,  9000);
    }

    //Lgns
    public static Transport.Rollingstock Lgns() {
        return new Transport.Rollingstock("Lgns", "Europe", "1980s", "",
                "", type, " Flatcar", 15f, 120f, false, true, 0);
    }
}



