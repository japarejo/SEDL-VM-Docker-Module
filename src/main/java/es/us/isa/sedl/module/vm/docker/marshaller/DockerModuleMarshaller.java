/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.module.vm.docker.marshaller;

import es.us.isa.sedl.module.SEDLModuleMarshaller;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 *
 * @author japarejo
 */
public class DockerModuleMarshaller implements SEDLModuleMarshaller {

    public DockerModuleMarshaller() {
    }

    @Override
    public List write(Object extensionPointRealization, OutputStream os, String modulePrefix) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String asString(Object extensionPointRealization, String modulePrefix) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
