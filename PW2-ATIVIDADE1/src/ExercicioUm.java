
public class ExercicioUm {

	public static void main(String[] args) {

		boolean finalDeSemana = ehDiaSemana("domingo");
		System.out.println(finalDeSemana);
	}

	public static boolean ehDiaSemana(String finalDeSemana) {

		if (finalDeSemana == "s�bado" || finalDeSemana == "domingo") {

			return false;

		} else {

			return true;
		}

	}

}
