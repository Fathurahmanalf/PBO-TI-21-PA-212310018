package com.ibik.pbo.praktikum;

import java.util.ArrayList;

import javax.lang.model.element.Element;
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class App 
{
    public static void main( String[] args )
    {
    ArrayList<String> atas = new ArrayList<>();
    atas.add("Nama Lengkap");
    atas.add("Alamat");
    atas.add("No Telp");
    
    ArrayList<ArrayList<String>> isi = new ArrayList<ArrayList<String>>();

    // isi.add(new ArrayList<String>());
    // isi.get(0).add( 0,  "Septian Cahyadi");
    // isi.get(0).add( 1,  "Dramaga" );
    // isi.get(0).add(2, "08232374284");

    // isi.add(new ArrayList<String>());
    // isi.get(0).add(0,"Isnan Mulia");
    // isi.get(0).add(1, "Manunggal");
    // isi.get(0).add(2,"082949248928");

    // isi.add(new ArrayList<String>());
    // isi.get(0).add(0,"Edi N");
    // isi.get(0).add(1, "Cimanggu");
    // isi.get(0).add(2, "0824084028");

    //output
    for (int i = 0; i < atas.size(); i++){
        isi.add(new ArrayList<String>());
        for(int j = 0; j < atas.size(); j++){
            String value = JOptionPane.showInputDialog(null, "Masukan " + atas.get(j),
                            "Data Array [" + i + "][" + j +"]",
                            JOptionPane.QUESTION_MESSAGE);
            isi.get(i).add(j, value);    
        }
    }

    String output = "";
    for(int i = 0; i < atas.size(); i++){
        for(int j = 0; j < atas.size(); j++){
            output += atas.get(j) + " : " + isi.get(i).get(j) + "\n";
        }
        output += "\n";
    }

    JOptionPane.showMessageDialog(null,  output, "Output", JOptionPane.QUESTION_MESSAGE);;
    }
}
