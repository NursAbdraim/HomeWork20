package com.company;

public enum Day {
    MONDAY("Duishombu"),
    TUESDAY("Sheyshembi"),
    WEDNESDAY("Sharshembi"),
    THURSDAY("Beishembi"),
    FRIDAY("Zhuma"),
    SATURDAY("Ishembi"),
    SUNDAY("Zhekshembi");



    private String kotormo;

    Day(String kotormo){
        this.kotormo = kotormo;
    }

    public String getKotormo() {
        return kotormo;
    }

    public void setKotormo(String kotormo) {
        this.kotormo = kotormo;
    }

}
