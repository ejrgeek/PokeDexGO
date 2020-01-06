package com.example.pokedexgo.entities;

import android.graphics.drawable.Drawable;

public class Pokemon {
    public int id;
    public String name;
    public String type;
    public String weakness;
    public Drawable img;

    public Pokemon(int id, String name, String type, String weakness, Drawable img) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.weakness = weakness;
        this.img = img;
    }
}
