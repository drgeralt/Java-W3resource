package UnitConverter;

import java.util.ArrayList;

public class Conversor {
    ArrayList<MetricPrefix> metricPrefixes = new ArrayList<>();
    ArrayList<Unit> units = new ArrayList<>();
    Conversor(String operation){
        metricPrefixes.add(new MetricPrefix("tera",Math.pow(10,12)));
        metricPrefixes.add(new MetricPrefix("giga",Math.pow(10,9)));
        metricPrefixes.add(new MetricPrefix("mega",Math.pow(10,6)));
        metricPrefixes.add(new MetricPrefix("kilo",Math.pow(10,3)));
        metricPrefixes.add(new MetricPrefix("hecto",Math.pow(10,2)));
        metricPrefixes.add(new MetricPrefix("deka",Math.pow(10,1)));
    }
}
