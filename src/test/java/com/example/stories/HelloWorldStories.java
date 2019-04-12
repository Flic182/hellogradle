package com.example.stories;

import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.HTML;
import static org.jbehave.core.reporters.Format.JSON;
import static org.jbehave.core.reporters.Format.TXT;

import java.util.List;

import com.github.valfirst.jbehave.junit.monitoring.JUnitReportingRunner;

import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;


import com.example.steps.HelloWorldSteps;

/**
 * This class is the test harness for all features in the project.  It outputs
 * pretty reports in HTML, JSON and XML formats for anything not tagged to be
 * ignored.
 *
 * @author Felicity Hughes
 * @since 10
 */
@RunWith(JUnitReportingRunner.class)
public class HelloWorldStories extends JUnitStories {
    public HelloWorldStories() {
        super();
        super.useConfiguration(
          new MostUsefulConfiguration().useStoryReporterBuilder(
                  new StoryReporterBuilder()
                          .withCodeLocation(CodeLocations.codeLocationFromPath(System.getProperty("jbehave.report.path")))
                          .withDefaultFormats()
                          .withFormats(CONSOLE, HTML, JSON, TXT)));
    }

    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new HelloWorldSteps());
    }

    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(
                CodeLocations.codeLocationFromClass(HelloWorldStories.class), "**/*.story", "");
    }
}
