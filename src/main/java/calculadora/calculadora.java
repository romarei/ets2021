/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

public class calculadora {
    private int num1;
    private int num2;
    public calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    public int suma(){
        int result=num1+num2;
        return result;
    }
    public int resta(){
     int resul;
     if (resta2())resul=num1-num2;
     else resul=num2-num1;
     return resul;
 }
 public boolean resta2(){    
     if(num1>=num2)return true;
     else
         return false;
     
 }
    public int multiplicar(){
        int result=num1*num2;
        return result;
    }
    public int divide(){
        int result=num1/num2;
        return result;
    }

}