
package bancowww;

import javax.swing.JOptionPane;


public class BancoWWWMain {

 
    public static void main(String[] args) {
        
        String MenuCliente;
        
        
         Conta ContaCliente = new Conta();
         ContaCliente.NomeCliente = JOptionPane.showInputDialog("Informe seu nome");
         ContaCliente.CodigoCliente = JOptionPane.showInputDialog("Informe seu codigo");
         
        
         MenuCliente = JOptionPane.showInputDialog("(1) SALDO (2) DEPOSITO (3) SAQUE");
         double EscolhaUsuario = Double.parseDouble(MenuCliente);
         
         if (EscolhaUsuario == 1 ){
             System.out.println(ContaCliente.NomeCliente  + " " + "Seu saldo é "+ ContaCliente.Saldo()  );
             }

         if (EscolhaUsuario == 2 ){
             String InformarDeposito = JOptionPane.showInputDialog("Informe o valor do deposito");
             double Deposito = Double.parseDouble(InformarDeposito); 
             ContaCliente.deposito(Deposito);
             System.out.println(ContaCliente.NomeCliente+ " Seu novo saldo é "+ ContaCliente.Saldo());
         }
    
         if (EscolhaUsuario == 3 ){
             String InformarSaque = JOptionPane.showInputDialog("Informe o valor do saque");
             double saque = Double.parseDouble(InformarSaque); 
             boolean vereficarSaldo = ContaCliente.Saque(saque);
             if (vereficarSaldo == false){
             System.out.println(ContaCliente.NomeCliente+ " seu saque é maior que seu saldo " + ContaCliente.Saldo());
             }else{
                System.out.println(ContaCliente.NomeCliente+ " Saque realizado com exito " );
             }
         }
    }
}

    