public class SQLFactory {
//     public static void main(String[] args) {
//          Cliente cliente = new Cliente();
          
//          cliente.id = 7;
//          cliente.nome = "samoel";
//          cliente.esposa = "thainara";
//          cliente.valor_patrimonio = 11528;
         
//          Boolean retorno = Database.inserirRegistro(cliente);
//          System.out.println(retorno);}


// ///////////////////////////////////////////////////////////////////////////////////////////////////////
//         public static void main(String[] args){
//         Cliente cliente= new Cliente();
          
//          cliente.id = 4;
//          cliente.nome = "Will";
//          cliente.esposa = "Elizeu";
//          cliente.valor_patrimonio = 300;

//          Boolean retorno = Database.atualizarRegistro(cliente);
//         System.out.println(retorno);}
//////////////////////////////////////////////////////////////////////////////////////////


// public static void main(String[] args){
//         Cliente cliente = new Cliente();
          
//          cliente.id = 2;
         
//          Boolean retorno = Database.deletarRegistro(cliente);
//         System.out.println(retorno);}

////////////////////////////////////////////////////////////////////////////
public static void main(String[] args){
        Cliente cliente = new Cliente();

         Boolean retorno = Database.abrirID(cliente,4);
        System.out.println("Nome do homem de sorte : " + cliente.nome + '\n' +"Nome da Maravilhosa esposa : "+ cliente.esposa + '\n'+ "Valor guardado para o casamento : " + cliente.valor_patrimonio);}

        

         

    }

