package cl.kustom89.shirkquizz;

/**
 * Created by kustom89 on 07-04-2018.
 */

public class MatchAnswer {
    private int ageUser;
    private int ageLover;


    public MatchAnswer(int ageUser, int ageLover) {
        this.ageUser = ageUser;
        this.ageLover = ageLover;
    }

    public int getAgeUser() {
        return ageUser;
    }

    public int getAgeLover() {
        return ageLover;
    }
}
