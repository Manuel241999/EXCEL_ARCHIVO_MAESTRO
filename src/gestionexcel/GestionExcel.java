/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionexcel;
import Modelo.ModeloExcel;
import Vista.VistaExcel;
import Controlador.ControladorExcel;

/**
 *
 * @author ricardo
 */
public class GestionExcel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModeloExcel modeloE = new ModeloExcel();
        VistaExcel vistaE = new VistaExcel();
        ControladorExcel contraControladorExcel = new ControladorExcel(vistaE, modeloE);
        vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);
    }
    
}