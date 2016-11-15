/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class LivingRoom {

    private int sofas;
    private int tvs;
    private int computers;
    private int lights;
    private int phones;
    private int books;

    public LivingRoom(int sofas,
            int tvs, int computers,
            int lights, int phones,
            int books) {
        this.sofas = sofas;
        this.tvs = tvs;
        this.computers = computers;
        this.lights = lights;
        this.phones = phones;
        this.books = books;
    }

    public int getSofas() {
        return sofas;
    }

    public int getTvs() {
        return tvs;
    }

    public int getComputers() {
        return computers;
    }

    public int getLights() {
        return lights;
    }

    public int getPhones() {
        return phones;
    }

    public int getBooks() {
        return books;
    }

}
