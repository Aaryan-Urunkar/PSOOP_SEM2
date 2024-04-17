/**
 * Cricketer
 */
public class Cricketer {

    String name;
    int runs, innings, not_out;
    double bat_avg;

    double getAvg(){
        return bat_avg;
    }

    void setAvg(){
        bat_avg = (double)runs / (innings - not_out);
    }

}