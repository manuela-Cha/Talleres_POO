public class Taller_no_1{
    public static void main (String args[]){
        ProgramaEdades(9);
    }
     
    public static void ProgramaEdades(int Juan){
        int edadJuan = Juan;
        int edadAlberto = (2 * edadJuan) /3; 
        int edadAna = (4 *edadJuan) /3;
        int edadMama = edadAlberto + edadAna + edadJuan; 
        System.out.println("Edad Juan: " + edadJuan +", Edad Alberto: "+ edadAlberto + ", Edad Ana: "+ edadAna +", Edad mama: " +edadMama);
    }
}
