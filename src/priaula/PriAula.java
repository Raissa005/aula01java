package priaula;

public class PriAula {

    public static void main(String[] args) {
        String nome = "Raíssa";
                
        String[] frutas = new String[5]; //vetor com espaço p/ 5 strings
        frutas[0] = "LARANJA"; 
        frutas[1] = "Maça";
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] numerosDois = new int[8];
        numerosDois[0]= 0;
        numerosDois[1] = 1;
                  
        String[] frutasDois = {"LARANJA", "MACA"};//VETOR
        
        for (int i = 0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }
        
        for(String fruta: frutas){
        System.err.println(frutas);
    }
        
       int idade = 17;     
        double altura = 1.55;       
        boolean eProfessora = false;        
        short valor = 1001;      
        char genero = 'F';        
        float alturaDois = (float) 1.55;  
        int dtNasc = qualIdade(2005);
        
        System.out.println( nome + " tem "+ dtNasc +" anos de idade ");
        
        if(qualIdade(dtNasc)>= 18){
            System.out.println("Você é maior de idade pode ser preso!");
        }else{
            System.out.println("Você ainda não pode ser preso, mas pode apanhar!");
        }
    }
    static int qualIdade(int anoNasc){
        int idade = 2023 - anoNasc;
        return idade;
    }
}
