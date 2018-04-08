package cl.kustom89.shirkquizz;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class MatchFragment extends Fragment {


    public MatchFragment() {
        // Required empty public constructor
    }
    //enganche para conectar el fragment con el section pager adapter
    public static MatchFragment newInstance(){
        return new MatchFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_match, container, false );
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated( view, savedInstanceState );
        //hubicar todas la vistas que necesitamos del xml
        final SeekBar userSb=view.findViewById( R.id.userSb );
        final TextView userTv=view.findViewById( R.id.userTv );
        final SeekBar loverSb=view.findViewById( R.id.loverSb );
        final TextView loverTv=view.findViewById( R.id.loverTv );
        Button button= view.findViewById( R.id.matchBtn );

        userSb.setOnSeekBarChangeListener( new SeekBar.OnSeekBarChangeListener() {
            //Le añade el valor al text view
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                userTv.setText(String.valueOf( progress ) );
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        } );

        //Le añade el valor al text view y muestra caracteristicas del onStartTrackingTouch
        // y onStopTrackingTouch
        loverSb.setOnSeekBarChangeListener( new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                loverTv.setText( String.valueOf( progress ) );
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText( getContext(), "Empezó", Toast.LENGTH_SHORT ).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText( getContext(), "Termino", Toast.LENGTH_SHORT ).show();

            }
        } );

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int user=userSb.getProgress();
                int lover =loverSb.getProgress();

                AlertDialog.Builder alertDialog=new AlertDialog.Builder( getActivity() );
                alertDialog.setTitle( "Resultado de compatibilidad" );
                alertDialog.setMessage( new MatchResult( user,lover ).MatchResult() );
                alertDialog.setPositiveButton( "Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                } );
                alertDialog.show();


            }
        } );





    }
}
