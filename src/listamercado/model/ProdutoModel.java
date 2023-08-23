package listamercado.model;


public class ProdutoModel {
    private String Produto;
    private int Quantidade;
    
    public ProdutoModel(String Produto, int Quantidade){
          
         this.Produto=Produto;
         this.Quantidade=Quantidade;
    }
    public ProdutoModel(){}
    
        public void ProdutoModel(){}
       
            public String getProduto(){
                return Produto;
            }
            public void setProduto(String produto){
                this.Produto=produto;    
            }
            
            public int getQuantidade(){
                return Quantidade;  
            }
            public void setQuantidade(int quantidade){
                this.Quantidade=quantidade;
            }
            
            
        
       
    
}
