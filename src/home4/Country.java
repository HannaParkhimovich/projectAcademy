package home4;

public enum Country implements ICountry{
    BELARUS(207600,10300500),
    POLAND(312685, 38635100),
    UKRAINE(603700, 47425300),
    CHINA(9596960,1306313800),
    RUSSIA(17075200, 143420300),
    GERMANY(357021,82431400),
    GREECE(131940,10668400),
    SPAIN(504782,40341500),
    CANADA(9976140,32805000),
    FINLAND(337030,5223400);

    private int area;
    private int population;

    Country(int area, int population) {
        this.area = area;
        this.population = population;
    }


    @Override
    public int getArea() {
        return area;
    }

    @Override
    public double getPopulation() {
        return population;
    }
   /* public int compare( Country a, Country b){
       return a.getArea().compareTo(b.getArea());
    }
   */

}
