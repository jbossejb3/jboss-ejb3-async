package org.jboss.ejb3.async.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jboss.ejb3.async.spi.AsyncInvocationId;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AsyncInvocationIdUUIDImplTest {

    @Test
    public void testWithConcurrentHashMap() {
        AsyncInvocationId uuid = new AsyncInvocationIdUUIDImpl();
        Map<AsyncInvocationId, Boolean> map = new ConcurrentHashMap<AsyncInvocationId, Boolean>();

        map.put(uuid, Boolean.TRUE);
        map.remove(uuid);

        assertTrue(map.isEmpty());
    }

}

