package cl.kustom89.shirkquizz;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class LuckyFragment extends Fragment {


    public LuckyFragment() {
        // Required empty public constructor
    }
    //enganche para conectar el fragment con el section pager adapter
    public static LuckyFragment newInstance(){
        return new LuckyFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_lucky, container, false );
    }

}
