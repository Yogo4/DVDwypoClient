package com.example.dvdwypoclient;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class DataModel {

    private SimpleIntegerProperty id_dvd;
    private SimpleIntegerProperty id_zamowienia;
    private SimpleStringProperty tytul;
    private SimpleStringProperty rezyser;
    private SimpleStringProperty aktor;
    private SimpleStringProperty typ;
    private SimpleStringProperty imie;
    private SimpleStringProperty nazwisko;
    private SimpleStringProperty stan;
    private SimpleIntegerProperty ilosc;
    //server
    public DataModel(String Tytul,  String Rezyser, Integer id_zamowienia, String Imie, String Nazwisko, String Stan){
        this.id_zamowienia = new SimpleIntegerProperty(id_zamowienia);
        this.tytul = new SimpleStringProperty(Tytul);
        this.rezyser = new SimpleStringProperty(Rezyser);
        this.imie = new SimpleStringProperty(Imie);
        this.nazwisko = new SimpleStringProperty(Nazwisko);
        this.stan = new SimpleStringProperty(Stan);


    }

    //client
    public DataModel(Integer id_dvd, String Tytul,  String Rezyser, String Aktor, String Typ,Integer ilosc){
        this.id_dvd = new SimpleIntegerProperty(id_dvd);
        this.tytul = new SimpleStringProperty(Tytul);
        this.rezyser = new SimpleStringProperty(Rezyser);
        this.aktor = new SimpleStringProperty(Aktor);
        this.typ = new SimpleStringProperty(Typ);
        this.ilosc = new SimpleIntegerProperty(ilosc);

    }

    // Getter and Setter for id_zamowienia
    public int getId_zamowienia() {
        return id_zamowienia.get();
    }

    public void setId_zamowienia(int id_zamowienia) {
        this.id_zamowienia = new SimpleIntegerProperty(id_zamowienia);
    }

    // Getter and Setter for Tytul
    public String getTytul() {
        return tytul.get();
    }

    public void setTytul(String Tytul) {
        this.tytul = new SimpleStringProperty(Tytul);
    }

    // Getter and Setter for Rezyser
    public String getRezyser() {
        return rezyser.get();
    }

    public void setRezyser(String Rezyser) {
        this.rezyser = new SimpleStringProperty(Rezyser);
    }

    // Getter and Setter for Aktor
    public String getAktor() {
        return aktor.get();
    }

    public void setAktor(String Aktor) {
        this.aktor = new SimpleStringProperty(Aktor);
    }

    // Getter and Setter for Typ
    public String getTyp() {
        return typ.get();
    }

    public void setTyp(String Typ) {
        this.typ = new SimpleStringProperty(Typ);
    }

    // Getter and Setter for Imie
    public String getImie() {
        return imie.get();
    }

    public void setImie(String Imie) {
        this.imie = new SimpleStringProperty(Imie);
    }

    // Getter and Setter for Nazwisko
    public String getNazwisko() {
        return nazwisko.get();
    }

    public void setNazwisko(String Nazwisko) {
        this.nazwisko = new SimpleStringProperty(Nazwisko);
    }
    // Getter and Setter for Stan
    public String getStan() {
        return stan.get();
    }

    public void setStan(String Stan) {
        this.stan = new SimpleStringProperty(Stan);
    }
    // Getter and Setter for Stan
    public int getId_dvd() {
        return id_dvd.get();
    }

    public void setId_dvd(Integer Id_dvd) {
        this.id_dvd = new SimpleIntegerProperty(Id_dvd);
    }
    // Getter and Setter for Stan
    public int getIlosc() {
        return ilosc.get();
    }

    public void setIlosc(Integer ilosc) {
        this.ilosc = new SimpleIntegerProperty(ilosc);
    }



}
