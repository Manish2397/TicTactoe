package com.example.tic_tac_toe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    Button button11, button12, button13, button21, button22, button23, button31, button32, button33,resetscore,resetboard;
    TextView scoreX,scoreO;
    String prevSign;
    String currentPlayer ="X";
    int scorex=0,scoreo=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initialiseFields();
        boolean gamePlaying = true;
        prevSign = "O";
        String turn = "PLAYER";
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);

    }

    private void initialiseFields() {
        button11 = findViewById(R.id.Button11);
        button12 = findViewById(R.id.Button12);
        button13 = findViewById(R.id.Button13);
        button21 = findViewById(R.id.Button21);
        button22 = findViewById(R.id.Button22);
        button23 = findViewById(R.id.Button23);
        button31 = findViewById(R.id.Button31);
        button32 = findViewById(R.id.Button32);
        button33 = findViewById(R.id.Button33);
        resetscore = findViewById(R.id.resetScoreButton);

        resetboard = findViewById(R.id.resetBoardButton);
        scoreX = findViewById(R.id.scoreX);
        scoreO = findViewById(R.id.scoreO);
    }

    @Override
    public void onClick(View v) {
        Button buttonPressed = (Button) v;
        int id = (buttonPressed.getId());
        String sign;
        resetboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetFields();
            }
        });
        resetscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScore();
            }
        });
        switch (id) {
            case R.id.Button11: {
                //sign = button11.getText().toString();

                if (button11.getText().toString().equals("-")) {
                    button11.setText(currentPlayer);
                    if(currentPlayer.equals("X")){
                        button11.setBackgroundColor(Color.parseColor("#D32F2F"));
                    }
                    else{
                        button11.setBackgroundColor(Color.parseColor("#536DFE"));
                    }
                    if(isWinner(currentPlayer)==1){
                        Toast.makeText(this,currentPlayer + " Won!",Toast.LENGTH_SHORT).show();
                        resetFields();

                    }
                    if(currentPlayer.equals("X")){
                        prevSign="X";
                        currentPlayer="O";
                    }
                    else{prevSign="O";
                        currentPlayer="X";
                    }
                } else {
                    Toast.makeText(this, "Already Occupied !", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.Button12: {
                sign = button12.getText().toString();
                if (button12.getText().toString().equals("-")) {
                    button12.setText(currentPlayer);
                    if(currentPlayer.equals("X")){
                        button12.setBackgroundColor(Color.parseColor("#D32F2F"));
                    }
                    else{
                        button12.setBackgroundColor(Color.parseColor("#536DFE"));
                    }
                    if(isWinner(currentPlayer)==1){
                        Toast.makeText(this,currentPlayer + " Won!",Toast.LENGTH_SHORT).show();
                        resetFields();

                    }
                    if(currentPlayer.equals("X")){
                        prevSign="X";
                        currentPlayer="O";
                    }
                    else{prevSign="O";
                        currentPlayer="X";
                    }
                } else {
                    Toast.makeText(this, "Already Occupied !", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.Button13: {
                sign = button13.getText().toString();
                if (button13.getText().toString().equals("-")) {
                    button13.setText(currentPlayer);
                    if(currentPlayer.equals("X")){
                        button13.setBackgroundColor(Color.parseColor("#D32F2F"));
                    }
                    else{
                        button13.setBackgroundColor(Color.parseColor("#536DFE"));
                    }
                    if(isWinner(currentPlayer)==1){
                        Toast.makeText(this,currentPlayer + " Won!",Toast.LENGTH_SHORT).show();
                        resetFields();

                    }
                    if(currentPlayer.equals("X")){
                        prevSign="X";
                        currentPlayer="O";
                    }
                    else{prevSign="O";
                        currentPlayer="X";
                    }
                } else {
                    Toast.makeText(this, "Already Occupied !", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.Button21: {
                sign = button21.getText().toString();
                if (button21.getText().toString().equals("-")) {
                    button21.setText(currentPlayer);
                    if(currentPlayer.equals("X")){
                        button21.setBackgroundColor(Color.parseColor("#D32F2F"));
                    }
                    else{
                        button21.setBackgroundColor(Color.parseColor("#536DFE"));
                    }
                    if(isWinner(currentPlayer)==1){
                        Toast.makeText(this,currentPlayer + " Won!",Toast.LENGTH_SHORT).show();
                        resetFields();

                    }
                    if(currentPlayer.equals("X")){
                        prevSign="X";
                        currentPlayer="O";
                    }
                    else{prevSign="O";
                        currentPlayer="X";
                    }
                } else {
                    Toast.makeText(this, "Already Occupied !", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.Button22: {
                sign = button22.getText().toString();
                if (button22.getText().toString().equals("-")) {
                    button22.setText(currentPlayer);
                    if(currentPlayer.equals("X")){
                        button22.setBackgroundColor(Color.parseColor("#D32F2F"));
                    }
                    else{
                        button22.setBackgroundColor(Color.parseColor("#536DFE"));
                    }
                    if(isWinner(currentPlayer)==1){
                        Toast.makeText(this,currentPlayer + " Won!",Toast.LENGTH_SHORT).show();
                        resetFields();

                    }
                    if(currentPlayer.equals("X")){
                        prevSign="X";
                        currentPlayer="O";
                    }
                    else{prevSign="O";
                        currentPlayer="X";
                    }
                } else {
                    Toast.makeText(this, "Already Occupied !", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.Button23: {
                sign = button23.getText().toString();
                if (button23.getText().toString().equals("-")) {
                    button23.setText(currentPlayer);
                    if(currentPlayer.equals("X")){
                        button23.setBackgroundColor(Color.parseColor("#D32F2F"));
                    }
                    else{
                        button23.setBackgroundColor(Color.parseColor("#536DFE"));
                    }
                    if(isWinner(currentPlayer)==1){
                        Toast.makeText(this,currentPlayer + " Won!",Toast.LENGTH_SHORT).show();
                        resetFields();

                    }
                    if(currentPlayer.equals("X")){
                        prevSign="X";
                        currentPlayer="O";
                    }
                    else{prevSign="O";
                        currentPlayer="X";
                    }
                } else {
                    Toast.makeText(this, "Already Occupied !", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.Button31: {
                sign = button31.getText().toString();
                if (button31.getText().toString().equals("-")) {
                    button31.setText(currentPlayer);
                    if(currentPlayer.equals("X")){
                        button31.setBackgroundColor(Color.parseColor("#D32F2F"));
                    }
                    else{
                        button31.setBackgroundColor(Color.parseColor("#536DFE"));
                    }
                    if(isWinner(currentPlayer)==1){
                        Toast.makeText(this,currentPlayer + " Won!",Toast.LENGTH_SHORT).show();
                        resetFields();

                    }
                    if(currentPlayer.equals("X")){
                        prevSign="X";
                        currentPlayer="O";
                    }
                    else{prevSign="O";
                        currentPlayer="X";
                    }
                } else {
                    Toast.makeText(this, "Already Occupied !", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.Button32: {
                sign = button32.getText().toString();
                if (button32.getText().toString().equals("-")) {
                    button32.setText(currentPlayer);
                    if(currentPlayer.equals("X")){
                        button32.setBackgroundColor(Color.parseColor("#D32F2F"));
                    }
                    else{
                        button32.setBackgroundColor(Color.parseColor("#536DFE"));
                    }
                    if(isWinner(currentPlayer)==1){
                        Toast.makeText(this,currentPlayer + " Won!",Toast.LENGTH_SHORT).show();
                        resetFields();

                    }
                    if(currentPlayer.equals("X")){
                        prevSign="X";
                        currentPlayer="O";
                    }
                    else{prevSign="O";
                        currentPlayer="X";
                    }
                } else {
                    Toast.makeText(this, "Already Occupied !", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.Button33: {
                sign = button33.getText().toString();
                if (button33.getText().toString().equals("-")) {
                    button33.setText(currentPlayer);
                    if(currentPlayer.equals("X")){
                        button33.setBackgroundColor(Color.parseColor("#D32F2F"));
                    }
                    else{
                        button33.setBackgroundColor(Color.parseColor("#536DFE"));
                    }
                    if(isWinner(currentPlayer)==1){
                        Toast.makeText(this,currentPlayer + " " + " Won!",Toast.LENGTH_SHORT).show();
                        resetFields();

                    }
                    if(currentPlayer.equals("X")){
                        prevSign="X";
                        currentPlayer="O";
                    }
                    else{
                        prevSign="O";
                        currentPlayer="X";
                    }
                } else {
                    Toast.makeText(this, "Already Occupied !", Toast.LENGTH_SHORT).show();
                }
                break;
            }
        }

    }

    public int isWinner(String s) {
        if ((button11.getText().toString().equals(s) && button11.getText().toString().equals(button22.getText().toString()) && button11.getText().toString().equals(button33.getText().toString()))
                || (button13.getText().toString().equals(s) && button13.getText().toString().equals(button22.getText().toString()) && button13.getText().toString().equals(button31.getText().toString()))
                || (button12.getText().toString().equals(s) && button12.getText().toString().equals(button22.getText().toString()) && button12.getText().toString().equals(button32.getText().toString()))
                || (button11.getText().toString().equals(s) && button11.getText().toString().equals(button22.getText().toString()) && button11.getText().toString().equals(button33.getText().toString()))
                || (button21.getText().toString().equals(s) && button21.getText().toString().equals(button22.getText().toString()) && button21.getText().toString().equals(button23.getText().toString()))
                || (button11.getText().toString().equals(s) && button11.getText().toString().equals(button12.getText().toString()) && button11.getText().toString().equals(button13.getText().toString()))
                || (button31.getText().toString().equals(s) && button31.getText().toString().equals(button32.getText().toString()) && button31.getText().toString().equals(button33.getText().toString()))
                || (button11.getText().toString().equals(s) && button11.getText().toString().equals(button21.getText().toString()) && button11.getText().toString().equals(button31.getText().toString()))
                || (button13.getText().toString().equals(s) && button13.getText().toString().equals(button23.getText().toString()) && button13.getText().toString().equals(button33.getText().toString()))
        ){  if(s.equals("X")){
            scorex++;
            scoreX.setText("Score X : " + scorex);
            }
            if(s.equals("O")){
                scoreo++;
                scoreO.setText("Score O : " + scoreo);
            }
            return 1;
        }
        else return 0;
    }
    public void resetFields(){
        button11.setText("-");
        button12.setText("-");
        button13.setText("-");
        button21.setText("-");
        button22.setText("-");
        button23.setText("-");
        button31.setText("-");
        button32.setText("-");
        button33.setText("-");
        button11.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button12.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button13.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button21.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button22.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button23.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button31.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button32.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button33.setBackgroundColor(Color.parseColor("#FFCDD2"));
    }
    public void resetScore(){
        button11.setText("-");
        button12.setText("-");
        button13.setText("-");
        button21.setText("-");
        button22.setText("-");
        button23.setText("-");
        button31.setText("-");
        button32.setText("-");
        button33.setText("-");
        button11.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button12.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button13.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button21.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button22.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button23.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button31.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button32.setBackgroundColor(Color.parseColor("#FFCDD2"));
        button33.setBackgroundColor(Color.parseColor("#FFCDD2"));
        scoreo = 0;
        scorex = 0;
        scoreX.setText("Score X : " + scorex);
        scoreO.setText("Score O : " + scoreo);
    }
}
