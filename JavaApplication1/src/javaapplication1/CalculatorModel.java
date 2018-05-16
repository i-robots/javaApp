
package javaapplication1;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorModel {
    
    

    private int result;
    public void add(int x,int y){
        result=x+y;
    }
    public void multiply(int x, int y){
        result=x*y;
    }
    public void product(int x,int y){
        result=x*y;
    }
    public int getResult(){
        return result;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
    class CalculatorView extends JFrame{
        private JTextField fn=new JTextField(5);
        private JLabel sign=new JLabel("+");
        private JLabel sign2=new JLabel("*");
        private JLabel equals= new JLabel("=");
        private JLabel clear= new JLabel("CE");
        private JTextField sn=new JTextField(5);
        private JButton calc=new JButton("Calculation");
        private JTextField sol=new JTextField(5);
   
    public void calculatorView(){
        JPanel jp=new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,300);
        jp.add(fn);
        jp.add(sign);
        jp.add(sn);
        jp.add(calc);
        jp.add(sol);
        
        jp.add(sign2);
        this.add(jp);
        
        jp.add(equals);
        this.add(jp);
        
        jp.add(clear);
        this.add(jp);
        
        
}
     
    public int getFirstnum(){
        return Integer.parseInt(fn.getText());
    }
    public int getSecondnum(){
        return Integer.parseInt(sn.getText());
    }
      public void setSolu(int solution)     
      {            
          sol.setText(Integer.toString(solution));         
      }  
      void addClaculationListner(ActionListener forButton)
      {       
          calc.addActionListener(forButton);         
      }  
      void displayerror(String error)  {  JOptionPane.showMessageDialog(this, error); }} 

 class ClaculateConroler  { 
     private CalculatorView theView; 
     private CalculatorModel theModel; 
     
     public ClaculateConroler (CalculatorView theView, CalculatorModel theModel)            
     { 
 
       this.theView = theView; 
 
        this.theModel = theModel; 
 
         theView.addClaculationListner(new CalculateListener());    
     } 
 
     class CalculateListener implements ActionListener      
     { 
 
         public void actionPerformed(ActionEvent e)       
         { 
 
             int firstNumber, secondNumber = 0; 
 
             try{ 
 
                 firstNumber = theView.getFirstnum(); 
 
                 secondNumber = theView.getSecondnum(); 
 
                 theModel.add(firstNumber, secondNumber);    
                 theView.setSolu(theModel.getResult()); 
 
                            }                catch(NumberFormatException ex)                     { 
 
                   System.out.println(ex);  theView.displayerror("You Need to Enter 2 Integers");  } }}} 
 