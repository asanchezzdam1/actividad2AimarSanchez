package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego 
{

    private static final String PIEDRA = "piedra";
    private static final String PAPEL = "papel";
    private static final String TIJERAS = "tijeras";

    public static void main(String args[])
    {
        Jugador p1=new Jugador();
        Jugador p2=new Jugador();
        boolean finDeJuego=false;
        Integer rondasJugadas = 0;    // Número de rondas jugadas
        Integer exitosJugador1=p1.éxitos;
        Integer exitosJugador2=p2.éxitos;
        Integer empates = 0;
        String opcion_JUGADOR1, opcion_JUGADOR2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + rondasJugadas+" *********************\n");
            System.out.println("Numero de empates: "+ empates + "\n");
            opcion_JUGADOR1=p1.opcion_al_azar();
            System.out.println("Jugador 1: " + opcion_JUGADOR1+"\t Jugador 1 - Partidas ganadas: " + exitosJugador1);
            opcion_JUGADOR2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcion_JUGADOR2+"\t Jugador 2 - Partidas ganadas: " + exitosJugador2);
            
            if((opcion_JUGADOR1.equals(PIEDRA))&&(opcion_JUGADOR2.equals(PAPEL)))
            {
                System.out.println("Jugador 2 GANA");
                exitosJugador2 = ++p2.éxitos;
                
            }
            else if((opcion_JUGADOR1.equals(PAPEL))&&(opcion_JUGADOR2.equals(PIEDRA)))
            {
            	exitosJugador1 = ++p1.éxitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals(PIEDRA))&&(opcion_JUGADOR2.equals(TIJERAS)))
            {
            	exitosJugador1 = ++p1.éxitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals(TIJERAS))&&(opcion_JUGADOR2.equals(PIEDRA)))
            {
            	exitosJugador2 = ++p2.éxitos;
                System.out.println("Jugador 2 GANA");
            }
            else if((opcion_JUGADOR1.equals(TIJERAS))&&(opcion_JUGADOR2.equals(PAPEL)))
            {
            	exitosJugador1 = ++p1.éxitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals(PAPEL))&&(opcion_JUGADOR2.equals(TIJERAS)))
            {
            	exitosJugador2 = ++p2.éxitos;
                System.out.println("Jugador 2 GANA");
            }
            if(opcion_JUGADOR1==opcion_JUGADOR2)
            {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasJugadas++;
            if((p1.éxitos>=3)||(p2.éxitos>=3))
            {
            	finDeJuego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(finDeJuego!=true);
    }
}
/**
 *
 */
class Jugador{

    private static final String PIEDRA = "piedra";
    private static final String PAPEL = "papel";
    private static final String TIJERAS = "tijeras";

    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcion_al_azar()
    {
        String opcion="";
        Integer c = (int)(Math.random()*3);
        switch(c){
            case 0:
            	opcion= PIEDRA;
                break;
            case 1:
            	opcion= PAPEL;
                break;
            case 2:
            	opcion= TIJERAS;
        }
        return opcion;
    }
    public void setÉxitos() 
    {
        éxitos++;
    }
    public int getÉxitos() 
    {
        return(éxitos);
    }
    
    int éxitos;      // número de partidas ganadas
}
