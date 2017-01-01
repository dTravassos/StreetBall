package com.app.diogotravassos.streetball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer points_side_a = 0;

    private Integer points_side_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initialize();
    }

    public void initialize(){
        points_side_a = 0;

        points_side_b = 0;
        addPoints(R.id.point_a, points_side_a);
        addPoints(R.id.point_b, points_side_b);
    }

    public void doPointsSideA(View v) {
        String param = (String) v.getTag();

        points_side_a += Integer.parseInt(param);

        addPoints(R.id.point_a, points_side_a);
    }

    public void doPointsSideB(View v) {
        String param = (String) v.getTag();

        points_side_b += Integer.parseInt(param);

        addPoints(R.id.point_b, points_side_b);
    }

    private void addPoints(int id_view, int score) {
        TextView scoreView = (TextView) findViewById(id_view);
        scoreView.setText(String.valueOf(score));
    }

}
