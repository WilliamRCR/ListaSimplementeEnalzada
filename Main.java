import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        

        int opcion = 0, elemento;
        Nodo nodo = new Nodo(1, null);
        ListaSimple listaSimplementeEnlazada = new ListaSimple(nodo);

        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                     1. Insertar al inicio
                     2. Insertar al Final
                     3. Recorrer                                                     
                     4. Buscar elemento                                                       
                     5. Borrar un elemento
                     6. Salir                                                                                                                                            
                     Menu de opciones                                                       """, "Menu de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));

                        switch(opcion){
                            case 1 -> {
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar elemento del nodo",
                                        "Agregar nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
                                        listaSimplementeEnlazada.AgregarCabeza(elemento);
                                break;
                            }
        
                            case 2 -> {
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar elemento del nodo",
                                        "Agregar nodo al final", JOptionPane.INFORMATION_MESSAGE));
                                        listaSimplementeEnlazada.AgregarAlFinal(elemento);
                                break;
                            }
        
                            case 3 -> {
                                listaSimplementeEnlazada.ImprimirElementos();
                                        
                                break;
                            }
        
                            case 4 -> {
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Buscar por valor",
                                        "Buscando por valor", JOptionPane.INFORMATION_MESSAGE));
                                        listaSimplementeEnlazada.Buscar(elemento);
                                        JOptionPane.showMessageDialog(null, "El elemento buscado es: " + listaSimplementeEnlazada.Buscar(elemento), 
                                        "Elemento encontrado", JOptionPane.INFORMATION_MESSAGE);       
                                break;
                            }
        
                            case 5 -> {
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Borrar elemento",
                                        "Borrando elemento del nodo", JOptionPane.INFORMATION_MESSAGE));
                                        listaSimplementeEnlazada.EliminarPorValor(elemento);
                                        JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento, 
                                        "Elemento encontrado", JOptionPane.INFORMATION_MESSAGE);  
                                break;
                            }
                            
                            case 6 -> {
                                JOptionPane.showMessageDialog(null, "Saliendo", "Fin", JOptionPane.INFORMATION_MESSAGE);
                                break;
                                
                               /* default:
                                    JOptionPane.showMessageDialog(null, "Opcion no disponible", "Error", JOptionPane.INFORMATION_MESSAGE);
                                    break;*/
                                    
                            }
                    }
                }while(opcion != 6);

        
        listaSimplementeEnlazada.AgregarCabeza(3);
        listaSimplementeEnlazada.AgregarCabeza(4);
        listaSimplementeEnlazada.AgregarAlFinal(10);
        listaSimplementeEnlazada.ImprimirElementos();
        listaSimplementeEnlazada.EliminarPorValor(10);
        listaSimplementeEnlazada.Buscar(3);
        listaSimplementeEnlazada.ImprimirElementos();
        //Colecciones();
    }

    public static void Colecciones(){
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(4);
        lista.add(60);
        lista.add(1);
        lista.add(10);
        for (int i = 0; i < lista.size() ; i++){
            System.out.println(lista.get(i));
        }
        Collections.sort(lista);
        System.out.println("Ordenada");
        for (int i = 0; i < lista.size() ; i++){
            System.out.println(lista.get(i));
        }

    }
}