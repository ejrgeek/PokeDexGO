package com.example.pokedexgo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pokedexgo.R;
import com.example.pokedexgo.entities.Pokemon;
import com.example.pokedexgo.listener.OnListInteractionListener;
import com.example.pokedexgo.viewholder.PokeViewHolder;

import java.util.List;

public class PokeListAdapter extends RecyclerView.Adapter<PokeViewHolder> {

    private List<Pokemon> mPokemonList;
    private OnListInteractionListener mOnListInteractionListener;

    public PokeListAdapter(List<Pokemon> pokemons, OnListInteractionListener listener) {
        this.mPokemonList = pokemons;
        this.mOnListInteractionListener = listener;
    }

    @Override
    public PokeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View pokeView = inflater.inflate(R.layout.row_poke_list, parent, false);
        return new PokeViewHolder(pokeView);
    }

    @Override
    public void onBindViewHolder(PokeViewHolder holder, int position) {
        Pokemon pokemon = this.mPokemonList.get(position);
        holder.bindData(pokemon, this.mOnListInteractionListener);
    }

    @Override
    public int getItemCount() {
        return this.mPokemonList.size();
    }
}
