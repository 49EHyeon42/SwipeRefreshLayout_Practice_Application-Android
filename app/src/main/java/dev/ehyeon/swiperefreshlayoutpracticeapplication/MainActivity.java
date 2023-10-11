package dev.ehyeon.swiperefreshlayoutpracticeapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwipeRefreshLayout swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout);
        TextView textView = findViewById(R.id.textView);

        swipeRefreshLayout.setOnRefreshListener(() -> {
            textView.setText("Hello World! " + ++count);

            swipeRefreshLayout.setRefreshing(false);
        });
    }
}
