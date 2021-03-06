package com.example;

/**
 * Created by dennis on 17.08.15.
 */
public class Bier implements Comparable<Bier> {

    private String name;
    private String herkunft;
    private float inhalt;

    @Override
    public int compareTo(Bier b) {
        if (b.getName() == null && this.getName() == null) {
            return 0;
        }
        if (this.getName() == null) {
            return 1;
        }
        if (b.getName() == null) {
            return -1;
        }
        return this.getName().compareTo(b.getName());
    }


    public Bier(String name, String herkunft, float inhalt) {
        this.name = name;
        this.herkunft = herkunft;
        this.inhalt = inhalt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHerkunft() {
        return herkunft;
    }

    public void setHerkunft(String herkunft) {
        this.herkunft = herkunft;
    }

    public float getInhalt() {
        return inhalt;
    }

    public void setInhalt(float inhalt) {
        this.inhalt = inhalt;
    }
    public String toString() {
        return this.name + " aus " + this.herkunft + " mit " + this.inhalt + " Litern";
    }
}
