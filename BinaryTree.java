import java.util.Stack;
public class BinaryTree{
	public Node root;
	Stack<Double> stack = new Stack<Double>();

	public BinaryTree(String dato){
		this.root = new Node(dato);
	}

	//crea l'albero dividendo continuamente la stringa in 2 parti
	public void creazioneAlbero(Node nodo, String stringaParziale, int leftLimit, int center, int rightLimit){
		String leftString = stringaParziale.substring(leftLimit, center);
		String rightString = stringaParziale.substring(center + 1, rightLimit);

		if(nSegni(leftString) == 0){		//se non ci sono segni significa che è presente un solo numero che sarà una foglia
			nodo.setLeft(new Node(leftString));
		}

		else if(nSegni(leftString) > 0){
			int indiceSegno = splitPoint(leftString);   //trova l'indice del primo segno partendo da destra
			nodo.setLeft(new Node("" + leftString.charAt(indiceSegno)));		//dopo aver trovato il punto in cui dividere la stringa metto quel punto come nodo
			creazioneAlbero(nodo.getLeft(), leftString, 0, indiceSegno, leftString.length());
		}

		if(nSegni(rightString) == 0){		//se non ci sono segni significa che è presente un solo numero che sarà una foglia
			nodo.setRight(new Node(rightString));
		}

		else if(nSegni(rightString) > 0){
			int indiceSegno = splitPoint(rightString);     //trova l'indice del primo segno partendo da destra
			nodo.setRight(new Node("" + rightString.charAt(indiceSegno)));		//dopo aver trovato il punto in cui dividere la stringa metto quel punto come nodo
			creazioneAlbero(nodo.getRight(), rightString, 0, indiceSegno, rightString.length());
		}
	}

	//trova il punto in cui dividere la stringa, cioè il primo segno che trova partendo da destra 
	public int splitPoint(String tempStringa){	
		String temp = new String();
		int[] pesiTemp = new int[tempStringa.length()];
		for(int i = 0; i < tempStringa.length(); i++){
			temp = Character.toString(tempStringa.charAt(i));	//controllo il singolo carattere, assegnandogli il peso
			if(temp.equals("^")){
				pesiTemp[i] = 3;
			}
			else if(temp.equals("*") || temp.equals("/")){
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
		for(int i = tempStringa.length()-1; i >= 0; i--){	//se non ci sono per o diviso passo alla posizione della prima potenza partendo da destra
			if(pesiTemp[i] == 3){
				return i;
			}
		}
		
		return -1;
	}

	//data una stringa restituisce quanti segni (+,-,*,/) sono presenti
	public int nSegni(String stringa){
		int counter = 0;
		for(int i = 0; i < stringa.length(); i++){
			if(stringa.charAt(i) == '+' || stringa.charAt(i) == '-' || stringa.charAt(i) == '*' || stringa.charAt(i) == '/' || stringa.charAt(i) == '^'){
				if(stringa.charAt(i) == '-'){
					if(i != 0 && stringa.charAt(i-1) != '(' && stringa.charAt(i-1) != '^' && stringa.charAt(i-1) != 'n' && stringa.charAt(i-1) != 'g' && stringa.charAt(i-1) != 's'){
						counter++;
					}
				}
				else{
					counter++;
				}
				
			}
		}
		return counter;
	}

	public void visitaPostOrder(Node nodo){
		double var = 0;
		if(nodo != null){
			if(nodo.getLeft() != null){
				visitaPostOrder(nodo.getLeft());
			}
			if(nodo.getRight() != null){
				visitaPostOrder(nodo.getRight());
			}

			if(nodo.getDato().equals("+") || nodo.getDato().equals("-") || nodo.getDato().equals("*") || nodo.getDato().equals("/") || nodo.getDato().equals("^")){
				double var2 = stack.pop();
				double var1 = stack.pop();
				double risultato;
				if(nodo.getDato().equals("+")){
					risultato = var1 + var2;
					stack.add(risultato);
				}

				else if(nodo.getDato().equals("-")){
					risultato = var1 - var2;
					stack.add(risultato);
				}

				else if(nodo.getDato().equals("*")){
					risultato = var1 * var2;
					stack.add(risultato);
				}

				else if(nodo.getDato().equals("/")){
					risultato = var1 / var2;
					stack.add(risultato);
				}

				else if(nodo.getDato().equals("^")){
					risultato = Math.pow(var1, var2);
					stack.add(risultato);
				}
			}
			
			else{
				//conversione simboli
				if(nodo.getDato().equals("π")){
					nodo.setDato(Double.toString(Math.PI));
				}
				else if(nodo.getDato().equals("e")){
					nodo.setDato(Double.toString(Math.exp(1)));
				}

				//calcolo funzioni
				String temp = nodo.getDato();

				if(temp.charAt(0) == '√'){	//square root
					temp = temp.substring(1, temp.length());
					var = Math.pow(Double.parseDouble(temp), 0.5);
				}
				else if(temp.charAt(0) == 's'){	//sine
					temp = temp.substring(3, temp.length());
					var = Double.parseDouble(temp);
					var = Math.sin(var);
				}
				else if(temp.charAt(0) == 'c'){	//cosine
					temp = temp.substring(3, temp.length());
					var = Double.parseDouble(temp);
					var = Math.cos(var);
				}
				else if(temp.charAt(0) == 'l'){
					if(temp.charAt(1) == 'n'){	//ln
						temp = temp.substring(2, temp.length());
						var = Double.parseDouble(temp);
						var = Math.log(var);
					}
					else if(temp.charAt(2) == 'g'){	//log
						temp = temp.substring(3, temp.length());
						var = Double.parseDouble(temp);
						var = Math.log(var)/Math.log(10);
					}
				}
				
				//TODO aggiungere le altre operazioni
				else{
					var = Double.parseDouble(temp);
				}

				stack.add(var);
			}
		}
	}
}