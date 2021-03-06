package com.HARR.x00216519;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Empleado {
    protected String nombre;
    protected String puesto;
    protected ArrayList<Documento>doc;
    protected double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
       doc=new ArrayList<>();
    }
    Scanner scan=new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public ArrayList<Documento> getDoc() {
        return doc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void addDocumento() throws ExistingName {
        System.out.println("Ingrese nombre del documento");
        String nombre=scan.nextLine();
        System.out.println("Ingrese numero del documento");
        String numero=scan.nextLine();
        for(Documento docs:doc)
            if(docs.getNumero().equalsIgnoreCase(numero)) throw new ExistingName("Nombre ya existente");
        doc.add(new Documento(nombre,numero));
    }

    public void removeDocument(String numero){
            Documento aux = null;

            for(Documento empleado : doc){
                if(empleado.getNumero().equalsIgnoreCase(numero))
                    aux = empleado;
            }
            if(aux != null) {
                doc.remove(aux);
            }
        }

        public int getExtension(){return 0;};
    }

