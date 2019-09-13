package com.designPattern.creational.factory;

public abstract class JDComputer {

    //Factory pattern requires interface,abstract class or normal java class to hide the object creation logic

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
