package ast;

import java.util.ArrayList;

/**
 * Created by crist on 22/06/2017.
 */
public class MetNode extends FunNode {

    private Node self;

    public MetNode(String i, Node t, Node self) {
        super(i, t);
        this.self = self;
        parlist.add(0, self);
    }

}