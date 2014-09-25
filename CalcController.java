
import java.awt.event.*;

public class CalcController{
  
  // There is a reference to both the view and the model
  private final CalcView view;
  private final CalcModel model;
  

    
    /**
     * Create and set the listeners to the view
     */
    public CalcController(CalcModel model, CalcView view){
        this.model = model;
        this.view = view;
        

      
    // Addition
    this.view.setAddListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        view.setResult(model.addValues(
          view.getOperand1(),
          view.getOperand2()));
      }
    });
  
    // Subtraction
   this.view.setSubtractListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        view.setResult(model.subtractValues(
          view.getOperand1(),
          view.getOperand2()));
      }
    });
   
   // Divide
    this.view.setDivideListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        view.setResult(model.divideValues(
          view.getOperand1(),
          view.getOperand2()));
      }
    });


      }
    
  }

