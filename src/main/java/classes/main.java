/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classes;
import database.database;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class main {

    public static void main(String[] args) {
        //Pokemon(Numero, Nome, Tipo1, Tipo2?, vida, peso, altura, evolui)
            database bd = new database();
            
            Tipo pedra = bd.buscaTipo("Pedra");
            List tipos_do_pikachu = new ArrayList<>(List.of(bd.buscaTipo("Eletrico")));
            
            System.out.println(pedra.getFraquezas());
            
            Pokemon raichu = new Pokemon(26, "Raichu",tipos_do_pikachu, false);//Pedro Baleroni
            Pokemon pikachu = new Pokemon(25, "Pikachu",tipos_do_pikachu, raichu, 30, false);
            
            System.out.println(pikachu.getTipoFraquezas());
            
        }
}
