package org.openapitools.addedClass;

import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;

public class ManagedFreeableScope {
    private ArrayList<Freeable> scopeStack = new ArrayList<>();
    private boolean disposed = false;

    /**
     * Objects passed to this method will then be managed by the instance.
     *
     * @param freeable An object with a free function, or undefined. This makes it suitable for wrapping functions that
     * may or may not return a value, to minimise the implementation logic.
     * @returns The freeable object passed in, which can be undefined.
     */

    /**
     * Once the freeable objects being managed are no longer being accessed, call this method.
     */
    public void dispose() {
        if (this.disposed) return;
        for (Freeable resource : this.scopeStack) {
            // eslint-disable-next-line @typescript-eslint/no-explicit-any\
//           (resource as any)?.ptr === 0 || !resource?.free
            if (!ObjectUtils.isEmpty(resource)&&false) {
                continue;
            }
            if(resource!=null) resource.free();
        }
        this.disposed = true;
    }
}
