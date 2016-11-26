package com.example.robertoveigajunior.timengole.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by LamborghiniLeptop on 26/11/2016.
 */

public class Time implements Parcelable {

    private String nome;
    private String estado;
    private String escudo;
    private int anoFundacao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public String getEscudo() {
        return escudo;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    protected Time(Parcel in) {
        nome = in.readString();
        estado = in.readString();
        escudo = in.readString();
        anoFundacao = in.readInt();
    }

    public static final Creator<Time> CREATOR = new Creator<Time>() {
        @Override
        public Time createFromParcel(Parcel in) {
            return new Time(in);
        }

        @Override
        public Time[] newArray(int size) {
            return new Time[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(estado);
        dest.writeString(escudo);
        dest.writeInt(anoFundacao);
    }
}
