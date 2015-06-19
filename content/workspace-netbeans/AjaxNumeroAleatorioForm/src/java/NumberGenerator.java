import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped; 

@ManagedBean
@RequestScoped
public class NumberGenerator {

    private int number;
    private int range;
    /**
     * Creates a new instance of NumberGenerator
     */
    public NumberGenerator() {
        range = 100;
        number = new Random().nextInt(range);
    }
    
    public int getNumber(){
        return number;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public int getRange(){
        return range;
    }
    
    public void setRange(int range){
        this.range = range;
    }
    
    public String randomize(){
        number = new Random().nextInt(range);
        return null;
    }
    
}
