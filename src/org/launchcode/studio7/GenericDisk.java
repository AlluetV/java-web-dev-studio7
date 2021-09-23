package org.launchcode.studio7;

import java.util.HashMap;

public class GenericDisk implements GenericDiskActions {
    private String nameDisk;
    private int capacityDisK;
    private String typeDisk;
    private String speedRange;
    private HashMap<Integer,String> contentsDisk;

    //constructor

    public GenericDisk(String nameDisk, int capacityDisK, String typeDisk, String speedRange, HashMap<Integer, String> contentsDisk) {
        this.nameDisk = nameDisk;
        this.capacityDisK = capacityDisK;
        this.typeDisk = typeDisk;
        this.speedRange = speedRange;
        this.contentsDisk = contentsDisk;
    }


    //getters

    public String getNameDisk() {
        return nameDisk;
    }

    public int getCapacityDisK() {
        return capacityDisK;
    }

    public String getTypeDisk() {
        return typeDisk;
    }

    public String getSpeedRange() {
        return speedRange;
    }

    public HashMap<Integer, String> getContentsDisk() {
        return contentsDisk;
    }

    //Setters


    public void setContentsDisk(HashMap<Integer, String> contentsDisk) {
        this.contentsDisk = contentsDisk;
    }

    //Methods


    @Override
    public String toString() {
        return "GenericDisk{" +
                "nameDisk='" + nameDisk + '\'' +
                ", capacityDisK=" + capacityDisK +
                ", typeDisk='" + typeDisk + '\'' +
                ", speedRange='" + speedRange + '\'' +
                ", contentsDisk=" + contentsDisk +
                '}';
    }

    @Override
    public void spin(){
        System.out.println("A " + this.typeDisk + "spins a rate of " + this.speedRange + "rpm.");
    }

    @Override
    public String pause() {
        return "*Silence*";
    }

    @Override
    public void rewindDisc() {
        System.out.println("Rewind, rewind!");
    }

    @Override
    public String reportData() {
        return this.toString();
    }

    @Override
    public String readData() {
        return this.toString();
    }

}
