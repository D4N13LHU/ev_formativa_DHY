package org.DHY;

public abstract class Empleado {
    protected String nombre;
    protected String idEmpleado;
    protected String telefono;
    protected boolean activo;
    protected double salarioBase;

    public Empleado(String nombre, String idEmpleado, String telefono, boolean activo) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.telefono = telefono;
        this.activo = activo;

    }

    abstract double calcularSalario();
    abstract String obtenerRol();


}
