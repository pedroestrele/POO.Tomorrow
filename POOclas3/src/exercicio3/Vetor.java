package exercicio3;

public class Vetor {
	private String[] string;
	private int tamanho;
	
	
	public Vetor(int tamanho) {
		string = new String[tamanho];
		this.tamanho = tamanho;
	}
	
	public void insert(String proximoTermo) {
		int i =0;
		do {
			if(i<tamanho) {
				if(string[i]==null) {
					string[i]=proximoTermo;
				}
			}else {
				String[] novaString=new String[tamanho+1];
				for(i=0;i<tamanho;i++) {
					novaString[i]=string[i];
				}
				string = novaString;
				tamanho++;
				string[i]=proximoTermo;
			}
			i++;		
		}while(string[i-1]!=proximoTermo);
	}
	
	public String get(int position) {
		if(string[position]==null||position>=tamanho) {
			return null;
		}else {
			return string[position];
		}
	}
	
	public int size() {
		int inseridos=0;
		for(int i=0;i>tamanho;i++) {
			if(string[i]==null) {
				break;
			}else {
				inseridos++;
			}
			
		}
		return inseridos;
	}
}
