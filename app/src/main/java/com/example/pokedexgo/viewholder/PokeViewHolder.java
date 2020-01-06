package com.example.pokedexgo.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pokedexgo.R;
import com.example.pokedexgo.entities.Pokemon;
import com.example.pokedexgo.listener.OnListInteractionListener;

public class PokeViewHolder extends RecyclerView.ViewHolder {

    private TextView mPokeName;
    private ImageView mImgPokemon;
    private TextView mDetails;

    public PokeViewHolder(View itemView) {
        super(itemView);
        this.mPokeName = itemView.findViewById(R.id.idNamePokemon);
        this.mImgPokemon = itemView.findViewById(R.id.idImage);
        this.mDetails = itemView.findViewById(R.id.idDetails);
    }

    public void bindData(final Pokemon pokemon, final OnListInteractionListener listener) {

        //Alterar Valor
        this.mImgPokemon.setImageDrawable(pokemon.img);
        this.mPokeName.setText(pokemon.name);

        this.mDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(pokemon.id);
            }
        });
    }

}
