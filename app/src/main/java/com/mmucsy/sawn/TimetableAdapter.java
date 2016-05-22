package com.mmucsy.sawn;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

/**
 * Created by pyaesone on 5/20/16.
 */
public class TimetableAdapter extends RecyclerView.Adapter<TimetableAdapter.TimetableViewHolder> {

    List<Timetable> tableData = Collections.emptyList();
    private Context context;
    private LayoutInflater inflater;

    public TimetableAdapter(Context context, List<Timetable> tableData) {

        this.context = context;
        inflater = LayoutInflater.from(context);
        this.tableData = tableData;

    }

    @Override
    public TimetableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //View view = inflater.inflate(R.layout.activity_main, parent, false);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        TimetableViewHolder holder = new TimetableViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(TimetableViewHolder holder, int position) {

        holder.day_english.setText(tableData.get(position).day_eng);
        holder.day_arabic.setText(tableData.get(position).day_arabic);
        holder.time_start.setText(tableData.get(position).time_start);
        holder.time_end.setText(tableData.get(position).time_end);
        //holder.countryPhoto.setImageResource(R.mipmap.ic_launcher);

    }

    @Override
    public int getItemCount() {
        return tableData.size();
    }

    class TimetableViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {

        CardView cardView;
        TextView day_arabic, day_english, time_start, time_end;
        ImageView countryPhoto;

        public TimetableViewHolder(View itemView) {

            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cardview);
            day_arabic = (TextView) itemView.findViewById(R.id.day_arabic);
            day_english = (TextView) itemView.findViewById(R.id.day_english);
            time_start = (TextView) itemView.findViewById(R.id.time_start);
            time_end = (TextView) itemView.findViewById(R.id.time_end);

            itemView.setOnCreateContextMenuListener(this);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(context,"Clicked",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(context, DetailActivity.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(i);
                }
            });

        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        }
    }


}
