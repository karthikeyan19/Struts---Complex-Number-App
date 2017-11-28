/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author mca
 */
public class Operation extends ActionSupport{
    
   private int r1;
   private int i1;
   private int r2;
   private int i2;
   
   private String operation;

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
   private String res;
   
   public String execute() throws Exception{
       int r=0,i=0;
       switch(operation){
           case "Addition":
              r=r1+r2;
              i=i1+i2;
              res="The addition of two complex numbers"+r1+((i1>=0)?("+"+i1+"i"):i1+"i")+" and "
                      +r2+((i2>=0)?("+"+i2+"i"):i2+"i")+" is "+r+((i>0)?("+"+i+"i"):i+"i"); 
               break;
           case "Subtraction":
               r=r1-r2;
               i=i1-i2;
               res="The Subtraction of two complex numbers"+r1+((i1>=0)?("+"+i1+"i"):i1+"i")+" and "
                      +r2+((i2>=0)?("+"+i2+"i"):i2+"i")+" is "+r+((i>=0)?("+"+i+"i"):(i+"i")); 
               break;
           case "Multiplication":
               r=r1*r2+(i1*i2*-1);
               i=i1*r2+i2*r1;
               res="The Multiplication of two complex numbers"+r1+((i1>=0)?("+"+i1+"i"):i1+"i")+" and "
                      +r2+((i2>=0)?("+"+i2+"i"):i2+"i")+" is "+r+((i>=0)?("+"+i+"i"):(i+"i"));
               break;
           case "Conjucate":
               
               res="The Conjucate of "+r1+((i1>=0)?("+"+i1+"i"):+i1+"i")+" is ";
                i1*=-1;
                      
               res+=r1+((i1>=0)?("+"+i1+"i"):i1+"i")+"\n";
               res+="The Conjucate of "+r2+((i2>=0)?("+"+i2+"i"):+i2+"i")+" is ";
                i2*=-1;
                      
               res+=r1+((i2>=0)?("+"+i2+"i"):i2+"i")+"\n";
               
               
               break;
               
              
               
               
       
       
       }
       return SUCCESS;
   }
    
}
