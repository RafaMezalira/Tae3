

package bancowww;

public class Conta {

    String NomeCliente;
    String CodigoCliente;
    private double SandoConta = 0.0;
    double LimiteConta = -100;
    
    double deposito(double  Saldo){
    return (SandoConta =+ Saldo);
    }
 


double Saldo(){
    return (SandoConta );
    }
 
boolean Saque ( double SaqueCliente){
    
    if (SaqueCliente > LimiteConta ){
    return false;
    }else
    return true;
        
 }


 








}











   

