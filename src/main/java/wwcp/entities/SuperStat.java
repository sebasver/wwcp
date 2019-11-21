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
    /**This is for rollingstock with no engine*/
    public static class EntityData3{
        public String name;
        public String country;
        public String year;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public float weightinKGs;
        public boolean fictional;
        public boolean reinforced;

        public EntityData3(String Name, String Country, String Year, String AditionalTextTitle, String AditionalText, String AditionalText2Title,
                           String AditionalText2,float WeightinTons, boolean Fictional, boolean Reinforced)
        {name=Name;country=Country;year=Year;additionalTextTitle = AditionalTextTitle; additionalText=AditionalText;additionalTextTitle2 = AditionalText2Title;additionalText2=AditionalText2;
            weightinKGs=(WeightinTons * 100);fictional=Fictional;reinforced=Reinforced;}


    }

    /** ABCDEFGHIJKLMNOPQRSTUVWXYZ*/

    //BR01 Wagner Deflectors
    public static EntityData1 BR01Wagner(){return new EntityData1("BR 01 Wagner","Germany","1926-1982","Steam",
            era," II",type, " Passenger Locomotive",
            0.0f,2210f,108.9f,130f,50f,false, true);}

    //BR 798 / VT 98
    public static EntityData2 BR798(){return new EntityData2("BR 798","Germany","1953-2000","Diesel",
            nick," VT 98",type, " Passenger Railbus",
            0f,299.12f,18.9f,90f, false, true);}

    //Default F140 MS2 like the HLE28
    public static EntityData2 F140MS2(){return new EntityData2("F140 MS2 Traxx","Europe","2006-","Electric",
            era," VI",type, " Freight Locomotive",
            67000f,7500f,85.0f,140f, false, true);}

    //Swiss version of the F140MS2
    public static EntityData2 F140MS(){return new EntityData2("SBB Re 484","Switzerland","2006-","Electric",
            era," VI",type, " Freight Locomotive",
            67000f,7500f,85.4f,140f, false, true);}

    //NS Highspeed version of the F140MS2
    public static EntityData2 F140MS2HS(){return new EntityData2("NS E186","Netherlands","2006-","Electric",
            era," VI",type, " Passenger Locomotive",
            67000f,7500f,85.0f,160f, false, true);}

    //NE 81 / BR626
    public static EntityData2 NE81(){return new EntityData2("NE 81","Germany","1981-1995","Diesel",
            nick," BR 626",type, " Passenger Railbus",
            0f,679.81f,46.0f,100f, false, true);}

    //Wehrmachtslokomotive WR 360 C 14 / V36
    public static EntityData2 WR360C14(){return new EntityData2("Wehrmachtslokomotive WR 360 C 14","Germany","1937-1950","Diesel",
            nick," V36",type, " Shunting Locomotive",
            31473.3f,360.3f,43.0f,60f, false, true);}


}
