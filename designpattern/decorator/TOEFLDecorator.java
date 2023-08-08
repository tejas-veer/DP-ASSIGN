import net.media.training.designpattern.decorator.Criteria;

public class TOFLDecorator implements Criteria{

    private Criteria criteria;

    public TOFLDecorator(Criteria criteria){
        this.criteria = criteria;
    }

    public boolean evaluate(Application app){
        if(criteria.evaluate(app)){
            return app.getToefl()>100;
        }else{
            return false;
        }
    }

}