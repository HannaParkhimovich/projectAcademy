package home4;

import java.util.Comparator;

public class Count implements Comparator<ICountry> {


    @Override
    public int compare(ICountry o1, ICountry o2) {
        int k=o1.getArea()-o2.getArea();
        if (k>0){ return 1;}
        if (k<0){ return -1;}
        return 0;
    }
}
