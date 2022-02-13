package question1;

public class EnsembleTest extends junit.framework.TestCase {

    public void testUnion() {
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        question1.Ensemble<Integer> union = e1.union(e2);
        assertEquals(3, union.size());
        assertTrue(union.contains(2));
        assertTrue(union.contains(3));
        assertTrue(union.contains(4));
    }
    
    public void testAdd() {
        question1.Ensemble<Integer> e1;
        e1 = new question1.Ensemble<Integer>();
        e1.add(1);
        
        assertTrue(e1.size() == 1);
        assertTrue(e1.contains(1));
    }
    
        public void testIntersection(){
        question1.Ensemble<Integer> e1, e2;
        
        e1 = new question1.Ensemble<Integer>();
        e2 = new question1.Ensemble<Integer>();
        
        e1.add(9);
        e1.add(1);
        
        e2.add(8);
        e2.add(1);

        question1.Ensemble<Integer> intersect = e1.inter(e2);
        
        assertEquals(1,intersect.size());
        
        for(int num : new int[]{1}){
            assertTrue(intersect.contains(num));
        }
    }
    
    public void testDifference(){
        question1.Ensemble<Integer> e1, e2;
        
        e1 = new question1.Ensemble<Integer>();
        e2 = new question1.Ensemble<Integer>();
        
        e1.add(9);
        e1.add(8);
        e1.add(20);

        e2.add(2);
        e2.add(3);
        e2.add(20);
        
        question1.Ensemble<Integer> diff = e1.diff(e2);
        assertEquals(2,diff.size());
        
        for(int num : new int[]{8,9}){
            assertTrue(diff.contains(num));
        }
    }
    
    public void testDifferenceSym(){
        question1.Ensemble<Integer> e1, e2;
        
        e1 = new question1.Ensemble<Integer>();
        e2 = new question1.Ensemble<Integer>();
        
        e1.add(7);
        e1.add(6);
        e1.add(100);
        
        e2.add(6);
        e2.add(13);
        e2.add(100);
        
        question1.Ensemble<Integer> diffSym = e1.diffSym(e2);
        assertEquals(2,diffSym.size());
        
        for(int num : new int[]{7,13}){
            assertTrue(diffSym.contains(num));
        }
    }
}
