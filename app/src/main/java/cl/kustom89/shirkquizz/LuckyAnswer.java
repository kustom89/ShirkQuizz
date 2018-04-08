package cl.kustom89.shirkquizz;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kustom89 on 07-04-2018.
 */

public class LuckyAnswer {

     boolean userLucky;
     boolean luckyDay;

    public LuckyAnswer(boolean userLucky) {
        this.userLucky = userLucky;
        luckyDay=new LuckyDate().ResultLuckyDate();
    }

    public boolean isUserLucky() {
        return userLucky;
    }

    public boolean isLuckyDay() {
        return luckyDay;
    }

    private class LuckyDate{

        public boolean ResultLuckyDate(){
            Date date= new Date(  );
            SimpleDateFormat simpleDateFormat= new SimpleDateFormat( "dd" );
            int day= Integer.parseInt( simpleDateFormat.format( date ) );
            if(day%2==0){
                return true;
            }else{
                return false;
            }
        }
    }
}
