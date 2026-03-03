package com.example.metrics;

import java.io.Serial ;
import java.io.Serializable ;
import java.util.Collections ;
import java.util.HashMap ;
import java.util.Map ;
import java.io.ObjectStreamException ;

/**
 * INTENTION: Global metrics registry (should be a Singleton).
 *
 * TODO (student):
 *  1) Make it a proper lazy, thread-safe singleton (private ctor)
 *  2) Block reflection-based multiple construction
 *  3) Preserve singleton on serialization (readResolve)
 */
public class MetricsRegistry implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private volatile static MetricsRegistry INSTANCE ;
    private final Map<String, Long> counters = new HashMap<>() ;

    private MetricsRegistry() throws RuntimeException {

        if(INSTANCE!= null ) {
            throw new RuntimeException("Instance create with getInstance() Method " ) ;
        }
    }

    public static MetricsRegistry getInstance() throws RuntimeException {
        if (INSTANCE == null) {
            synchronized(MetricsRegistry.class )
            {
                if(INSTANCE== null ) {
                    INSTANCE = new MetricsRegistry() ;
                }
            }
        }
        return INSTANCE;
    }

    @Serial
    private Object readResolve() throws ObjectStreamException
    {
        return getInstance() ;
    }

    public synchronized void setCount(String key, long value) {
        counters.put(key, value) ;
    }

    public synchronized void increment(String key) {
        counters.put(key, getCount(key) + 1);
    }

    public synchronized long getCount(String key) {
        return counters.getOrDefault(key, 0L);
    }

    public synchronized Map<String, Long> getAll() {
        return Collections.unmodifiableMap(new HashMap<>(counters));
    }

    // TODO: implement readResolve() to preserve singleton on deserialization
}
