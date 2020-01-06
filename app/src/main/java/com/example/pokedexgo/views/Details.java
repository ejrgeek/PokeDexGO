package com.example.pokedexgo.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pokedexgo.R;
import com.example.pokedexgo.constants.PokemonsConstants;
import com.example.pokedexgo.data.PokemonMock;
import com.example.pokedexgo.entities.Pokemon;

public class Details extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private PokemonMock mPokemonMock;
    private Pokemon mPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_pokeball);

        this.mPokemonMock = new PokemonMock(this);

        this.mViewHolder.textName = this.findViewById(R.id.idName);
        this.mViewHolder.textType = this.findViewById(R.id.idType);
        this.mViewHolder.textWeakness = this.findViewById(R.id.idWeakness);
        this.mViewHolder.imgPoke = this.findViewById((R.id.idImage));

        this.getDataFromActivite();
        this.setData();

    }

    private void getDataFromActivite() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.mPokemon = this.mPokemonMock.get(extras.getInt(PokemonsConstants.POKEMON_ID));
        }
    }

    private void setData() {
        this.mViewHolder.imgPoke.setImageDrawable(this.mPokemon.img);
        this.mViewHolder.textName.setText(this.mPokemon.name);
        this.mViewHolder.textType.setText(this.mPokemon.type);
        this.mViewHolder.textWeakness.setText(this.mPokemon.weakness);

    }

    private static class ViewHolder {
        TextView textName;
        TextView textType;
        TextView textWeakness;
        ImageView imgPoke;
    }

}
