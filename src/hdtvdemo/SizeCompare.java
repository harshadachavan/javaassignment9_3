package hdtvdemo;
//We use the comparator method to compare the sizes of HDTV
import java.util.Comparator;

public class SizeCompare implements Comparator<HDTV>{
	
	@Override
    public int compare(HDTV e1, HDTV e2) {
        if(e1.getSize() > e2.getSize()){
            return 1;
        } else {
            return -1;
        }
    }

}
