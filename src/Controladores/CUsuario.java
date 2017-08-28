/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mauricio
 */
public class CUsuario {
    
    private static EntityManager manager;
    
    private static EntityManagerFactory emf;
    
    //Funcion para guardar al usuario creado en la BD
    public static void persistirUsuario(Usuario u){
        
        emf = Persistence.createEntityManagerFactory("MiEspotifyPU");
        
        manager = emf.createEntityManager();
        
        manager.getTransaction().begin();
        
        manager.persist(u);
        
        manager.getTransaction().commit();
        
        
    }
    
}
