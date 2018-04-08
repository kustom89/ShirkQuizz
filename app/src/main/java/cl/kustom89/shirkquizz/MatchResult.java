package cl.kustom89.shirkquizz;

/**
 * Created by kustom89 on 08-04-2018.
 */

public class MatchResult extends MatchAnswer {
    public MatchResult(int ageUser, int ageLover) {
        super( ageUser, ageLover );
    }

    public String MatchResult(){
        return processingMatch();
    }
    private String processingMatch(){
        int ageUser=getAgeUser();
        int ageLover=getAgeLover();

        if(ageUser<ageLover){
            return "es Mayor ";
        }else if (ageUser>ageLover) {
            return "es menor";

        }else{
            return"Son compatibles";
        }
    }
}
