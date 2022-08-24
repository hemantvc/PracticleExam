package org.hariom.practicleexam.histogram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayData {
    private ProcessData processData;
    DisplayData(){
        processData = new ProcessData();
    }
    private void generateData(){
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        // Single data insert
        DogsData dogsData1 = null;
        try {
            dogsData1 = new DogsData(formatter.parse("1-june-2022"),2.34);
            processData.addDogsData(dogsData1);
            DogsData dogsData2 = new DogsData(formatter.parse("2-june-2022"),2.35);
            processData.addDogsData(dogsData2);
            DogsData dogsData3 = new DogsData(formatter.parse("3-june-2022"),2.37);
            processData.addDogsData(dogsData2);
            DogsData dogsData4 = new DogsData(formatter.parse("4-june-2022"),2.39);
            processData.addDogsData(dogsData4);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        // Multiple data insert

    }
}
