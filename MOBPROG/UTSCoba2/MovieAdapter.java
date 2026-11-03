package com.example.utscobaterakhir;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder>{
    public interface OnItemClickListener {
        void onItemClick(Movie movie);
    }
    ArrayList<Movie> moviesInAdapter;
    OnItemClickListener listener;

    public MovieAdapter(ArrayList<Movie> movies, OnItemClickListener listener) {
        moviesInAdapter = movies;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_movies, parent, false);
        return new MovieViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = moviesInAdapter.get(position);
        holder.tvMovieTitle.setText(movie.getTitle());
        holder.tvMovieGenre.setText(movie.getGenre());

        holder.itemView.setOnClickListener(view -> {
            if (listener != null) {
                listener.onItemClick(movie);
            }
        });

    }

    @Override
    public int getItemCount() {
        return moviesInAdapter.size();
    }



    public class MovieViewHolder extends RecyclerView.ViewHolder{
        TextView tvMovieTitle, tvMovieGenre;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMovieTitle = itemView.findViewById(R.id.tvMovieTitle);
            tvMovieGenre = itemView.findViewById(R.id.tvMovieGenre);
        }
    }
}
