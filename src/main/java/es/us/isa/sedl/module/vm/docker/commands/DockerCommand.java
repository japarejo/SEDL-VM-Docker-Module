/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.us.isa.sedl.module.vm.docker.commands;

import es.us.isa.sedl.core.configuration.ExperimentalTask;
import java.io.OutputStream;
import java.util.List;

/**
 *
 * @author japarejo
 */
public abstract class DockerCommand extends ExperimentalTask {
    public abstract List<String> run(OutputStream output);
}
