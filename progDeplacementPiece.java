class plateau{
	private int tailleMin[]={0,0};
	private int tailleMax[]={350,350};
	private int tailleCase=4;
	
	public getTailleMin{
		return tailleMin;
	}
	public getTailleMax{
		return tailleMax;
	}
	public getTailleCase{
		return tailleCase;
	}
	public setTailleMin(int pTailleMin){
		
	}
	public setTailleMax(int pTailleMax){
		
	}
	public setTailleCase(int pTailleCase){
		
	}
}

class depalcementPieces{
	public static void main(String[] args){
		
	}
	public static int deplacementPieces(int posDepart[],int posArrive[]){
		int trajetX = posArrive[0]-posDepart[0];
		int trajetY = posArrive[1]-posDepart[1];
		
		if(posDepart[0]<0 || posDepart[1]<0){
			//la piece n'est pas sur le plateau
		}
		else if(posDepart[0]>plateau.tailleMax[0] || posDepart[1]>plateau.tailleMax[1]){
			//la piece n'est pas sur le plateau 
		}
		else if(posArriveX<0 || posArriveY<0){
			//la destination n'est pas sur le plateau
		}
		else if(posArriveX>plateau.tailleXmax || posArriveY>plateau.tailleYmax){
			//la destination n'est pas sur le plateau
		}
		else{
			int deplacementX = plateau.tailleCase/2;
			int deplacementY = deplacementX;
			
			//envoi du deplacement a faire a l'arduino
			
			deplacementX = trajetX;
			deplacementY = trajetY;
			
			//envoi du deplacement a faire a l'arduino
			
			deplacementX = -plateau.tailleCase/2;
			deplacementY = deplacementX;
			
			//envoi du deplacement a faire a l'arduino
			
		}
	}
	public static int bluetooth(int trajetX,int trajetY){
		
	}
}