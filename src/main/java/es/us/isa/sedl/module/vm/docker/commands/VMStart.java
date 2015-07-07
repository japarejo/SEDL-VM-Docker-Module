/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.module.vm.docker.commands;

import java.io.OutputStream;
import java.util.List;

/**
 *
 * @author japarejo
 */
public class VMStart extends DockerCommand{

    public String imageURL;

    public VMStart(String imageURL) {
        this.imageURL = imageURL;
    }
    
    
    
    @Override
    public List<String> run(OutputStream output) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object createNewInstance() {
        return new VMStart(null);
    }
    
}
