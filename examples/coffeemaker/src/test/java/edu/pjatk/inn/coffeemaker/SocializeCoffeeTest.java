package edu.pjatk.inn.coffeemaker;
import edu.pjatk.inn.coffeemaker.impl.CoffeeMaker;
import edu.pjatk.inn.coffeemaker.impl.Inventory;
import edu.pjatk.inn.coffeemaker.impl.Recipe;
import edu.pjatk.inn.coffeemaker.Payment;
import edu.pjatk.inn.coffeemaker.SocializeCoffee.java;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sorcer.test.ProjectContext;
import org.sorcer.test.SorcerTestRunner;
import sorcer.service.ContextException;
import sorcer.service.Routine;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static sorcer.eo.operator.*;
import static sorcer.so.operator.eval;
import static sorcer.so.operator.exec;

@RunWith(SorcerTestRunner.class)
@ProjectContext("examples/coffeemaker")
public class SocializeCoffeeTest {
    private final static Logger logger = LoggerFactory.getLogger(SocializeCoffeeTest.class);

    @Test
    public void rateRecipeTest() throws Exeption{

        Task likeRecipe = task("likeRecipe", sig("likePrevioslyBought", SocializeCoffeeTest.class),
                context("likePrevioslyBought", inVal("arg/recipe"),
                        result("arg/is_successful"...)));

        Task dislikeRecipe = task("dislikeRecipe", sig("dislikePrevioslyBought", SocializeCoffeeTest.class),
                context("dislikePrevioslyBought", inVal("arg/recipe"),
                        result("arg/is_successful"...)));
    }

    @Test
    public void recommendRecipeTest() throws Exeption{
        Task reccomendRecipe = task("reccomendRecipe", sig("reccomendPrevioslyBought", SocializeCoffeeTest.class),
                context("recommendPrevioslyBought", inVal("arg/recipe","arg/recipient"),
                        result("arg/is_successful"...)));


    }

    @Test
    public void findRecipeTest() throws Exeption{
        ...
    }

    @Test
    public void payForYourselfTest() throws Exeption{
        ...
    }

    @Test
    public void giftCoffeeTest() throws Exeption{
        ...
    }


    @Test
    public void buyMostRecommended() throws Exeption{
        ...
    }
}

