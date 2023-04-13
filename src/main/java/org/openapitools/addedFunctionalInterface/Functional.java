package org.openapitools.addedFunctionalInterface;

import org.openapitools.addedClass.ManagedFreeableScope;

@FunctionalInterface
public interface Functional<In1, Out>{ // (In1) -> Out
    public Out callback(In1 in1);
}


