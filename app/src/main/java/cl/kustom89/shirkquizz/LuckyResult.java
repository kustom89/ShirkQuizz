package cl.kustom89.shirkquizz;

/**
 * Created by kustom89 on 07-04-2018.
 */

public class LuckyResult extends LuckyAnswer {


    public LuckyResult(boolean userLucky) {
        super( userLucky );
    }



    public String processingAnswer(){
        boolean answer=isUserLucky();
        if(answer){
            return "Esa es la Actitud";
        }else{
            return "Animate";
        }
    }

    public String processingLuckyDate(){
        boolean answer=isLuckyDay();
        if(answer){
            return "Y es tu dia de suerte!!";
        }else{
            return "Vendran mejores tiempos!!";
        }
    }

    public String resultLucky(){
        String resultAnswer= processingAnswer();
        String resultLuckyDate=processingLuckyDate();

        return resultAnswer+resultLuckyDate;
    }


}
