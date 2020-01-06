package com.example.pokedexgo.data;

import android.app.Activity;

import androidx.core.content.ContextCompat;

import com.example.pokedexgo.R;
import com.example.pokedexgo.entities.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokemonMock {
    private List<Pokemon> mListPokemons;

    public PokemonMock(Activity activity) {
        this.mListPokemons = getPokemonMockList(activity);
    }

    public List<Pokemon> getmListPokemons() {
        return this.mListPokemons;
    }

    public Pokemon get(int id) {
        return this.mListPokemons.get(id);
    }

    public List<Pokemon> getPokemonMockList(Activity activity) {
        List<Pokemon> mPokemonList = new ArrayList<>();
        int id = 0;
        Pokemon charizard = new Pokemon(id, "Charizard", "Fogo", "Agua", ContextCompat.getDrawable(activity, R.drawable.charizard));
        mPokemonList.add(charizard);

        Pokemon blastoise = new Pokemon(++id, "Blastoise", "Agua", "Eletricidade", ContextCompat.getDrawable(activity, R.drawable.blastoise));
        mPokemonList.add(blastoise);

        Pokemon venusaur = new Pokemon(++id, "Venusaur", "Grama", "Fogo", ContextCompat.getDrawable(activity, R.drawable.venusaur));
        mPokemonList.add(venusaur);

        Pokemon abra = new Pokemon(++id, "Abra", "Psiquico", "Fantasma", ContextCompat.getDrawable(activity, R.drawable.abra));
        mPokemonList.add(abra);

        Pokemon rhyhorn = new Pokemon(++id, "Rhyhorn", "Terrestre", "Grama", ContextCompat.getDrawable(activity, R.drawable.rhyhorn));
        mPokemonList.add(rhyhorn);

        Pokemon magneton = new Pokemon(++id, "Magneton", "Eletrico", "Terrestre", ContextCompat.getDrawable(activity, R.drawable.magneton));
        mPokemonList.add(magneton);

        Pokemon vileplume = new Pokemon(++id, "Vileplume", "Grama", "Fogo", ContextCompat.getDrawable(activity, R.drawable.vileplume));
        mPokemonList.add(vileplume);

        Pokemon weezing = new Pokemon(++id, "Weezing", "Veneno", "Psiquico", ContextCompat.getDrawable(activity, R.drawable.weezing));
        mPokemonList.add(weezing);

        Pokemon ditto = new Pokemon(++id, "Ditto", "Normal", "Lutador", ContextCompat.getDrawable(activity, R.drawable.ditto));
        mPokemonList.add(ditto);

        Pokemon alakazam = new Pokemon(++id, "Alakazam", "Psiquico", "Fantasma", ContextCompat.getDrawable(activity, R.drawable.alakazam));
        mPokemonList.add(alakazam);

        Pokemon poliwrath = new Pokemon(++id, "Poliwrath", "Agua", "Eletricidade", ContextCompat.getDrawable(activity, R.drawable.poliwrath));
        mPokemonList.add(poliwrath);

        Pokemon graveler = new Pokemon(++id, "Graveler", "Pedra", "Grama", ContextCompat.getDrawable(activity, R.drawable.graveler));
        mPokemonList.add(graveler);

        return mPokemonList;

    }


}
