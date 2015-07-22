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
public class ImageCommand extends DockerCommand
{
    private String repoURL;
    private String imageName;
    private String version;

    @Override
    public List<String> run(OutputStream output) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object createNewInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
