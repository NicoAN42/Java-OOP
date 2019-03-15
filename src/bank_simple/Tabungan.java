/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_simple;

import java.util.Vector;

/**
 *
 * @author Acer
 */
public class Tabungan extends Layanan {

    private String noRek = "";
    private Vector<Transaksi> tList = new Vector();

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public Vector<Transaksi> getTList() {
        return tList;
    }

    @Override
    public void setor(long nominal) {
        super.setor(nominal);
        Date date = new Date(31, 03, 2019);
        Transaksi tr = new Transaksi(date, nominal, "Credit");
        tList.add(tr);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tarik(long nominal) {
        super.tarik(nominal);
        Date date = new Date(01, 04, 2019);
        Transaksi tr = new Transaksi(date, nominal, "Debit");
        tList.add(tr);
        //To change body of generated methods, choose Tools | Templates.
    }

}
