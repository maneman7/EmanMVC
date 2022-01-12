/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kampusapp.model;

/**
 *
 * @author emanu
 */
public class Mahasiswa {
    private int id;
    private String nomorktp;
    private String nomorkk;
    private String nama;
    private String alamat;
    private String no_hp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomorktp() {
        return nomorktp;
    }

    public void setNomorktp(String nomorktp) {
        this.nomorktp = nomorktp;
    }

    public String getNomorkk() {
        return nomorkk;
    }

    public void setNomorkk(String nomorkk) {
        this.nomorkk = nomorkk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }
    
}
