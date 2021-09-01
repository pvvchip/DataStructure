package ru.pvvchip;


import junit.framework.TestCase;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class ListClientExampleTest extends TestCase {

    @Test
    public void testListClientExample() {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        assertThat(list, instanceOf(LinkedList.class) );
    }
}