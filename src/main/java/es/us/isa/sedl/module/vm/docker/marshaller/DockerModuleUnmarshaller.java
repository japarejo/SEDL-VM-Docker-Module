/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.module.vm.docker.marshaller;

import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.core.ExtensionPointElement;
import es.us.isa.sedl.core.util.Error;
import es.us.isa.sedl.module.SEDLModuleUnmarshaller;
import es.us.isa.sedl.module.vm.docker.commands.VMStart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author japarejo
 */
public class DockerModuleUnmarshaller implements SEDLModuleUnmarshaller {

    public DockerModuleUnmarshaller() {
    }

    @Override
    public Collection<? extends Error> unmarshall(ExtensionPointElement element, Experiment experiment) {
        List<Error> errors=new ArrayList<Error>();
        int openParIndex=element.getContent().indexOf("(");
        int closeParIndex=element.getContent().indexOf(")");
        if(closeParIndex==-1)
            closeParIndex=element.getContent().length();
        String command=element.getContent().substring(0,openParIndex-1);
        String [] params=element.getContent().substring(openParIndex+1,closeParIndex-1).split(",");
        switch(command)
        {
            case "Start":
                errors.addAll(parseVMStart(params,element,experiment));
                break;
            case "Populate":
                errors.addAll(parseVMPopulate(params,element,experiment));
                break;            
            case "Stop":
                errors.addAll(parseVMStop(params,element,experiment));
                break;            
            case "Execute":
                errors.addAll(parseVMExecuteCommand(params,element,experiment));
                break;
            default:
                errors.add(new Error(element.getContext().getStart().getLine(), Error.ERROR_SEVERITY.ERROR, "Unrecognized Docker VM command!"));
            
        }
        return errors;
    }

    private List<Error> parseVMStart(String[] params, ExtensionPointElement element, Experiment experiment) {
        List<Error> result=new ArrayList<Error>();
        if(params.length==0)
            result.add(new Error(element.getContext().getStart().getLine(), Error.ERROR_SEVERITY.ERROR, "You Should provide a VM URL for download!"));
        else{
            VMStart vmStart=new VMStart(params[0]);
            
        }
        return result;
    }

    private List<Error>parseVMPopulate(String[] params, ExtensionPointElement element, Experiment experiment) {
        
        List<Error> result=new ArrayList<Error>();
        return result;
    }

    private List<Error> parseVMStop(String[] params, ExtensionPointElement element, Experiment experiment) {

        List<Error> result=new ArrayList<Error>();
        return result;
    }

    private List<Error> parseVMExecuteCommand(String[] params, ExtensionPointElement element, Experiment experiment) {
        List<Error> result=new ArrayList<Error>();
        return result;
    }
    
}
