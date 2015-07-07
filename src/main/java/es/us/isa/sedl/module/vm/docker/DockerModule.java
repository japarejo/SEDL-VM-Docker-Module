/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.module.vm.docker;

import es.us.isa.sedl.module.vm.docker.marshaller.DockerModuleUnmarshaller;
import es.us.isa.sedl.module.vm.docker.marshaller.DockerModuleMarshaller;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import es.us.isa.sedl.core.Experiment;
import es.us.isa.sedl.jlibsedl.SerializationFormat;
import es.us.isa.sedl.module.BaseSEDLModule;
import es.us.isa.sedl.module.ExperimentTypeAnalysisOperationSpecification;
import es.us.isa.sedl.module.SEDLModuleMarshaller;
import es.us.isa.sedl.module.SEDLModuleUnmarshaller;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author japarejo
 */
public class DockerModule extends BaseSEDLModule{

   private static final Set<String> moduleNames=Sets.newHashSet("MV-Docker","Docker");
   private static final List<Class<? extends Experiment>> applicableExperimentTypes=Lists.newArrayList();

    public DockerModule() {
        super(moduleNames, applicableExperimentTypes);       
       this.getMarshallers().put(SerializationFormat.SEDL4People, new DockerModuleMarshaller());
       this.getUnmarshallers().put(SerializationFormat.SEDL4People, new DockerModuleUnmarshaller());
    }
   
   
    
}
