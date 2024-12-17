import java.util.*;
public class Calendar {
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calendar ob=new Calendar();
        System.out.println("Enter year");
        int y=sc.nextInt(),i,j,k,l,b=0;
        l=ob.start(y)+1;
        String m[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        for(i=1;i<=12;i++){
            if((i<=7&&i%2==1)||(i>=8&&i%2==0))
            b=31;
            else if(((y%4==0&&y%100!=0)||(y%400==0))&&i==2)
            b=29;
            else if(i==2)
            b=28;
            else
            b=30;
            System.out.println(m[i-1]+": ");
            System.out.println("S\tM\tT\tW\tT\tF\tS");
            for(k=1;k<l;k++)
            System.out.print(" \t");
            for(j=1;j<=b;j++,k++){
                System.out.print(j+"\t");
                l++;
                if(l==8||k%7==0){
                    System.out.println();
                    l=1;
                }
            }
            System.out.println();
        }
    }
}