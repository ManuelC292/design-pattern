import composant.Boisson;
import composant.Expresso;
import composant.Sumatra;
import decorateur.Caramel;
import decorateur.Chantilly;
import decorateur.Chocolat;

import java.io.*;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {
        Boisson boisson;
        boisson = new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        boisson = new Chantilly(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        Boisson b = new Chocolat(new Caramel(new Chantilly(new Sumatra())));
        System.out.println(b.getDescription());
        System.out.println(b.cout());

        //java io basé sur ce pattern outputStream
/*        OutputStream outputStream = new ZipOutputStream(new BufferedOutputStream(new FileWriter(new FileWriter("Fichier.zip"))));
        outputStream.write(34);*/
    }
}