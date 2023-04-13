package org.openapitools.addedClass;


import org.openapitools.addedFunctionalInterface.Functional;

public class AutoFree<TReturn> {
    ManagedFreeableScope scope;
    Functional<ManagedFreeableScope,TReturn> callback;

    public AutoFree(Functional<ManagedFreeableScope,TReturn> callback) {
        this.callback = callback;
        this.scope = new ManagedFreeableScope();
    }

    public TReturn execute() {
        try {
            return this.callback.callback(this.scope);
        } finally {
            this.scope.dispose();
        }
    }
}
