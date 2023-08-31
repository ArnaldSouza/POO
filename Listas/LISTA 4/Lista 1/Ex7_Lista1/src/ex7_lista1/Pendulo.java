package ex7_lista1;

public class Pendulo {

	int a = 0;
	int b = 0;
	int c = 0;	
	
	public void pendulo() {		
            this.c++;
			
		if(this.c == 30) {
			this.c = 0;
			this.b++;
		}
		
		if(this.b == 30) {
			this.c = 0;
			this.b = 0;
			this.a++;
			
			}
		
	}
}
