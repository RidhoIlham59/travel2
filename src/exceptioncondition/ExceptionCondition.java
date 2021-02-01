/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptioncondition;

/**
 *
 * @author Panji Setiawan
 */
public class ExceptionCondition {

    /**
     * @param args the command line arguments
     */
    public void illegalArgument(int a, int b){
        if(a < 0 || b < 0)
        {
            throw new IllegalArgumentException("nilai a :"+a+"nilai b :"+b);
        }
        else
        {
            System.out.println("Hasil : "+a/b);
        }
    }
    public int jumlah(int a, int b){
        int hasil= a+b;
        System.out.println("Hasil "+a+" + "+b+" adalah "+hasil);
        return hasil;
    }
    public int pembagian(int a, int b){
        int hasil = a/b;
        System.out.println("Hasil :"+hasil);
        return hasil;
    }
    public int stackOverflow(int a){
    ExceptionCondition e = new ExceptionCondition();
    return a * e.stackOverflow(a);
    }
    public void looping(){
        while(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ExceptionCondition e = new ExceptionCondition();
        e.illegalArgument(10, 2);
        e.jumlah(10, 10);
        e.pembagian(10, 5);
        //e.stackOverflow(2);
        e.looping();
    }
    
}
