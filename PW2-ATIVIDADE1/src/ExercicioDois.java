
public class ExercicioDois {
	
	public static void main(String[] args) {
		
		boolean dias = possoIrBanco("segunda-feira",10);
		
		
		System.out.println("O banco est� aberto:" + " " + dias);
		
		
	}
	
	public static boolean possoIrBanco(String dias, int horario) {
		
		
		if(ExercicioUm.ehDiaSemana(dias) && horario >= 10 && horario <= 16) {
			
			return true;
		}
		
		else {
			
			return false;
		}
		
		
	}

}
