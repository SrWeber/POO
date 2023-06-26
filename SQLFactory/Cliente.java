public class Cliente extends SQLClass {

    @Key
    int id;

    String nome;
    String esposa;
    int valor_patrimonio;    

    Cliente(){
        this.setTableName("clientes");
    }   
    
    public void printObject(){
        System.out.println(
            this.id + ", " +
            this.nome + ", " +
            this.esposa + ", " +
            this.valor_patrimonio
        );
    }
}
