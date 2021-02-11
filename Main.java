[INFO] ------------------------------------------------------------------------
        [INFO] BUILD FAILURE
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time: 3.215s
        [INFO] Finished at: Thu Apr 16 09:32:46 CEST 2015
        [INFO] Final Memory: 30M/72M
        [INFO] ------------------------------------------------------------------------
        [ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.10:test (default-test) on project variant: There are test failures.
        [ERROR]
        [ERROR] Please refer to C:\Users\cschneid\Desktop\Projekt\workspaceCalc\Calculator\CalculatorModuleMain\target\surefire-reports for the individual test results.
        [ERROR] -> [Help 1]
        org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.10:test (default-test) on project variant: There are test failures.

        Please refer to C:\Users\cschneid\Desktop\Projekt\workspaceCalc\Calculator\CalculatorModuleMain\target\surefire-reports for the individual test results.
        at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:213)
        at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:153)
        at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:145)
        at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:84)
        at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:59)
        at org.apache.maven.lifecycle.internal.LifecycleStarter.singleThreadedBuild(LifecycleStarter.java:183)
        at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:161)
        at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:320)
        at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:156)
        at org.apache.maven.cli.MavenCli.execute(MavenCli.java:537)
        at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:196)
        at org.apache.maven.cli.MavenCli.main(MavenCli.java:141)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:601)
        at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:290)
        at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:230)
        at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:409)
        at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:352)
        Caused by: org.apache.maven.plugin.MojoFailureException: There are test failures.

        Please refer to C:\Users\cschneid\Desktop\Projekt\workspaceCalc\Calculator\CalculatorModuleMain\target\surefire-reports for the individual test results.
        at org.apache.maven.plugin.surefire.SurefireHelper.reportExecution(SurefireHelper.java:87)
        at org.apache.maven.plugin.surefire.SurefirePlugin.writeSummary(SurefirePlugin.java:641)
        at org.apache.maven.plugin.surefire.SurefirePlugin.handleSummary(SurefirePlugin.java:615)
        at org.apache.maven.plugin.surefire.AbstractSurefireMojo.executeAfterPreconditionsChecked(AbstractSurefireMojo.java:137)
        at org.apache.maven.plugin.surefire.AbstractSurefireMojo.execute(AbstractSurefireMojo.java:98)
        at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:101)
        at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:209)
        ... 19 more
        [ERROR]
        [ERROR]
        [ERROR] For more information about the errors and possible solutions, please read the following articles:
        [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException