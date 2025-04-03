package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.pojos.Auto;
import persistencia.exceptions.RollbackFailureException;

public class ControladoraPersistencia {
    
    AutoJpaController autoJpaController = new AutoJpaController();
    
    public void insertarRegistro(Auto auto) {
        try {
            autoJpaController.create(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Auto> listarAutos() {
        return autoJpaController.findAutoEntities();
    }
    
    public void modificarRegistro(Auto auto) {
        try {
            autoJpaController.edit(auto);
        } catch (RollbackFailureException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
