package es.solrak.extra;

public class Ejercicio2 {
	private int[] array;
	
	public Ejercicio2() {
		this.array=new int[]{1,2,3,4,0};
	}
	
	public Ejercicio2(int n) {
		this.array=new int[]{1,2,3,4,n};
	}
	
	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int[] copiar() {
		return new int[]{this.array[0],this.array[1],this.array[2],this.array[3],this.array[4]};
	}
	
	public boolean crecer() {
		if(this.getArray()[4]<9){
			this.getArray()[4]++;
			return true;
		}else{
			this.getArray()[4]=0;
			return false;
		}
	}
	
	public boolean decrecer() {
		if(this.getArray()[4]>0){
			this.getArray()[4]--;
			return true;
		}else{
			this.getArray()[4]=9;
			return false;
		}
	}
	
	public String toString() {
		String s="";
		for(int i=0;i<5;i++){
			s=s+this.array[i];
		}
		return s;
	}
	
	public void destruir() {
		this.array=null;
	}
	
}
