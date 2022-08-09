/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package entities;

/**
 *
 * @author Andrey Gheno Piekas <andreypiekas at https://github.com/andreypiekas>
 */
public enum TipoIngresso {
    
     PISTA(0.0), VIP(0.30), CAMAROTE(0.60);

    private Double taxaAdicional;
    
    
    public void imprimirValor(){
        
        
    }

    TipoIngresso(Double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    public Double getTaxaAdicional() {
        return taxaAdicional;
    }
    
}
