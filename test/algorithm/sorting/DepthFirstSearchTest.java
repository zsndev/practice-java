package algorithm.sorting;

import org.junit.Test;

public class DepthFirstSearchTest {

    @Test
    public void dfs() throws Exception {
        DepthFirstSearch.dfs(0);
    }


    @Test
    public void dfsMap() throws Exception {
        DepthFirstSearch.dfsMap(new int[]{0, 0}, 0);
        System.out.println(DepthFirstSearch.minStep);
    }

}