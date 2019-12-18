package wwcp.entities;

public class SuperStat {


    public static String era = "wwcp.era";
    public static String nick = "wwcp.nick";
    public static String type = "wwcp.type";



    /**Backspeed has to be known*/
    public static class EntityData1{
        public String name;
        public String country;
        public String year;
        public String fuel;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public float tractive_effort;
        public float metric_horsepower;
        public float weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public EntityData1(String Name, String Country, String Year, String Fuel, String AditionalTextTitle, String AditionalText, String AditionalText2Title, String AditionalText2,
                           float TractiveEffort, float MetricHorsepower, float WeightinTons, float TopSpeed, float BackTopSpeed, boolean Fictional, boolean Reinforced)
        {name=Name;country=Country;year=Year;fuel=Fuel;additionalTextTitle = AditionalTextTitle; additionalText=AditionalText;additionalTextTitle2 = AditionalText2Title;additionalText2=AditionalText2;tractive_effort=TractiveEffort;
            weightinKGs=(WeightinTons * 100);topSpeed=TopSpeed;metric_horsepower=MetricHorsepower;backTopSpeed = BackTopSpeed;fictional=Fictional;reinforced=Reinforced;}


    }
    /**This is for Trains with no defined backspeed, Backspeed simply equals Topspeed*/
    public static class EntityData2{
        public String name;
        public String country;
        public String year;
        public String fuel;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public float tractive_effort;
        public float metric_horsepower;
        public float weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public EntityData2(String Name, String Country, String Year, String Fuel, String AditionalTextTitle, String AditionalText, String AditionalText2Title, String AditionalText2,
                           float TractiveEffort, float MetricHorsepower, float WeightinTons, float TopSpeed, boolean Fictional, boolean Reinforced)
        {name=Name;country=Country;year=Year;fuel=Fuel;additionalTextTitle = AditionalTextTitle; additionalText=AditionalText;additionalTextTitle2 = AditionalText2Title;additionalText2=AditionalText2;tractive_effort=TractiveEffort;
            weightinKGs=(WeightinTons * 100);topSpeed=TopSpeed;metric_horsepower=MetricHorsepower;backTopSpeed = TopSpeed;reinforced=Reinforced;fictional=Fictional;}


    }
    /**This is for rolingstock with a defined topspeed or with no topspeed "0"*/
    public static class EntityData3{
        public String name;
        public String country;
        public String year;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public float weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public EntityData3(String Name, String Country, String Year, String AditionalTextTitle, String AditionalText, String AditionalText2Title,
                           String AditionalText2,float WeightinTons,float TopSpeed, boolean Fictional, boolean Reinforced)
        {name=Name;country=Country;year=Year;additionalTextTitle = AditionalTextTitle; additionalText=AditionalText;additionalTextTitle2 = AditionalText2Title;additionalText2=AditionalText2;
            weightinKGs=(WeightinTons * 100);topSpeed=TopSpeed;fictional=Fictional;backTopSpeed = TopSpeed;reinforced=Reinforced;}


    }
//todo add in all Traxx locomotive Types
    /** A B C D E F G H I J K L M N O P Q R S T U V W X Y Z*/

    //BR01 Wagner Deflectors
    public static EntityData1 DRBR01Wagner(){return new EntityData1("BR 01 Wagner","Germany","1926-1982","Steam",
            "","",type, " Passenger Locomotive",
            0.0f,2210f,108.9f,130f,50f,false, true);}

    //BR01 Witte Christmas
    public static EntityData1 DRBR01WitteChristmas(){return new EntityData1("Christmas BR 01 Witte","Germany","1926-1982","Steam",
            "","",type, " Passenger Locomotive",
            0.0f,2210f,108.9f,130f,50f,false, true);}

    //BR 798 / VT 98
    public static EntityData2 BR798(){return new EntityData2("BR 798","Germany","1953-2000","Diesel",
            nick," VT 98",type, " Passenger Railbus",
            0f,299.12f,18.9f,90f, false, true);}

    //Class 37
    public static EntityData2 Class37(){return new EntityData2("Class 37","United_Kingdom","1960-","Diesel",
            nick," Tractors",type, " Mixed Locomotive",
            55000f,1750f,102f,140f, false, true);}

    //CR 812
    public static EntityData2 CR812(){return new EntityData2("CR Class812","United_Kingdom","1899-1963","Steam",
            nick," Jumbos",type, " Mixed Locomotive",
            20170f,0f,46.38f,88.51f, false, true);}

    //CR 812 Tender
    public static EntityData3 Mcintosh3000Galon(){return new EntityData3("CR Class812","United_Kingdom","1899-1963","",
            "",type," Tender", 19.5f,0f, false, true);}

    //F140 MS2E
    public static EntityData2 F140MS2E(){return new EntityData2("F140 MS2E","Europe","2006-","Electric",
            "","",type, " Freight Locomotive",
            67442.68f,7613.88f,85.0f,140f, false, true);}

    //GE AC4400 CW
    public static EntityData2 GEAC4400CW(){return new EntityData2("GE AC4400CW","America","1993-","Diesel",
            "","",type, " Freight Locomotive",
            145000f,4400f,193f,112f, false, true);}

    //GWR 9400
    public static EntityData2 GWR9400(){return new EntityData2("GWR 9400","United_Kingdom","1947-1965","Steam",
            "","",type, " Shunting Locomotive",
            22515f,0f,56.2f,72f,false, true);}

    //KoF III 1
    public static EntityData2 KoFIII1(){return new EntityData2("KoF III 1","Germany","1959-","Diesel",
            nick," Klein Lokomotive",type, " Shunting Locomotive",
            18726.58f,240f,22f,30f,false, true);}

    //KoF III 2
    public static EntityData2 KoFIII2(){return new EntityData2("KoF III 2","Germany","1959-","Diesel",
            nick," Klein Lokomotive",type, " Shunting Locomotive",
            18726.58f,240f,22f,30f,false, true);}

    //MZ Class I
    public static EntityData2 MZI(){return new EntityData2("MZ I","Denmark","1967-","Diesel",
            nick," Cake Tins",type, " Mixed Locomotive",
            88000f,3253f,116.5f,143f, false, true);}

    //MZ Class II
    public static EntityData2 MZII(){return new EntityData2("MZ II","Denmark","1970-","Diesel",
            nick," Cake Tins",type, " Mixed Locomotive",
            88000f,3253f,116.5f,143f, false, true);}

    //MZ Class III
    public static EntityData2 MZIII(){return new EntityData2("MZ III","Denmark","1972-","Diesel",
            nick," Cake Tins",type, " Mixed Locomotive",
            88000f,3854f,121.2f,165f, false, true);}

    //MZ Class IV
    public static EntityData2 MZIV(){return new EntityData2("MZ IV","Denmark","1977-","Diesel",
            nick," Cake Tins",type, " Mixed Locomotive",
            88000f,3854f,123f,165f, false, true);}

    //MZ Class Australia
    public static EntityData2 MZAustralia(){return new EntityData2("MZ III","Australia","1972-","Diesel",
            nick," Cake Tins",type, " Mixed Locomotive",
            88000f,3854f,121.2f,105f, false, true);}

    //NS Highspeed version of the F140MS2E
    public static EntityData2 NSHSF140MS2E(){return new EntityData2("NS E186","Netherlands","2006-","Electric",
            "","",type, " Passenger Locomotive",
            67442.68f,7613.88f,85.0f,160f, false, true);}

    //NE 81 / BR626
    public static EntityData2 NE81(){return new EntityData2("NE 81","Germany","1981-1995","Diesel",
            nick," BR 626",type, " Passenger Railbus",
            0f,679.81f,46.0f,100f, false, true);}

    //SSB Re 484 / F 140MS2
    public static EntityData2 SBBRE484(){return new EntityData2("SBB Re 484","Switzerland","2004-","Electric",
            "","",type, " Freight Locomotive",
            0f,7613.88f,85.4f,140f, false, true);}

    //T32 Tender todo unfinished
    public static EntityData3 T32Tender(){return new EntityData3("T32 2'2'","Germany","1926-1982","",
            "",type," Tender", 20f, 0f,false, true);}

    //T32 Christmas Tender
    public static EntityData3 T32TenderChristmas(){return new EntityData3("T32 2'2' Christmas","Germany","1926-1982","",
            "",type," Tender", 20f, 0f,false, true);}

    //Wehrmachtslokomotive WR 360 C 14 / V36
    public static EntityData2 WR360C14(){return new EntityData2("Wehrmachtslokomotive WR 360 C 14","Germany","1937-1950","Diesel",
            nick," V36",type, " Shunting Locomotive",
            31473.3f,360.3f,43.0f,60f, false, true);}


    /**Rolling stock Declaration*/
    /** A B C D E F G H I J K L M N O P Q R S T U V W X Y Z*/

    //Donderbus 1st class todo unfinished
    public static EntityData3 Donderbus1(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Donderbus 2nd class todo unfinished
    public static EntityData3 Donderbus2(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Donderbus 3rd class todo unfinished
    public static EntityData3 Donderbus3(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Eurofima with Compartments todo unfinished
    public static EntityData3 EurofimaCompartment(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Eurofima with Rows todo unfinished
    public static EntityData3 EurofimaRows(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Eurofima with Sleeperbeds todo unfinished
    public static EntityData3 EurofimaSleeper(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //OFF52 todo unfinished
    public static EntityData3 OFF52(){return new EntityData3("CR Class812","United_Kingdom","1899-1963","",
            "",type," Tender", 19.5f, 0,false, true);}

    //Rheingold 1st Kitchen todo unfinished
    public static EntityData3 RheingoldKitchen1(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Rheingold 1st Salon todo unfinished
    public static EntityData3 RheingoldSalon1(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Rheingold 2nd Kitchen todo unfinished
    public static EntityData3 RheingoldKitchen2(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Rheingold 2nd Salon todo unfinished
    public static EntityData3 RheingoldSalon2(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Rheingold Baggage todo unfinished
    public static EntityData3 RheingoldBaggage(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Sggnss 80 todo unfinished
    public static EntityData3 Sggnss80(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //UK Openwagon todo unfinished
    public static EntityData3 UKOpenWagon(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}


}
