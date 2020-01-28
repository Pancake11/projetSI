class plateau{
	private int tailleMin[]={0,0};//forme {x,y};
	private int tailleMax[]={350,350};
	private int tailleCase=4; // carré de Xcm de coté
	private int tailleCimetiere[]={1,1}; //forme {nbr lignes,nbr colonnes}
	private int plateau[8][8]={};
	//initialisation matrice plateau
	for(int i=0;i=<8;i++){
		for(int j=0;j=<8;j++){
			plateau[i][j]=0;
		}
	}
	//acesseurs :
	public int getTailleMin(int i){
		return tailleMin[i];
	}
	public int getTailleMax(int j){
		return tailleMax[j];
	}
	public int getTailleCase(){
		return tailleCase;
	}
	public int getTailleCimetiere(){
		return tailleCimetiere;
	}
	public setTailleMin(){
		
	}
	public setTailleMax(){
		
	}
	public setTailleCase(){
		
	}
	public setTailleCimetiere(){
		
	}
	public setPlateau(){
		
	}
}

class deplacementPieces{
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
				if(plateau[posArriveX][posArriveY]!=0){
					pieceMange(posArriveX,posArriveY,plateau[posArriveX][posArriveY]);
				}
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
		}
	public static int bluetooth(int trajetX,int trajetY){
		
	}
}

class PieceMange{
	int cimetiere[][] = new int[getTailleCimetiere[1]][getTailleCimetiere[2]];
	for(int i=0; i<cimetiere.length; i++){
		for(int j=0; j<cimetiere[i].length; j++){
			cimetiere[i][j]=0;
		}
	}
	public static int pieceMange(int posPieceX,int posPieceY,int typePiece){
		scanCimetiere()=posPlaceVide[]={};
		cimetiere[posPlaceVide[1]][posPlaceVide[2]]=typePiece;
		deplacementPieces[posPieceX,posPieceY,posPlaceVide[1],posPlaceVide[2]];
	}
	
	private static int scanCimetiere(){ //recherche d'une place vide dans le cimetiere
		for(int i=0;i<cimetiere.length;i++){
			for(int j=0;j<cimetiere[i].length;j++){
				if(cimetiere[i[]j]==0){
					return i,j;
				}
			}
		}
	}
}