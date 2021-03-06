package com.tinkerpop.blueprints.impls.orient;

import com.tinkerpop.blueprints.Graph;
import org.hamcrest.core.AnyOf;
import org.hamcrest.core.IsEqual;
import org.junit.Assume;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Test suite for OrientDB graph implementation that uses Lightweight edges.
 * 
 * @author Luca Garulli (l.garulli--(at)--orientdb.com) (http://orientdb.com)
 */
@RunWith(JUnit4.class)
public class OrientGraphLightweightEdgesTestIT extends OrientGraphTest {
  public Graph generateGraph(final String graphDirectoryName) {
    OrientGraph graph = (OrientGraph) super.generateGraph(graphDirectoryName);
    graph.setUseLightweightEdges(true);
    graph.setUseClassForVertexLabel(false);
    return graph;
  }

}
