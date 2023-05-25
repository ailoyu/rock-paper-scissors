package vn.edu.hutech.selection;

public class Operators {

    public long sum (long ... number){
        if(number.length == 0){
            return 0;
        }
        long res = 0L;
        for(int i = 0; i < number.length; i++){
            res+= number[i];
        }
        return res;
    }
}
