package jugueton;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Mecanico.java
//  @ Date : 15/07/2015
//  @ Author : Daniel Orozco 
//
//




public class Mecanico extends Juguete
{
    private int complejidad;

    public Mecanico(int complejidad, int codigo, float valorUnitario, String marca, int edad, float valorAdicional, int numProveedor) {
        super(codigo, valorUnitario, marca, edad, valorAdicional, numProveedor);
        this.complejidad = complejidad;
    }

    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }
    
    @Override
    public float precioFinal()
    {
        return (float) (this.getValorUnitario() + this.complejidad*this.getValorAdicional() );
    }
        
}
