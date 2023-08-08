import net.media.training.designpattern.decorator.Criteria;

public class GREDecorator implements Criteria {

    private Criteria criteria;
    GREDecorator(Criteria criteria){
        this.criteria = criteria;
    }

    public boolean evaluate(Application app){
        if(criteria.evaluate(app)){
            System.out.println("Evaluating GRE...");
            return app.getGre()>1450;
        }else{
            return false;
        }

    }
}
