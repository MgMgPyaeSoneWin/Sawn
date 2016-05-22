package com.mmucsy.sawn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Timetable> table;
    private RecyclerView recyclerView;
    private TimetableAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);

        table = new ArrayList<>();
        table.add(new Timetable("14-12-1995","14-12-1995","12:00","14:00"));
        table.add(new Timetable("14-12-1995","14-12-1995","12:00","14:00"));
        table.add(new Timetable("14-12-1995","14-12-1995","12:00","14:00"));
        table.add(new Timetable("14-12-1995","14-12-1995","12:00","14:00"));
        table.add(new Timetable("14-12-1995","14-12-1995","12:00","14:00"));
        table.add(new Timetable("14-12-1995","14-12-1995","12:00","14:00"));

        Toast.makeText(getApplicationContext(),table.isEmpty()+"",Toast.LENGTH_SHORT).show();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new TimetableAdapter(getApplicationContext(), table);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

}
