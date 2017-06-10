package ast;

import util.Environment;
import util.SemanticError;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by crist on 08/06/2017.
 */
public class VarDecNode implements Node {
    private String id;
    private Node type;

    public VarDecNode(String id, Node type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toPrint(String indent) {
        return null;
    }

    @Override
    public Node typeCheck() {
        return null;
    }

    @Override
    public String codeGeneration() {
        return null;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        //create result list
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();

        //env.offset = -2;
        HashMap<String,STentry> hm = env.symTable.get(env.nestingLevel);
        STentry entry = new STentry(env.nestingLevel,type, env.offset--); //separo introducendo "entry"

        if (hm.put(id,entry) != null)
            res.add(new SemanticError("Var id " + id + " already declared"));

        return res;    }
}