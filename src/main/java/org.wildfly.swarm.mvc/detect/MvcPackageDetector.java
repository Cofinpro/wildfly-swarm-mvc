package org.wildfly.swarm.mvc.detect;

import org.wildfly.swarm.spi.meta.PackageFractionDetector;

import javax.mvc.annotation.Controller;

public class MvcPackageDetector extends PackageFractionDetector {

    public MvcPackageDetector() {
        anyClassOf("javax.mvc.annotation.Controller");
    }

    public String artifactId() {
        return "mvc";
    }
}
