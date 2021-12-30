import java.util.ArrayList;
import java.util.Stack;
//TODO gestione parentesi: 1. quando premi "=" chiami solo un metodo che è calcolaPesi che poi chiama da solo calcolaEspressione
//2. su BasicCalculatorGrafic gestisci con un counter il numero di parentesi che devono essere chiuse, solo se il numero viene soddisfatto allora esegui il calcolo
//3. prima di fare calcola pesi analizza la stringa e se appena incontri una parentesi ottieni la stringa contenuta in esse e crei un'altri istanza di 
// CalculatorString e nel costruttore gli passi quella stringa contenuta nelle parentesi che poi verrà sostituita con il suo risultato, e potrai andare avanti senza la presenza
// della parentesi che sarà diventata un normale numero
public class CalculatorString {
    String stringa;
    ArrayList<Integer> pesi = new ArrayList<Integer>();

    public CalculatorString(String stringa){
        this.stringa = new String(stringa);
    }

    //analizza la stringa e assegna i pesi alle operazioni: * e / hanno peso 2; + e - hanno peso 1; i numeri hanno peso 0
    public void calcolaPesi(){
        String temp = new String();
        for(int i = 0; i < stringa.length(); i++){
            temp = Character.toString(stringa.charAt(i));
            if(temp.equals("*") || temp.equals("/")){
                pesi.add(2);
            }
            else if(temp.equals("+") || temp.equals("-")){
                pesi.add(1);
            }
            else{
                pesi.add(0);
            }
        }
        
    }

    public double calcolaEspressione(){
        int indiceRoot = -1;    //indice del segno (+,-,*,/) che sarà root dell'albero che creerò
        //controllo prima + e - perche hanno priorità più bassa e possono stare in posizione più alta nell'albero = vengono fatte dopo * e /
        if(pesi.contains(1)){		//mi salvo l'ultimo indice del segno "+" o "-"
            indiceRoot = pesi.lastIndexOf(1);
        }
        else if(pesi.contains(2)){		//se non ci sono "+" o "-" cerco gli ultimi segni "*" o "/"
            indiceRoot = pesi.lastIndexOf(2);
        }
        else{
            //se non ci sono operazioni base (+,-,*,/) allora controllo le operazioni matematica avanzate e restituisco direttamente il risultato
            if(stringa.charAt(0) == '√'){		//caso radice quadrata
                stringa = stringa.substring(1, stringa.length());
                return Math.pow(Double.parseDouble(stringa), 0.5);
            }
            //TODO aggiungere altre operazioni
        }
        String root = "" + stringa.charAt(indiceRoot);
        AlberoBinario albero = new AlberoBinario(root);
        albero.creazioneAlbero(albero.root, stringa, 0, indiceRoot, stringa.length());

        //albero.visitaAlbero(3);		//visita in order dell'albero
        albero.visitaAlbero(2);		//visita post order che calcola il risultato dell'espressione
        return albero.stack.pop();
    }

    class Nodo{
            private String dato;
            private Nodo left;
            private Nodo right;

            public Nodo(String dato){
                    this.dato = dato;	
                    this.left = null;
                    this.left = null;
            }

            public String getDato(){
                    return dato;
            }

            public void setDato(String dato){
                    this.dato = dato;
            }

            public void setLeft(Nodo left){
                    this.left = left;
            }

            public void setRight(Nodo right){
                    this.right = right;
            }

            public Nodo getLeft(){
                    return left;
            }
            public Nodo getRight(){
                    return right;
            }
    }

    class AlberoBinario{
        private Nodo root;
        Stack<Double> stack = new Stack<Double>();

        public AlberoBinario(String dato){
            this.root = new Nodo(dato);
        }

        //crea l'albero dividendo continuamente la stringa in 2 parti
        public void creazioneAlbero(Nodo nodo, String stringaParziale, int leftLimit, int center, int rightLimit){
            String leftString = stringaParziale.substring(leftLimit, center);
            String rightString = stringaParziale.substring(center + 1, rightLimit);

            if(nSegni(leftString) == 0){		//se non ci sono segni significa che è presente un solo numero che sarà una foglia
                nodo.setLeft(new Nodo(leftString));
            }

            else if(nSegni(leftString) > 0){
                int indiceSegno = splitPoint(leftString);   //trova l'indice del primo segno partendo da destra
                nodo.setLeft(new Nodo("" + leftString.charAt(indiceSegno)));		//dopo aver trovato il punto in cui dividere la stringa metto quel punto come nodo
                creazioneAlbero(nodo.getLeft(), leftString, 0, indiceSegno, leftString.length());
            }

            if(nSegni(rightString) == 0){		//se non ci sono segni significa che è presente un solo numero che sarà una foglia
                nodo.setRight(new Nodo(rightString));
            }

            else if(nSegni(rightString) > 0){
                int indiceSegno = splitPoint(rightString);     //trova l'indice del primo segno partendo da destra
                nodo.setRight(new Nodo("" + rightString.charAt(indiceSegno)));		//dopo aver trovato il punto in cui dividere la stringa metto quel punto come nodo
                creazioneAlbero(nodo.getRight(), rightString, 0, indiceSegno, rightString.length());
            }
        }

        //trova il punto in cui dividere la stringa, cioè il primo segno che trova partendo da destra 
        public int splitPoint(String tempStringa){	
            String temp = new String();
            int[] pesiTemp = new int[tempStringa.length()];
            for(int i = 0; i < tempStringa.length(); i++){
                temp = Character.toString(tempStringa.charAt(i));	//controllo il singolo carattere, assegnandogli il peso
                if(temp.equals("*") || temp.equals("/")){
                    pesiTemp[i] = 2;
                }
                else if(temp.equals("+") || temp.equals("-")){
                    pesiTemp[i] = 1;
                }
                else{
                    pesiTemp[i] = 0;
                }
            }
            for(int i = tempStringa.length()-1; i >= 0; i--){	//ritorno la posizione della prima somma/sottrazione partendo da destra
                if(pesiTemp[i] == 1){
                    return i;
                }
            }
            for(int i = tempStringa.length()-1; i >= 0; i--){	//se non ci sono somme o sottraz. passo alla posizione della prima moltiplicazione o divisione partendo da destra
                if(pesiTemp[i] == 2){
                    return i;
                }
            }
            
            return -1;
        }

        //data una stringa restituisce quanti segni (+,-,*,/) sono presenti
        public int nSegni(String stringa){
            int counter = 0;
            for(int i = 0; i < stringa.length(); i++){
                if(stringa.charAt(i) == '+' || stringa.charAt(i) == '-' || stringa.charAt(i) == '*' || stringa.charAt(i) == '/'){
                    counter++;
                }
            }
            return counter;
        }

        public void visitaAlbero(int selezione){
            System.out.println();
            if(selezione == 1){
                visitaPreOrder(root);
            }
            else if(selezione == 2){
                visitaPostOrder(root);
            }
            else if(selezione == 3){
                visitaInOrder(root);
            }
        }

        //per debug
        private void visitaPreOrder(Nodo nodo){	//stampa tutti i nodi in un determinato livello da sinistra a destra
            if(nodo != null){
                System.out.println(nodo.getDato());
                if(nodo.getLeft() != null){
                    visitaPreOrder(nodo.getLeft());
                }
                if(nodo.getRight() != null){
                    visitaPreOrder(nodo.getRight());
                }
            }
        }

        private void visitaPostOrder(Nodo nodo){
            double var;
            if(nodo != null){
                if(nodo.getLeft() != null){
                    visitaPostOrder(nodo.getLeft());
                }
                if(nodo.getRight() != null){
                    visitaPostOrder(nodo.getRight());
                }

                if(nodo.getDato().equals("+")){
                    double var2 = stack.pop();
                    double var1 = stack.pop();
                    double riusultato = var1 + var2;
                    stack.add(riusultato);
                }

                else if(nodo.getDato().equals("-")){
                    double var2 = stack.pop();
                    double var1 = stack.pop();
                    double riusultato = var1 - var2;
                    stack.add(riusultato);
                }

                else if(nodo.getDato().equals("*")){
                    double var2 = stack.pop();
                    double var1 = stack.pop();
                    double riusultato = var1 * var2;
                    stack.add(riusultato);
                }

                else if(nodo.getDato().equals("/")){
                    double var2 = stack.pop();
                    double var1 = stack.pop();
                    double riusultato = var1 / var2;
                    stack.add(riusultato);
                }

                else{
                    String temp = nodo.getDato();
                    if(temp.charAt(0) == '√'){
                        temp = temp.substring(1, temp.length());
                        var = Math.pow(Double.parseDouble(temp), 0.5);
                    }
                    //TODO aggiungere le altre operazioni 

                    else{
                        var = Double.parseDouble(nodo.getDato());
                    }

                    stack.add(var);
                }
            }
        }

        // per debug
        private void visitaInOrder(Nodo nodo){
            if(nodo != null){
                if(nodo.getLeft() != null){
                    visitaInOrder(nodo.getLeft());
                }
                System.out.print(nodo.getDato() + " ");
                if(nodo.getRight() != null){
                    visitaInOrder(nodo.getRight());
                }
            }
        }
    }
}
