package com.example.robertoveigajunior.timengole.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.robertoveigajunior.timengole.R;
import com.example.robertoveigajunior.timengole.listener.OnClickListener;
import com.example.robertoveigajunior.timengole.model.Time;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by robertoveigajunior on 19/11/16.
 */

public class TimeListAdapter extends RecyclerView.Adapter<TimeListAdapter.TimesViewHolder> {

    private final Context context;
    private final List<Time> times;

    private OnClickListener clickListener;

    public TimeListAdapter(Context context, List<Time> times, OnClickListener clickListener) {
        this.context = context;
        this.times = times;
        this.clickListener = clickListener;
    }

    @Override
    public TimesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context)
                .inflate(R.layout.carro_row, parent, false);
        return new TimesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final TimesViewHolder holder, final int position) {
        Time c = times.get(position);
        holder.tvNome.setText(c.getNome());
        holder.tvDescricao.setText(c.getAnoFundacao());
        //get image data and show
        Picasso.with(context)
                .load(c.getEscudo())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.ivEscudo);

        if (clickListener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickListener.onClick(holder.itemView, position);

                }
            });
        }
    }

    public Time getItem(int position) {
        return times.get(position);
    }

    @Override
    public int getItemCount() {
        return this.times != null ? this.times.size() : 0;
    }

    public static class TimesViewHolder extends RecyclerView.ViewHolder {
        TextView tvNome;
        TextView tvDescricao;
        ImageView ivEscudo;

        public TimesViewHolder(View itemView) {
            super(itemView);
            tvNome = (TextView) itemView.findViewById(R.id.tvNome);
            tvDescricao = (TextView) itemView.findViewById(R.id.tvDescricao);
            ivEscudo = (ImageView) itemView.findViewById(R.id.ivEscudo);
        }
    }
}
