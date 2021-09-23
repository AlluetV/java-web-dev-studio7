package org.launchcode.studio7;

import java.util.HashMap;
import java.util.Map;

public class GenericDisk {
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
    public void setNameDisk(String nameDisk) {
        this.nameDisk = nameDisk;
    }

    public void setCapacityDisK(int capacityDisK) {
        this.capacityDisK = capacityDisK;
    }

    public void setTypeDisk(String typeDisk) {
        this.typeDisk = typeDisk;
    }

    public void setSpeedRange(String speedRange) {
        this.speedRange = speedRange;
    }

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


    public void spin(){
        System.out.println("A " + this.typeDisk + "spins a rate of " + this.speedRange + "rpm.");
    }

    public String pause() {
        return "*Silence*";
    }


    public void rewindDisc() {
        System.out.println("Rewind, rewind!");
    }


    public String reportData() {
        return this.toString();
    }


    public String readData() {
        return this.toString();
    }

}
