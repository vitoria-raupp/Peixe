import java.util.ArrayList;

public class Aquario {
    private static ArrayList<Peixe> listaDePeixes = new ArrayList<>();

    public Aquario() {
    }
    
    static public void adicionaPeixe(Peixe peixe){
        listaDePeixes.add(peixe);
    }
    
    static public int buscaPeixe(Peixe peixe){
        for(int i = 0; i < listaDePeixes.size(); i ++ ){
            if(listaDePeixes.get(i) == peixe)
            return i;
        
        }
        return 0;
    }
    
    static public void imprimePeixe(){
        System.out.println(listaDePeixes);
    }
    
    static public void removePeixe(Peixe peixe){
        listaDePeixes.remove(peixe);
    }
}
