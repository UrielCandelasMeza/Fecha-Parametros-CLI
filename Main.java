import java.util.Date;


public class Main {
  public static void main(String args[]) {

    Date fecha = new Date();

    var tempYear = fecha.getYear();
    var tempMonth = fecha.getMonth();


    if(args.length == 1) {
      fecha = new Date(tempYear, tempMonth, Integer.parseInt(args[0]));
    } else if (args.length == 2) {
      fecha = new Date(tempYear, Integer.parseInt(args[1]) - 1, Integer.parseInt(args[0]));
    } else if(args.length == 3) {
      fecha = new Date(Integer.parseInt(args[2]) - 1900, Integer.parseInt(args[1]) - 1, Integer.parseInt(args[0]));
    }

    var weekDay = fecha.getDay();
    var day = fecha.getDate();
    var month = fecha.getMonth();
    var year = fecha.getYear() + 1900;


    String[] diaSemana = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
    String[] mes = {
      "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
      "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    System.out.println("Hoy es " + diaSemana[weekDay] + " " + day + " de " + mes[month] + " de " + year);
  }

} 
