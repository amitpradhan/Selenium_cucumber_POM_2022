import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;


@CucumberOptions( features={"src/test/resources/features/smoke"},
                    plugin = {"pretty", "html:target/cucumber_automation.html", "summary"} ,
                    dryRun = false,
                    monochrome = false,
                    snippets = CAMELCASE,
                    tags = "@parallel"
                   //tags = "@regression and not @basic"
////        tags = "@regression and  @smoke"
       )
public class CucumberTestNgRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
