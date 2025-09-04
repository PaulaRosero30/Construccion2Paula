package test;

public class RegistroSignosVitales {
	private static String presionArterial;
	private static String temperatura;
	private static String  pulso;
	private static String  nivelOxigenoSangre;
	
	public void showData() {
	
	}

	public static String getPresionArterial() {
		return presionArterial;
	}

	public static void setPresionArterial(String presionArterial) {
		RegistroSignosVitales.presionArterial = presionArterial;
	}

	public static String getTemperatura() {
		return temperatura;
	}

	public static void setTemperatura(String temperatura) {
		RegistroSignosVitales.temperatura = temperatura;
	}

	public static String getPulso() {
		return pulso;
	}

	public static void setPulso(String pulso) {
		RegistroSignosVitales.pulso = pulso;
	}

	public static String getNivelOxigenoSangre() {
		return nivelOxigenoSangre;
	}

	public static void setNivelOxigenoSangre(String nivelOxigenoSangre) {
		RegistroSignosVitales.nivelOxigenoSangre = nivelOxigenoSangre;
	}
}
