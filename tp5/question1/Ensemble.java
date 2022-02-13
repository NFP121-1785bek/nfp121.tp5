package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

    protected java.util.Vector<T> table = new java.util.Vector<T>();

    public int size() {
        return table.size();
    }

    public Iterator<T> iterator() {
        return table.iterator();
    }

    public boolean add(T t) {
        // à compléter pour la question1-1
        if(!table.contains(t)) {
            return table.add(t);
        }
        return false;
    }

    public Ensemble<T> union(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
        Ensemble<T> unionEnsemble = new Ensemble<T>();
        unionEnsemble.addAll(this);
        
        if (e != null) {
            unionEnsemble.addAll(e);
        } else {
            return unionEnsemble;
        }        
        
        return unionEnsemble;
    }

    public Ensemble<T> inter(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
        Ensemble<T> interEnsemble = new Ensemble<T>();
        interEnsemble.addAll(this);

        if (e != null) {
            interEnsemble.retainAll(e);
        } else {
            return interEnsemble;
        }
        
        return interEnsemble;
    }

    public Ensemble<T> diff(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
        Ensemble<T> diffEnsemble = new Ensemble<T>();
        diffEnsemble.addAll(this);
        diffEnsemble.removeAll(e);
        
        return diffEnsemble;
    }

    Ensemble<T> diffSym(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
        Ensemble<T> diffSymEnsemble = new Ensemble<T>();
        
        if(e != null) {
            diffSymEnsemble = this.union(e);
            diffSymEnsemble.removeAll(this.inter(e));
        } else {
            diffSymEnsemble.addAll(this);
            return diffSymEnsemble;
        }
            
        return diffSymEnsemble;
    }
    
}
