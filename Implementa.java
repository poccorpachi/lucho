package com.senati.mediateca;

 import java.util.HashSet;
 import java.util.Set; //son colecciones : matrices, listas, arrays
 
public class Implementa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//añadir nuevos objetos
		//clase objeto = new clase
		
		Socio socio1 =new Socio();
		socio1.id=101;
		socio1.nombre="Jorje antonio ";
		socio1.apellido="Luque Chambi ";
		socio1.distrtio="Los olivos ";
		
		
		Socio socio2 =new Socio();
		socio2.id=102;
		socio2.nombre="Esther ";
		socio2.apellido="Aquino olivares ";
		socio2.distrtio="Breña ";
		
		//Esto de abajo es otra forma de hacerlo.
		Socio socio3 = new Socio(103, "alicia ", "Torres ", "Comas ");
		
		
		System.out.println(socio1.toString());
		System.out.println(socio2.toString());
		System.out.println(socio3.toString());
		
		
		//LIBRO
		Libro libro1 = new Libro(01,"hola mundo","Alvaro Vargas", 50f, 300, 123);
		System.out.println(libro1.toString());
		
		Libro libro2 = new Libro(02,"Mataleche","Alvaro Vargas", 25f, 400, 124);
		System.out.println(libro2.toString());
		
		
		//CINTAudio

		Cintaudio audio1 = new Cintaudio(01, "hola", "juanh alvarado", 12f, "comas","Los olivos");
		System.out.println(audio1.toString());
		
		Cintaudio audio2 = new Cintaudio(01, "Hello", "jorje vasques", 25f, "Los olivosss","los jardinbes");
		System.out.println(audio2.toString());
		
		
		
		//CINTAvideos
		
		Cintavideo video1 = new Cintavideo(01, "llegamos", "Carlos leon", 15f, "breña","Los olivos");
		System.out.println(video1.toString());
		
		Cintavideo video2 = new Cintavideo(01, "Hola 32", "Jose jose", 12f, "callao","Independencia");
		System.out.println(video2.toString());
		
		
		
		
		//lista de socios
		System.out.println("lista de contactos");
		
		Socio soc1 = new Socio(104,"Jorge"," Luque","comas");
		Socio soc2 = new Socio(105,"Maria"," Luna","comas");
		Socio soc3 = new Socio(106,"Gerardo"," Luque","comas");
		Socio soc4 = new Socio(107, "Alex"," Lopez","comas");
		Socio soc5 = new Socio(108, "Alex"," Lopez","comas");
		
		Set <Socio> sociosinscritos = new HashSet<Socio>();
		
		sociosinscritos.add(soc1);
		sociosinscritos.add(soc2);
		sociosinscritos.add(soc3);
		sociosinscritos.add(soc4);
		
		for (Socio socio : sociosinscritos) {
			System.out.println(socio.id + " " + socio.nombre + " " + socio.apellido + " " + socio.distrtio);
		}
		
		
		
		
		//lista de libros
		System.out.println("lista de libros");
		
		Libro lib1 = new Libro(104,"hola!"," juan", 12f, 300, 121);
		Libro lib2 = new Libro(105,"Las marabillas!"," Carlos", 25f, 300, 122);
		Libro lib3 = new Libro(106,"Retorno!"," Alberto", 45f, 300, 123);
		Libro lib4 = new Libro(107, "Quien se llevo mi queso!"," Andres", 18f, 300, 124);
		Libro lib5 = new Libro(108,"La vuelta al mundo en 80 dias!"," Jeronimo", 100, 320, 125);
		
		Set <Libro> listalibros = new HashSet<Libro>();
		
		listalibros.add(lib1);
		listalibros.add(lib2);
		listalibros.add(lib3);
		listalibros.add(lib4);
		
		for (Libro libro : listalibros) {
		System.out.println(libro.id + " "+  libro.titulo +" " + libro.autor + " " + libro.precio+" " + libro.nropag+ " "+ libro.nroisbn);
		}
		
		
		
		
		//lista audios
				System.out.println("lista de audios");
				
				Cintaudio aud1 = new Cintaudio(104,"Hola"," Carla",05f, "Peru", "los jardinez");
				Cintaudio aud2 = new Cintaudio(105,"Somos libres"," juan",06f,"Peru", "los jardinez");
				Cintaudio aud3 = new Cintaudio(106,"Solos"," Carlos",10f, "Peru", "los jardinez");
				Cintaudio aud4 = new Cintaudio(107, "JAJA"," alberto",08f, "Peru", "los jardinez");
				Cintaudio aud5 = new Cintaudio(108,"Musicas"," leon",02f, "Peru", "los jardinez");
				
				Set <Cintaudio> listaudios = new HashSet<Cintaudio>();
				
				listaudios.add(aud1);
				listaudios.add(aud2);
				listaudios.add(aud3);
				listaudios.add(aud4);
				listaudios.add(aud5);
				
				for (Cintaudio cintaudio : listaudios) {
					System.out.println(cintaudio.id + " " + cintaudio.titulo + " " + cintaudio.autor + " " + cintaudio.lugar + " " + cintaudio.direccion);
				}
		
				
				
			//	lista videos
				System.out.println("lista de videos");
				
				Cintavideo vid1 = new Cintavideo(104,"Hola"," Carla",05f, "Peru", " 40 minutos");
				Cintavideo vid2 = new Cintavideo(105,"Somos libres"," juan",06f,"Peru", "30 minutos");
				Cintavideo vid3 = new Cintavideo(106,"Solos"," Carlos",10f, "Peru", "15 minutos");
				Cintavideo vid4 = new Cintavideo(107, "llevanos"," alberto",08f, "Peru", "1 hora");
				Cintavideo vid5 = new Cintavideo(108,"Musicas"," leon",02f, "Peru", " 2 horas");
				
				Set <Cintavideo> listavideo = new HashSet<Cintavideo>();
				
				listavideo.add(vid1);
				listavideo.add(vid2);
				listavideo.add(vid3);
				listavideo.add(vid4);
				listavideo.add(vid5);
				
				
				for (Cintavideo cintavideo : listavideo) {
					System.out.println(cintavideo.id + " " + cintavideo.titulo + " " + cintavideo.autor + " " + cintavideo.precio + " " + cintavideo.actores + " " + cintavideo.duracion);
				}
				
			
				
				
				//libros prestados
				
				  byte contador=0;
				  float preciototal=0f;
				  for (Libro libro : listalibros) {
				  System.out.println(libro.id + " "+  libro.titulo +" " + libro.autor + " " + libro.precio+" " + libro.nropag+ " "+ libro.nroisbn);
				  contador++;
				  preciototal=preciototal + libro.precio;
				  
				  }
				  System.out.println("libros prestados " + contador);
				  System.out.println("monto acumulado " + preciototal);
				
		}

	

}
