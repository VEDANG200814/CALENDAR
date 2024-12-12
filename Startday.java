public class Startday {
    int start(int y){
        int mm=0,l=0;
        for(int h=1900;h<y;h++){
            if((h%4==0&&h%100!=0)||(h%400==0))
            mm+=366;
            else
            mm+=365;
        }
        l=(mm+1)%7;
        return l;
    }    
}
