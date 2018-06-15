package com.example.tentsering.ticktactoe;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
// Important notice, player A in this game always go first.
public class Fragment2 extends Fragment {
    public static ImageView[][] row_col;
    public static String[][] mark; //to store value for whether it's X or O
    public static int[][] turn;
    public static TextView thatText;
    public final static String MARK_X = "X";
    public final static String MARK_O = "O";
    public String myStringA = "",  myStringB = "", thatString;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_2, container, false);
        return rootView;
    }
    
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
    thatText = (TextView) view.findViewById(R.id.cellone);
//          row_col = new ImageView[3][3];
//          turn = new int[3][3];

        //row_col[0][0] = (ImageView) view.findViewById(R.id.cellone);
        TextView textView = (TextView) view.findViewById(R.id.cellone);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thatText.setText(thatString);
                Toast.makeText(getActivity(), "Player A chose "+ thatString, Toast.LENGTH_SHORT).show();
            }
        });
//
//        row_col[0][1] = (ImageView) view.findViewById(R.id.celltwo);
//        row_col[0][2] = (ImageView) view.findViewById(R.id.cellthree);
//
//        row_col[1][0] = (ImageView) view.findViewById(R.id.cellsix);
//        row_col[1][1] = (ImageView) view.findViewById(R.id.cellfive);
//        row_col[1][2] = (ImageView) view.findViewById(R.id.cellfour);
//
//        row_col[2][0] = (ImageView) view.findViewById(R.id.cellseven);
//        row_col[2][1] = (ImageView) view.findViewById(R.id.celleight);
//        row_col[2][2] = (ImageView) view.findViewById(R.id.cellnine);

    }

//
//    /**
//     * checkCol checks the column whether X wins first or O.
//     * @param mark, where string(X or O) is stored, when user clicks on the tic-tac-toe square board.
//     * @return X or O, depending on who wins first.
//     */
//    public String checkCol(String[][] mark){
//        String finalMark = "";
//        String cross = "X", circle = "O";
//
//        for(int i = 0; i<=2; i++) {
//            if (mark[0][i].equalsIgnoreCase(cross) && mark[1][i].equalsIgnoreCase(cross) && mark[2][i].equalsIgnoreCase(cross)) {
//                finalMark = cross;
//            } else if (mark[0][i].equalsIgnoreCase(circle) && mark[1][i].equalsIgnoreCase(circle) && mark[2][i].equalsIgnoreCase(circle)) {
//                finalMark = circle;
//            }
//        }
//        return finalMark;
//    }
//
//    /**
//     * checkCol checks the row whether X wins first or O.
//     * @param mark, where string(X or O) is stored, when user clicks on the tic-tac-toe square board.
//     * @return X or O, depending on who wins first.
//     */
//    public String checkRow(String[][] mark){
//        String finalMark = "";
//        String cross = "X", circle = "O";
//
//    for(int i = 0; i<=2; i++) {
//
//    if (mark[i][0].equalsIgnoreCase(cross) && mark[i][1].equalsIgnoreCase(cross) && mark[i][2].equalsIgnoreCase(cross)) {
//        finalMark = cross;
//    } else if (mark[i][0].equalsIgnoreCase(circle) && mark[i][1].equalsIgnoreCase(circle) && mark[i][2].equalsIgnoreCase(circle)) {
//        finalMark = circle;
//    }
//}
//        return finalMark;
//    }
//
//    public String checkDiag(String [][] mark){
//        String finalMark = "";
//        String cross = "X", circle = "O";
//
//        if(mark[0][0].equalsIgnoreCase(cross)&&mark[1][1].equalsIgnoreCase(cross)&&mark[2][2].equalsIgnoreCase(cross)){
//            finalMark = cross;
//        }
//        else if(mark[0][0].equalsIgnoreCase(circle)&&mark[1][1].equalsIgnoreCase(circle)&&mark[2][2].equalsIgnoreCase(circle)){
//            finalMark = circle;
//        }
//        if(mark[2][0].equalsIgnoreCase(cross)&&mark[1][1].equalsIgnoreCase(cross)&&mark[0][2].equalsIgnoreCase(cross)){
//            finalMark= cross;
//        }else if(mark[2][0].equalsIgnoreCase(circle)&&mark[1][1].equalsIgnoreCase(circle)&&mark[0][2].equalsIgnoreCase(circle)){
//            finalMark = circle;
//        }
//        return finalMark;
//    }
//
//    public int score(){
//        int x = 1;
//        // if x wins, add +1 to player A, else +1 to player B
//        // add score till point reaches 8.
//        // Then send the result to tab 3.
//        //change layout after point 8, and display Game Over, click on Fragment3 to view scores.
//        return x;
//    }

    protected void sendRecievedData(String message){
        thatString = message;
    }
}