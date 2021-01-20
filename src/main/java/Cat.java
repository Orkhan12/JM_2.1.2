import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Cat {
    String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
