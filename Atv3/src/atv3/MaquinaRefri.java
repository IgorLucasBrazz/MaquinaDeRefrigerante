package atv3;
import atv3.Refrigerante;

public class MaquinaRefri {
    private float saldo;
    private int qtdcocacola;
    private int qtdmatecouro;
    private int qtdguarana;
    private int qtdpepsi;
    private int qtdsprite;
    private float creditoAtual;
    private Refrigerante matecouroR;
    private Refrigerante cocacolaR;
    private Refrigerante guaranaR;
    private Refrigerante pepsiR;
    private Refrigerante spriteR;
    
    public void inicializaMaq(Refrigerante refri1,Refrigerante refri2,Refrigerante refri3,Refrigerante refri4,Refrigerante refri5, int quant1, int quant2, int quant3, int quant4, int quant5){
        this.cocacolaR = refri1;
        this.qtdcocacola = quant1;
        this.matecouroR = refri2;
        this.qtdmatecouro = quant2;
        this.guaranaR = refri3;
        this.qtdguarana = quant3;
        this.pepsiR = refri4;
        this.qtdpepsi = quant4;
        this.spriteR = refri5;
        this.qtdsprite = quant5;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getQtdcocacola() {
        return qtdcocacola;
    }

    public void setQtdcocacola(int qtdcocacola) {
        this.qtdcocacola = qtdcocacola;
    }

    public int getQtdmatecouro() {
        return qtdmatecouro;
    }

    public void setQtdmatecouro(int qtdmatecouro) {
        this.qtdmatecouro = qtdmatecouro;
    }

    public int getQtdguarana() {
        return qtdguarana;
    }

    public void setQtdguarana(int qtdguarana) {
        this.qtdguarana = qtdguarana;
    }

    public int getQtdpepsi() {
        return qtdpepsi;
    }

    public void setQtdpepsi(int qtdpepsi) {
        this.qtdpepsi = qtdpepsi;
    }

    public int getQtdsprite() {
        return qtdsprite;
    }

    public void setQtdsprite(int qtdsprite) {
        this.qtdsprite = qtdsprite;
    }

    public float getCreditoAtual() {
        return creditoAtual;
    }

    public void setCreditoAtual(float creditoAtual) {
        this.creditoAtual = creditoAtual;
    }
    
    public void inserircredito(float valor){
        this.creditoAtual = valor;
    }
    
    public void quantidadeRefri(String nome, int quantidade){
        if(nome.equals(this.cocacolaR.getNome())){
            if(this.qtdcocacola + quantidade > 20){
                this.qtdcocacola = 20;
            }
            else{
                this.qtdcocacola = this.qtdcocacola + quantidade;
            }
            System.out.println("Quantidade de Coca Cola: " +this.qtdcocacola+ "unidades");
        }
        else if(nome.equals(this.matecouroR.getNome())){
            if(this.qtdmatecouro + quantidade > 20){
                this.qtdmatecouro = 20;
            }
            else{
                this.qtdmatecouro = this.qtdmatecouro + quantidade;
            }
            System.out.println("Quantidade de Mate couro: " +this.qtdmatecouro+ "unidades");
        }
        else if(nome.equals(this.guaranaR.getNome())){
            if(this.qtdguarana + quantidade > 20){
                this.qtdguarana = 20;
            }
            else{
                this.qtdguarana = this.qtdguarana + quantidade;
            }
            System.out.println("Quantidade de Guarana: " +this.qtdguarana+ "unidades");
        }
        else if(nome.equals(this.pepsiR.getNome())){
            if(this.qtdpepsi + quantidade > 20){
                this.qtdpepsi = 20;
            }
            else{
                this.qtdpepsi = this.qtdpepsi + quantidade;
            }
            System.out.println("Quantidade de Pepsi: " +this.qtdpepsi+ "unidades");
        }
        else if(nome.equals(this.spriteR.getNome())){
            if(this.qtdsprite + quantidade > 20){
                this.qtdsprite = 20;
            }
            else{
                this.qtdsprite = this.qtdsprite + quantidade;
            }
            System.out.println("Quantidade de Sprite: " +this.qtdsprite+ "unidades");
        }
    }
    
    public void PedidoRefri(int opcao){
        if(opcao == 1){
            System.out.println("Preço: " +this.cocacolaR.getPreco());
            System.out.println("Valor Inserido: " +this.creditoAtual);
            if(this.creditoAtual > this.cocacolaR.getPreco()){
                System.out.println("Troco: R$ " +(this.creditoAtual - this.cocacolaR.getPreco()));                
            }
            else if(this.creditoAtual == this.cocacolaR.getPreco()){
                System.out.println("OBRIGADO PELA COMPRA!");
            }
            else{
                cancelaVenda();
            }
        }
        else if(opcao == 2){
            System.out.println("Preço: " +this.matecouroR.getPreco());
            System.out.println("Valor Inserido: " +this.creditoAtual);
            if(this.creditoAtual > this.matecouroR.getPreco()){
                System.out.println("Troco: R$ " +(this.creditoAtual - this.matecouroR.getPreco()));                
            }
            else if(this.creditoAtual == this.matecouroR.getPreco()){
                System.out.println("OBRIGADO PELA COMPRA!");
            }
            else{
                cancelaVenda();
            }
        }
        else if(opcao == 3){
            System.out.println("Preço: " +this.guaranaR.getPreco());
            System.out.println("Valor Inserido: " +this.creditoAtual);
            if(this.creditoAtual > this.guaranaR.getPreco()){
                System.out.println("Troco: R$ " +(this.creditoAtual - this.guaranaR.getPreco()));                
            }
            else if(this.creditoAtual == this.guaranaR.getPreco()){
                System.out.println("OBRIGADO PELA COMPRA!");
            }
            else{
                cancelaVenda();
            }
        }
        else if(opcao == 4){
            System.out.println("Preço: " +this.pepsiR.getPreco());
            System.out.println("Valor Inserido: " +this.creditoAtual);
            if(this.creditoAtual > this.pepsiR.getPreco()){
                System.out.println("Troco: R$ " +(this.creditoAtual - this.pepsiR.getPreco()));                
            }
            else if(this.creditoAtual == this.pepsiR.getPreco()){
                System.out.println("OBRIGADO PELA COMPRA!");
            }
            else{
                cancelaVenda();
            }
        }
        else if(opcao == 5){
            System.out.println("Preço: " +this.spriteR.getPreco());
            System.out.println("Valor Inserido: " +this.creditoAtual);
            if(this.creditoAtual > this.spriteR.getPreco()){
                System.out.println("Troco: R$ " +(this.creditoAtual - this.spriteR.getPreco()));                
            }
            else if(this.creditoAtual == this.spriteR.getPreco()){
                System.out.println("OBRIGADO PELA COMPRA!");
            }
            else{
                cancelaVenda();
            }
        }
    }
    
    public void cancelaVenda(){
        System.out.println("Que pena!!! Insira mais moedas, ou volte outro dia!");
        System.out.println("Reembolsando dinheiro colocado! Valor: R$ " +this.creditoAtual);
        System.out.println("Refrigente não disponível ou Valor insuficiente");
        
    }
    
    public void Mostraredito(){
        System.out.println("Credito atual: R$ " +this.creditoAtual);
    }
    
    public MaquinaRefri(float saldo, float credAtual){
        this.saldo = saldo;
        this.creditoAtual = creditoAtual;
    }
    
}
    
