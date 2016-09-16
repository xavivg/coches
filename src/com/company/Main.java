package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	System.out.println("hello world");

        coche Ferrari = new coche("Ferrari","488GTB","5886GGB",670,280000.0);
        coche Porsche = new coche("Porsche","911 GT3RS","4000XXZ",580,260000.0);
        coche Mercedes = new coche("Mercedes-benz","AMG GT","5856GGB",590,220000.0);
        List<coche> cocheList= new ArrayList<>();

        cocheList.add(Ferrari);
        cocheList.add(Porsche);
        cocheList.add(Mercedes);

        System.out.println("Muestro Mercedes: "+cocheList.get(2));

        System.out.println("Muestro Mercedes: "+cocheList.get(1));

        HashMap<String, coche> map = new HashMap<>();

        map.put(Ferrari.getMatricula(),Ferrari);/*Voy a usar la matricula como index para imprimir todo el coche*/
        map.get(Ferrari.getMatricula());
        map.put(Mercedes.getMatricula(),Mercedes);/*Voy a usar la matricula como index para imprimir todo el coche*/
        map.get(Mercedes.getMatricula());


        System.out.println("hash matricula Ferrari: "+map.get(Ferrari.getMatricula()));
        System.out.println("hash matricula Mercedes: "+map.get(Mercedes.getMatricula()));
        System.out.println("Muestro las keys "+map.keySet());
        System.out.println("Muestro los values "+map.values());
    }
}
