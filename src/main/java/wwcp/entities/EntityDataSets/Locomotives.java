package wwcp.entities.EntityDataSets;

public class Locomotives {
    public static String era = "wwcp.era";
    public static String nick = "wwcp.nick";
    public static String type = "wwcp.type";
    public static String aditional = "wwcp.aditional";

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

    //CR 812 "CRClass812"
    public static Transport.LocomotiveNoBackspeed CR812() {
        return new Transport.LocomotiveNoBackspeed("Class812", "United Kingdom", "1899-1963", "Steam",
                nick, " Jumbos", type, " Universal Locomotive",
                20170f, 0f, 46.38f, 88.51f, false, true, 0);
    }

    //CR 812 Tender "Mcintosh3000Gallon"
    public static Transport.TankCars Mcintosh3000Galon() {
        return new Transport.TankCars("Class812Tender", "United_Kingdom", "1899-1963", "",
                "", type, " Tender", 19.5f, 0f, false, true, 0, 300000);
    }


    //GE AC4400 CW
    public static Transport.LocomotiveNoBackspeed GEAC4400CW() {
        return new Transport.LocomotiveNoBackspeed("GEAC4400CW", "America", "1993-", "Diesel",
                "", "", type, " Freight Locomotive",
                145000f, 4400f, 193f, 112f, false, true, 0);
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

    //MZ Class II
    public static Transport.LocomotiveNoBackspeed MZII() {
        return new Transport.LocomotiveNoBackspeed("MZII", "Denmark", "1970-", "Diesel",
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

    /**Traxx Program*/
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
        return new Transport.LocomotiveNoBackspeed("F140MS2", "Switzerland", "2004-", "Electric",
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
    /**end of traxx program.*/

    public static Transport.LocomotiveNoBackspeed ES64U2() {
        return new Transport.LocomotiveNoBackspeed("ES64U2", "Europe", "1999-", "Electric",
                "", "", type, " Universal Locomotive",
                56202.23f, 8701.57f, 86.0f, 230f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed ES64U4() {
        return new Transport.LocomotiveNoBackspeed("ES64U4", "Europe", "2005-", "Electric",
                "", "", type, " Universal Locomotive",
                67442.68f, 8701.57f, 87.0f, 357f, false, true, 0);
    }

    public static Transport.LocomotiveNoBackspeed ES64F4() {
        return new Transport.LocomotiveNoBackspeed("ES64F4", "Europe", "2003-", "Electric",
                "", "", type, " Freight Locomotive",
                67442.68f, 8701.57f, 87.0f, 140f, false, true, 0);
    }

    //Wehrmachtslokomotive WR 360 C 14 / V36
    public static Transport.LocomotiveNoBackspeed WR360C14() {
        return new Transport.LocomotiveNoBackspeed("WehrmachtslokomotiveWR360C14", "Germany", "1937-1950", "Diesel",
                aditional, " DB V36, DB BR236, DR BR103", type, " Shunting Locomotive",
                31473.3f, 360.3f, 43.0f, 60f, false, true, 0);
    }
}
