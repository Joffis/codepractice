package fi.tamk.soundapp;

/**
 * Created by Jofi on 29.3.2016.
 */
public class SoundItem {
    private int soundID;
    private String name;

    public SoundItem(){
        soundID = 0;
        name = "No Sound";
    }

    public SoundItem(String name, int id){
        this.soundID = id;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSoundID(int id){
        this.soundID = id;
    }

    public String getName(){
        return this.name;
    }

    public int getSoundID(){
        return this.soundID;
    }

    @Override
    public String toString(){
        return name;
    }
}
