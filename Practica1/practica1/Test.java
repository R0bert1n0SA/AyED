package practica1;

public class Test {

	  
	public static void main (String[] arg) {
		Estudiante[] Estudiantes=new Estudiante[2];
		Profesor  [] Profesores = new Profesor[3];
		Estudiantes[0]=new Estudiante("Mane","Ghost","227y","Ghostemane@gmail.com",5);
		Estudiantes[1]=new Estudiante("Lord","Scar","82y98","Scarlord@gmail.com",5);
		Profesores[0]=new Profesor ("Ricardo","Iorio","ricardoIorio@ricardoiorio.com","Historia Del Heavy Metal","Unlp");
		Profesores[1]=new Profesor ("Kurt","Cobain","kurtcobain@gmail.com","Canto","unlp");
		Profesores[2]=new Profesor ("Lil","peep","lilpeepsgios","depresion","unlp");

        System.out.println("\n**Estudiantes:**");
        for (Estudiante estudiante : Estudiantes) {
            System.out.println("\n" + estudiante.Tus_datos());
        }

        System.out.println("\n\n**Profesores:**");
        for (Profesor profesor : Profesores) {
            System.out.println("\n" + profesor.Tus_datos());
        }
	}

}
