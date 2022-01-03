import java.util.ArrayList;

public class Expression {
	String stringa;
	ArrayList<Integer> pesi = new ArrayList<Integer>();

	public Expression(String stringa){
		this.stringa = new String(stringa);
	}

	//analizza la stringa per verificare la presenza di parentesi
	public double analizzaStringa(int parentesi) {
		int left_index;	//open bracket '('
		int right_index;	//close bracket ')'
		for(int j = 0; j < parentesi; j++){
			left_index = -1;
			right_index = -1;
			for(int i = 0; i < stringa.length(); i++){
				char temp = stringa.charAt(i);
				if(temp == '('){
					left_index = i;
				}
				else if(temp == ')'){
					right_index = i;
				}
				if(left_index != -1 && right_index != -1){	//se entrambi hanno una posizione interrompo il ciclo ed eseguio i calcoli all'interno di quelle parentesi
					break;
				}
			}
			Expression child = new Expression(stringa.substring(left_index + 1, right_index));
			stringa = stringa.replace(stringa.substring(left_index, right_index + 1), "" + child.calcolaPesi());	//rimpiazzo il contenuto della parentesi con il suo risultato
		}
		try{	
			double risultato = Double.parseDouble(stringa);	//se non sorgono errori il risultato è già pronto
			return risultato;
		}catch(Exception e){	//se sorge un errore significa che nell'espressione ci sono altre operazioni da svolgere
			return calcolaPesi();
		}


	}
	//assegna i pesi alle operazioni: '*' e '/' hanno peso 2; '+' e '-' hanno peso 1; i numeri hanno peso 0
	public double calcolaPesi(){
		String temp = new String();
		for(int i = 0; i < stringa.length(); i++){
			temp = Character.toString(stringa.charAt(i));
			if(temp.equals("*") || temp.equals("/")){
				pesi.add(2);
			}
			else if(temp.equals("^")){	//la potenza ha più priorità di * e /
				pesi.add(3);
			}
			else if(temp.equals("+") || temp.equals("-")){
				if(temp.equals("-")){	//check if is negative number or minus sign						ln/sin						log							cos/abs
					if(i != 0 && stringa.charAt(i-1) != '(' && stringa.charAt(i-1) != '^' && stringa.charAt(i-1) != 'n' && stringa.charAt(i-1) != 'g' && stringa.charAt(i-1) != 's'){
						pesi.add(1);
					}
					else{	//is negative number
						pesi.add(0);
					}
				}
				else{
					pesi.add(1);
				}
			}
			else{
				pesi.add(0);
			}
		}
		return calcolaEspressione();
	}
	//trova la root dell'albero, se la root non viene trovata passa al calcolo diretto dell'espressione
	public double calcolaEspressione(){
		int indiceRoot = -1;    //indice della stringa corrispondente al segno (+,-,*,/) che sarà root dell'albero che creerò
		//controllo prima + e - perche hanno priorità più bassa e possono stare in posizione più alta nell'albero = vengono fatte dopo * e /
		if(pesi.contains(1)){		//mi salvo l'ultimo indice del segno "+" o "-"
			indiceRoot = pesi.lastIndexOf(1);
		}
		else if(pesi.contains(2)){		//se non ci sono "+" o "-" cerco gli ultimi segni "*" o "/"
			indiceRoot = pesi.lastIndexOf(2);
		}
		else if(pesi.contains(3)){		//se non ci sono "+" o "/" cerco "^"
			indiceRoot = pesi.lastIndexOf(3);
		}
		else{
			//se non ci sono operazioni base (+,-,*,/) allora controllo le operazioni matematica avanzate e restituisco direttamente il risultato
			if(stringa.charAt(0) == '√'){		//radice quadrata
				stringa = stringa.substring(1, stringa.length());
				return Math.pow(Double.parseDouble(stringa), 0.5);
			}

			else if(stringa.charAt(stringa.length() - 1) == '!'){	//fattoriale
				stringa = stringa.substring(0, stringa.length() - 1);
				return factorial(Double.parseDouble(stringa));
			}

			else if(stringa.charAt(0) == 'a'){	//valore assoluto
				stringa = stringa.substring(3, stringa.length());
				return Math.abs(Double.parseDouble(stringa));
			}

			else if(stringa.charAt(0) == 'π'){	//PI
				return Math.PI;
			}

			else if(stringa.charAt(0) == 'e'){	//napier's constant
				return Math.exp(1);
			}

			else if(stringa.charAt(0) == 's'){	//sine
				stringa = stringa.substring(3, stringa.length());
				double value = Double.parseDouble(stringa);
				return Math.sin(value);
			}

			else if(stringa.charAt(0) == 'c'){	//cosine
				stringa = stringa.substring(3, stringa.length());
				double value = Double.parseDouble(stringa);
				return Math.cos(value);
			}

			else if(stringa.charAt(1) == 'n'){	//natural logarithm (base e)
				stringa = stringa.substring(2, stringa.length());
				double value  = Double.parseDouble(stringa);
				return Math.log(value);
			}

			else if(stringa.charAt(2) == 'g'){	//logarithm base 10
				stringa = stringa.substring(3, stringa.length());
				double value = Double.parseDouble(stringa);
				return Math.log(value)/Math.log(10);
			}
		}
		String root = "" + stringa.charAt(indiceRoot);
		BinaryTree albero = new BinaryTree(root);
		albero.creazioneAlbero(albero.root, stringa, 0, indiceRoot, stringa.length());

		albero.visitaPostOrder(albero.root);		//visita post-order che calcola il risultato dell'espressione
		return albero.stack.pop();
	}

	public double factorial(double number){
		if(number >= 1){
			return number * factorial(number-1);
		}
		else{
			return 1;
		}
	}
}
