public class Comoodites {
    public static void main(String[] args){
        String produto[] = new String [5];
        produto[0]="Soja saca de 60kg";
        produto[1]="Boi Gordo arroba 25kg";
        produto[2]="Açucar Cristal saca 60kg";
        produto[3]="Café saca 60kg";
        produto[4]="Milho saca 60kg";

        double preco []= new double [5];
        preco[0]= 1236.00;
        preco[1]= 360.00;
        preco[2]= 380.00;
        preco[3]= 1236.00;
        preco[4]= 110.00;

        for(int i = 0 ;i < produto.length ; i++){
            System.out.println("O produto" + produto[i] + "tem " + preco[i] + "unidades em preco");
            
        }

    }
}