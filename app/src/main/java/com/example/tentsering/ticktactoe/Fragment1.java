package com.example.tentsering.ticktactoe;


import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class Fragment1 extends Fragment {
    //public int turn;
    public ImageView imageView1, imageView2, playerA_pick, playerB_pick;
    public LinearLayout setMark, showMark;
    private String playerA_choice1 = "X", playerA_choice2 = "O";


    SendMessage sendMessage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        return rootView;
    }
    
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){

        imageView1 = (ImageView) view.findViewById(R.id.cross);
        imageView2 = (ImageView) view.findViewById(R.id.circle);


        playerA_pick = (ImageView) view.findViewById(R.id.playerA_choice);
        playerB_pick = (ImageView) view.findViewById(R.id.playerB_choice);


        setMark = (LinearLayout) view.findViewById(R.id.chose_mark);
        showMark = (LinearLayout) view.findViewById(R.id.show_mark);

        // from picking X or O, player A always picks first.
        // if player A clicks the cross/X then display this result
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerA_pick.setImageResource(R.drawable.ic_letter_x);
                playerB_pick.setImageResource(R.drawable.ic_circle);
                setMark.setVisibility(View.GONE);
                showMark.setVisibility(View.VISIBLE);

                sendMessage.sendData(playerA_choice1);
                Toast.makeText(getActivity(), "Player A chose: " + playerA_choice1, Toast.LENGTH_SHORT).show();
                //now i want to pass "X" to Fragment2, indicating that the Player A chose to be X.
            }
        });

        // if player A clicks the circle then display this result
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerA_pick.setImageResource(R.drawable.ic_circle);
                playerB_pick.setImageResource(R.drawable.ic_letter_x);
                setMark.setVisibility(View.GONE);
                showMark.setVisibility(View.VISIBLE);

                sendMessage.sendData(playerA_choice2);
                Toast.makeText(getActivity(), "Player A chose: " + playerA_choice2, Toast.LENGTH_SHORT).show();
            }
        });
    }

    interface SendMessage {
        void sendData(String message);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{
            sendMessage = (SendMessage) getActivity();
        }catch (ClassCastException e){
            throw new ClassCastException("Error in retrieving data!");
        }
    }
}
