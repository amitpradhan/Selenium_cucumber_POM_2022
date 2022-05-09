//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.RunWith;
//
//import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
//
//
///**
// * In case of Parallel execution using Junit , the threads will be generated on the
// * basis of no of feature files and not on the basis of scenarios. Ti create threads
// * on the basis of scenarios , we can use TestNG runner.
// */
//@RunWith(Cucumber.class)
//@CucumberOptions( features={"src/test/resources/features/smoke"},
//                    plugin = {"pretty", "html:target/cucumber_automation.html", "summary"} ,
//                    dryRun = false,
//                    monochrome = false,
//                    snippets = CAMELCASE
////                    tags = "@datadriven_example"
//           //   tags = "@regression and not @basic")
////        tags = "@regression and  @smoke"
//       )
//public class CucumberJunitRunnerTest {
//}
