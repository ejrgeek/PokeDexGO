package com.example.pokedexgo.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.pokedexgo.R;
import com.example.pokedexgo.adapter.PokeListAdapter;
import com.example.pokedexgo.constants.PokemonsConstants;
import com.example.pokedexgo.data.PokemonMock;
import com.example.pokedexgo.entities.Pokemon;
import com.example.pokedexgo.listener.OnListInteractionListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_pokeball);

        this.mContext = this;

        PokemonMock pokemonMock = new PokemonMock(this);
        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.addAll(pokemonMock.getmListPokemons());

        //! Pegar RecyclerView
        this.mViewHolder.recyclerPokes = this.findViewById(R.id.recycler_pokemons);

        OnListInteractionListener listener = new OnListInteractionListener() {
            @Override
            public void onClick(int id) {
                Bundle bundle = new Bundle();
                bundle.putInt(PokemonsConstants.POKEMON_ID, id);

                Intent intent = new Intent(mContext, Details.class);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        };

        //! Definir Adpter
        PokeListAdapter pokeListAdapter = new PokeListAdapter(pokemonList, listener);
        this.mViewHolder.recyclerPokes.setAdapter(pokeListAdapter);

        //! Definir layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerPokes.setLayoutManager(linearLayoutManager);

    }

    private static class ViewHolder {
        RecyclerView recyclerPokes;
    }

}
