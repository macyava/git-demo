package com.hspedu.extends_;

public class Computer {
    private String cpu;
    private int ram;
    private int disk;


    public Computer(String cpu, int ram, int disk) {
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getDetails() {
        return "cpu=" + cpu + " " + "ram=" + ram + " " + "disk=" + disk;
    }

}
