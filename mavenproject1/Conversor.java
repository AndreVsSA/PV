/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.edu.iftm.mavenproject1;

/**
 *
 * @author IFTM
 */
public class Conversor {

    public int calculaCK(int a) {
        a = a + 273;
        return a;
    }

    public int calculaKC(int a) {
        a = a - 273;
        return a;
    }

    public double calculaCF(double a) {
        a = (a * 1.8) + 32;
        return a;
    }

    public double calculaFC(double a) {
        a = (a - 32) * (5 / 9);
        return a;
    }

    public double calculaKF(double a) {
        a = 1.8 * (a - 273) + 32;
        return a;
    }

    public double calculaFK(double a) {
        a = (a + 459.67) * (5 / 9);
        return a;
    }
}
