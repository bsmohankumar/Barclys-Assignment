package com.barclays.baggage.main;

/**
* Created on 05/05/2018
* Graph.java
*
* @author Mohan Kumar BS
*/

public interface Graph<V, E> {

    Iterable<V> getNodes();

    int getOrder();

    Iterable<E> getLinks();

    int getSize();

    E getLink(V source, V target);

    boolean containsNode(V v);

    boolean containsLink(E e);
}
